package com.example.userservice.service;

import com.example.userservice.domain.User;
import com.example.userservice.dto.RequestCreateUserDto;
import com.example.userservice.dto.ResponseFindUserDto;
import com.example.userservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    //회원가입
    public void createUser(RequestCreateUserDto userDTO){
        //dto를 entity로 변경해주는 작업이 필요함

        User user = userDTO.toEntity();
        userRepository.save(user);

    }

    //uuid 기반으로 계정찾기
    public ResponseFindUserDto findUserByUuid(String uuid){
        User user = userRepository.findUserByUuid(uuid);
        return new ResponseFindUserDto(user);
    }
}