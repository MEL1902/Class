package com.example.itemservice.dto;

import com.example.itemservice.domain.Item;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.UUID;

@Getter@Setter@NoArgsConstructor
@AllArgsConstructor@Builder@ToString
public class RequestCreateItemDto {

    //특정 아이템 조회??


    private String productName;
    @NotNull
    private Long stock;
    @NotNull
    private Long pricePerItem;


    //toEntity
    public Item toEntity() {
        return Item.builder()
                .productId(UUID.randomUUID().toString())
                .stock(this.stock)
                .productName(this.productName)
                .pricePerItem(this.pricePerItem)
                .build();

    }
}
