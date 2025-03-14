package com.jwj.order.controller;

import com.jwj.order.domain.Item;
import com.jwj.order.dto.ItemCreateRequest;
import com.jwj.order.repository.ItemRepository;
import com.jwj.order.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;
    private final ItemRepository itemRepository;

    // 상품 생성 REST API
    @PostMapping("/items/new")
    public ResponseEntity<Void> create(@RequestBody ItemCreateRequest request) {

        itemService.saveItem(request);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .build();
    }

    // 상품 목록 조회 REST API
    @GetMapping("/items/{itemId}")
    public ResponseEntity<Item> list(@PathVariable("itemId") Long itemId) {

        Item item = itemRepository.findById(itemId).orElse(null);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(item);
    }
}





