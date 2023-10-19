package com.example.orderservice.domain;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
@Getter@Setter@Builder
@NoArgsConstructor
@AllArgsConstructor@ToString
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //DBA 에게서 전달 듣기로는 UUID 를 사용해서 PK 값을 설정 한다고함 특정 직군에서.
    private Long id;

    @Column(updatable = false)// 주문 코드 불변
    private String orderId;

    private Long count;

    @CreatedDate
    @Column(updatable = false) //가입 시간 불변
    private LocalDateTime createAt;
    //ToEntity 할때 안바꿔도됨

    private String userId;

    private String productId;

}