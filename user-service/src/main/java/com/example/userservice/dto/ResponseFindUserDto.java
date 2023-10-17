package com.example.userservice.dto;

import com.example.userservice.domain.User;
import lombok.*;

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

    public ResponseFindUserDto(User user) {
        this.id = user.getId();
        this.uuid = user.getUuid();
        this.email = user.getEmail();
        this.userId = user.getUserId();
        this.name = user.getName();
    }
}



