package com.jwj.order.service;

import com.jwj.order.domain.Item;
import com.jwj.order.dto.ItemCreateRequest;
import com.jwj.order.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;

    // 상품 저장 비즈니스 로직
    @Transactional
    public void saveItem(ItemCreateRequest request) {

        Item item = Item.builder()
                .name(request.getName())
                .price(request.getPrice())
                .stockQuantity(request.getStockQuantity())
                .build();
        itemRepository.save(item);
    }
}
