package com.jwj.order.util;

import com.jwj.order.domain.*;
import jakarta.annotation.PostConstruct;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.stream.IntStream;

import static com.jwj.order.domain.DeliveryStatus.READY;

@Component
@RequiredArgsConstructor
public class InitDb {

    private final InitService initService;

    @PostConstruct
    public void init() {
        initService.dbInit1();
        initService.dbInit2();
        initService.initMembers();
    }

    @Component
    @Transactional
    @RequiredArgsConstructor
    static class InitService {

        private final EntityManager em;

        public void dbInit1() {
            Item book1 = createItem("JPA1 BOOK", 10000, 10000);
            em.persist(book1);

            Item book2 = createItem("JPA2 BOOK", 20000, 10000);
            em.persist(book2);
        }

        public void dbInit2() {
            Item book1 = createItem("SPRING1 BOOK", 20000, 10000);
            em.persist(book1);

            Item book2 = createItem("SPRING2 BOOK", 40000, 10000);
            em.persist(book2);
        }

        public void initMembers() {
            IntStream.rangeClosed(1, 10000).forEach(i -> {
                String userName = "user" + i;
                String city = "City" + i;
                String street = String.valueOf(i);
                String zipcode = String.format("%04d", i);

                Member member = createMember(userName, city, street, zipcode);
                em.persist(member);
            });
        }

        private Member createMember(String name, String city, String street, String zipcode) {
            return Member.builder()
                    .name(name)
                    .address(new Address(city, street, zipcode))
                    .build();
        }

        private Item createItem(String name, int price, int stockQuantity) {
            return Item.builder()
                    .name(name)
                    .price(price)
                    .stockQuantity(stockQuantity)
                    .build();
        }

        private Delivery createDelivery(Member member) {
            Delivery delivery = new Delivery();
            delivery.setAddress(member.getAddress());
            delivery.setStatus(READY);
            return delivery;
        }
    }
}