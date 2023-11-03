package com.example.itemservice.domain;

import java.time.LocalDateTime;

public class Order {
    private Long id;
    private String orderId;
    private Long count;
    private LocalDateTime creatAt;
    private String uerId;
    private String productId;
    private Long stock;
    private Long pricePerItem;
}
