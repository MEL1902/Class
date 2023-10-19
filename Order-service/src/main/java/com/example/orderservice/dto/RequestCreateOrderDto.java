package com.example.orderservice.dto;


import com.example.orderservice.domain.Order;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter@Setter@NoArgsConstructor
@AllArgsConstructor@Builder@ToString
public class RequestCreateOrderDto {

    private Long id;

    private String orderId;

    private Long count;

    private LocalDateTime createAt;

    private String userId;

    private String productId;

    public Order toEntity(){
        return Order.builder()
                .orderId(UUID.randomUUID().toString())
                .count(this.count)
                .createAt(LocalDateTime.now())
                .userId(this.userId)
                .productId(this.productId)
                .build();
    }
}
