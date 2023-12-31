package com.example.itemservice.utill;

import feign.Response;
import feign.codec.ErrorDecoder;

public class FeignException implements ErrorDecoder {
    @Override
    public Exception decode(String methodKey, Response response) {
        switch (response.status()){
            case 404:
                if (methodKey.contains("findOrderByItem")){
                    return new RuntimeException("해당 키값에 해당되는 자원이 존재하지 않습니다.");
                }
        }
        return new RuntimeException("분류되지 않은 에러입니다.");

    }
}
