## 📝 개요

* 프로젝트 기간 : 2025.03.13 ~ 2025.03.18
* 프로젝트 인원 : 1명
* 프로젝트 주제 : 비동기 주문 파이프라인 시스템 개발

## 📝 프로젝트 구조

```
src/
├── main/
│   ├── java/com/jwj/order/
│   │   ├── OrderApplication.java               
│   │   ├── controller/                         
│   │   │   ├── ItemController.java
│   │   │   ├── MemberController.java
│   │   │   └── OrderController.java
│   │   ├── domain/                            
│   │   │   ├── Address.java                   
│   │   │   ├── Category.java                  
│   │   │   ├── Delivery.java                  
│   │   │   ├── DeliveryStatus.java            
│   │   │   ├── Item.java                      
│   │   │   ├── Member.java                    
│   │   │   ├── Order.java                     
│   │   │   ├── OrderItem.java                 
│   │   │   └── OrderStatus.java               
│   │   ├── dto/                               
│   │   │   ├── ItemCreateRequest.java         
│   │   │   ├── MemberCreateRequest.java       
│   │   │   ├── MemberListDTO.java
│   │   │   ├── OrderCanceledRequest.java      
│   │   │   ├── OrderCreateRequest.java       
│   │   │   ├── OrderDto.java                  
│   │   │   ├── OrderItemDto.java              
│   │   │   ├── OrderItemRequest.java          
│   │   │   └── OrderListDTO.java              
│   │   ├── exception/                         
│   │   │   ├── LockAcquisitionException.java  
│   │   │   └── NotEnoughStockException.java   
│   │   ├── rabbitmq/                         
│   │   │   ├── LockRepository.java           
│   │   │   ├── OrderConsumer.java            
│   │   │   ├── OrderPublisher.java           
│   │   │   └── RabbitMqConfig.java           
│   │   ├── repository/                       
│   │   │   ├── ItemRepository.java           
│   │   │   ├── MemberRepository.java         
│   │   │   ├── OrderRepository.java          
│   │   │   ├── OrderRepositoryCustom.java    
│   │   │   ├── OrderRepositoryCustomImpl.java
│   │   │   └── OrderSearch.java              
│   │   ├── service/                         
│   │   │   ├── ItemService.java              
│   │   │   ├── MemberService.java            
│   │   │   └── OrderService.java             
│   │   └── util/                             
│   │       └── InitDb.java                   
│   └── resources/
│       └── application.yml                   
└── test/
    └── java/com/jwj/order/
        └── OrderApplicationTests.java        
```

## 📝 고성능 주문 파이프라인 구축을 위해 공부했던 내용 정리

* RabbitMQ 메시지 아키텍처를 정리하면 아래와 같이 Exchange, Binding, Queue로 구성됩니다.

