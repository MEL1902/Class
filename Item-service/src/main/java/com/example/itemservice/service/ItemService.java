package com.example.itemservice.service;

import com.example.itemservice.domain.Item;
import com.example.itemservice.dto.RequestCreateItemDto;
import com.example.itemservice.dto.ResponseOrderByItemDto;
import com.example.itemservice.feignclient.OrderFeignClient;
import com.example.itemservice.repository.ItemRepository;
import jakarta.persistence.criteria.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.server.ResponseStatusException;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;
    private final OrderFeignClient orderFeignClient;

    public void createItem(RequestCreateItemDto requestCreateItemDto){
        itemRepository.save(requestCreateItemDto.toEntity());
    }


    public ResponseOrderByItemDto findOrderByItem(String productId){
        // 1. 특정 유저 아이디를 가져옵니다.
            Item item = (Item) itemRepository.findItemByProductrId(productId)
                            .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
        ResponseOrderByItemDto itemDto = new ResponseOrderByItemDto(item);

        List<Order> orderList = orderFeignClient.getOrdersByItemId(productId);
        itemDto.setOrderList(orderList);

        return itemDto;

    }

}
