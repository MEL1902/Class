package com.example.userservice.dto;

import com.example.userservice.domain.Order;
import com.example.userservice.domain.User;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class ResponseFindUserDto {

    //비밀번호 및 특정 정보를 제외한 정보조회
    private Long id;
    private String email;
    private String name;
    private String userId;
    private String uuid;

    // 필요하다면 구매내역을 같이 가져올 수 있도록 처리합니다.
    private List<Order> orderList;
    public ResponseFindUserDto(User user) {
        this.id = user.getId();
        this.uuid = user.getUuid();
        this.email = user.getEmail();
        this.userId = user.getUserId();
        this.name = user.getName();
    }
}



