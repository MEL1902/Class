package com.example.itemservice.dto;

import com.example.itemservice.domain.Item;
import com.example.itemservice.domain.Order;
import lombok.*;

import java.util.List;

@Getter@Setter@ToString
@Builder
@AllArgsConstructor@NoArgsConstructor
public class ResponseOrderByItemDto {

    private Long productPerItem;
    private Long id;
    private String productId;
    private String productName;
    private Long stock;
    private Long pricePerItem;
    private List<Order> orderList;

    public ResponseOrderByItemDto(Item item) {
        this.id = item.getId();
        this.productId = item.getProductId();
        this.productName = item.getProductName();
        this.stock = item.getStock();
        this. productPerItem = item.getPricePerItem();
    }

    public void setOrderList(List<jakarta.persistence.criteria.Order> orderList) {
    }
}
