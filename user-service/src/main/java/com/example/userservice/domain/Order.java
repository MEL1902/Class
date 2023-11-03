package com.example.userservice.domain;

import lombok.*;
import org.springframework.validation.beanvalidation.SpringValidatorAdapter;

import java.time.LocalDateTime;

@Getter@Setter@AllArgsConstructor@NoArgsConstructor
@Builder@ToString
public class Order {
    private Long id;
    private String orderId;
    private Long count;
    private LocalDateTime creatAt;
    private String userId;

}