![image](https://github.com/user-attachments/assets/a8bb3262-a2ab-4e0c-96fe-6b4a690572cf)

* 실시간으로 빠른 주문이 이루어지고 그에 따른 재고 반영과 알림 발송을 비동기로 처리하기 위해서는 지정된 대기열로부터 여러 컨슈머가 경쟁 소비자 패턴을 적용하는 것이 논리적으로 맞다고 생각했습니다.
* 작업 대기열을 사용하면 여러 컨슈머를 통해서 작업을 쉽게 병렬화할 수 있고 `prefetchCount`를 통해 작업 대기열에 있는 메시지를 한 번에 미리 가져와서 처리할 수 있어 성능 개선을 할 수 있을 것이라고 생각했습니다.

![image](https://github.com/user-attachments/assets/d07f91bf-0995-4ae4-921f-00897f894360)

* 위와 같이 경쟁 소비자 패턴을 적용한 후 하나의 컨슈머에서 미리 가져와 처리할 수 있는 메시지의 개수(prefetchCount)를 동적으로 조절해 성능 최적화를 유도할 수 있는 적정 시점을 찾아나가는 것이 중요하다는 사실을 파악했습니다.
* 이 때, 메시지가 소실되지 않도록 하기 위해 RabbitMQ는 메시지 확인**(message acknowledgments)**을 제공합니다. 컨슈머는 특정 메시지가 수신 및 처리되었으며 RabbitMQ가 이를 삭제할 수 있음을 RabbitMQ에게 알리기 위해 확인 메시지를 보냅니다.
* 컨슈머가 ACK를 보내지 않고 죽게 된다면(채널이 닫히거나, 연결이 끊기거나, TCP 커넥션이 끊기거나), RabbitMQ는 메시지가 완전히 처리되지 않았음을 이해하고 다시 대기열에 올리게 됩니다. 경쟁 소비자 패턴에 따라 만약 다른 컨슈머가 있다면 컨슈머가 작업을 하지 못하더라도 다른 컨슈머가 빠르게 다시 전달하기 때문에 메시지가 손실되지 않는 안정성을 구축할 수 있게 됩니다.
* `basicAck`설정을 하지 않게 되면 메시지가 컨슈머에게 전달은 되었으나 메시지 확인이 없기 때문에 RabbitMQ는 해당 메시지가 올바르게 처리되었다고 판단하지 않습니다. 그렇게 되면 RabbitMQ는 이 메시지들을 메모리에 계속 적재하게 되면 결국 메모리 누수가 발생하게 되는 것입니다.
* 메모리 누수를 방지하기 위해 메시지 처리 후, 반드시 ACK를 보내거나 처리할 수 없는 메시지는 Reject/Nack 처리를 해야 메모리 누수를 방지할 수 있습니다.
* 컨슈머가 제 기능을 못하더라도 작업이 소실되지 않으려면 `basicAck`를 설정해주면 되나 만약 RabbitMQ 서버가 중단되면 그래도 여전히 작업이 소실됩니다.
* RabbitMQ가 종료되거나 충돌하여 작업이 소실되는 것을 방지하기 위해서는 큐와 메시지가 모두 내구성을 갖추도록 해야 합니다.
* `durable` 옵션으로 영속성을 추가한다고 하더라도 모든 메시지의 영속성이 100% 보장되지 않습니다.
* 기본적으로 `basicQos` 옵션을 사용해서 `prefetchCount`를 설정하게 되는데 이 때, `prefetchCount` 기본값은 1입니다. 이 `prefetchCount=1`이 의미하는 것은 컨슈머가 동시에 처리할 수 있는 메시지의 양이 1개라는 의미입니다.

```
최적 prefetchCount = (컨슈머 수 x 쓰레드 수) + 예비 버퍼(허나, 시스템 환경에 따라서 달라진다.)
```
```
기본값 : prefetchCount = 1 → 컨슈머가 1개 메시지만 가져와서 CPU 활용도가 낮아집니다.
튜닝값 : prefetchCount = 10 → 컨슈머가 10개의 메시지를 미리 가져와 CPU 활용도가 높아집니다.
```

## 📕 구현 내용

* 사용자는 상품을 주문할 수 있다.

## 📗 기술 스택

![SpringBoot](https://img.shields.io/badge/SpringBoot-3.3.2-6DB33F?style=flat-square&logo=spring&logoColor=white)
![Java](https://img.shields.io/badge/Java-17-007396?style=flat-square&logo=java&logoColor=white)
![JPA](https://img.shields.io/badge/JPA-Hibernate-59666C?style=flat-square&logo=hibernate&logoColor=white)
![Lombok](https://img.shields.io/badge/Lombok-1.18.30-BC4521?style=flat-square&logo=lombok&logoColor=white)

### Testing
![JUnit5](https://img.shields.io/badge/JUnit5-5.10.1-25A162?style=flat-square&logo=junit5&logoColor=white)
![JMeter](https://img.shields.io/badge/JMeter-5.6-D22128?style=flat-square&logo=apache&logoColor=white)
![k6](https://img.shields.io/badge/k6-0.48.0-7D64FF?style=flat-square&logo=k6&logoColor=white)

### Messaging
![RabbitMQ](https://img.shields.io/badge/RabbitMQ-3.12-FF6600?style=flat-square&logo=rabbitmq&logoColor=white)

### Database
![MySQL](https://img.shields.io/badge/MySQL-8.0-4479A1?style=flat-square&logo=mysql&logoColor=white)

## 📘 k6 성능 테스트 결과

**[성과] - t3.small 인스턴스 기준**

- 가상 사용자(VUs) 1000명 부하를 발생시켜 테스트한 결과
    - 데이터 정합성 : 정확하게 상품 하나의 수량이 1000개 감소
    - TPS(Transaction Per Seconds) : 668.4/sec
    - Latency : 약 23ms
    - HTTP Request Failed : 0/s
- 가상 사용자(VUs) 2000명 부하를 발생시켜 테스트한 결과
    - 데이터 정합성 : 정확하게 상품 하나의 수량이 2000개 감소
    - TPS(Transaction Per Seconds) : 1.34k/sec
    - Latency : 약 21ms
    - HTTP Request Failed : 0/s
- 가상 사용자(VUs) 4000명 부하를 발생시켜 테스트한 결과
    - 데이터 정합성 : 정확하게 상품 하나의 수량이 4000개 감소
    - TPS(Transaction Per Seconds) : 2.23k/s
    - Latency : 약 237ms
    - HTTP Request Failed : 0%

![image](https://github.com/user-attachments/assets/aadf9fd0-ace5-4600-b6bd-86b66c6ff234)

