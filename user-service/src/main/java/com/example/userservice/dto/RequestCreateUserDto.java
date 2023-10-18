package com.example.userservice.dto;
import com.example.userservice.domain.User;
import jakarta.validation.constraints.*;
import lombok.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter @Setter @NoArgsConstructor
@AllArgsConstructor @Builder @ToString

public class RequestCreateUserDto {



    @Email
    private String email;

    @Size(min = 8, max = 20, message = "비밀번호는 최소8글자이고, 최대 20글자입니다.")
    private String pw;

//    @Min(value = 8, message = "비밀번호는 최소 8글자 입니다.")
//    @Max(value=20, message = "비밀번호는 최대 20글자입니다.")

    @NotNull
    private String name;

    @NotNull
    private String userId;

    public User toEntity() {

        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
//        bCryptPasswordEncoder.matches()
        return User.builder()
                .email(this.email)
                .encPw(bCryptPasswordEncoder.encode(this.pw))
                .name(this.name)
                .userId(this.userId)
                .uuid(UUID.randomUUID().toString())
                .createAt(LocalDateTime.now())
                .build();
    }

}
