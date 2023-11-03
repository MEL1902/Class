package com.example.itemservice.feignclient;

import jakarta.persistence.criteria.Order;
import lombok.Getter;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "ITEM-SERVICE", path="order-service")
public interface OrderFeignClient { //order-service 로 요청할 예정

    @GetMapping("/orders/{itemId}/products")
    public List<Order> getOrdersByItemId(@PathVariable String productId);


}
