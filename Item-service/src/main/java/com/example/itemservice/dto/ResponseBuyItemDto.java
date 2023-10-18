package com.example.itemservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter@Setter@NoArgsConstructor@AllArgsConstructor
public class ResponseBuyItemDto {
//아이템 및 특정 정보를 제외한 아이템 조회
    private String productId;
    private String productName;
    private Long stock;
    private Long pricePerItem;
    private String userId;
    private String orderId;

    // 필요하다면 아이템 내역을 같이 가져올 수 있도록 처리함.
//    private List<Item> itemList;
//
//    public ResponseBuyItemDto(Item item){
//        this.productId = item.getProductId();
//        this.productName = item.getProductName();
//        this.stock = item.getStock();
//        this.pricePerItem = item.getPricePerItem();
//        this.userId = item.getUserId();
//        this.orderId = item.getOrderId();
//    }

}
