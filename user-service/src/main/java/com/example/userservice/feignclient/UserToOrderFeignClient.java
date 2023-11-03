package com.example.userservice.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//name : 유레카에 등록된 서비스명, path : 서비스 앞단에 붙는 접두어
@FeignClient(name="order-service") //order-service로 유레카에 등록된 서비스의
public interface UserToOrderFeignClient {

        @GetMapping("/orders/{userId}")  // orders/{userId}로 호출을 넣으면
        public ResponseEntity<?> getOrderListByUserId(@PathVariable String userId);  //요청을 처리해준다.
    }