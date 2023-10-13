package com.example.apigatewayserver.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //Bean 컨테이너 내부에 메서드가 리턴하는 요소들을 적재.
public class FilterConfig {

////    @Bean
//    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder){
//        return  builder.routes() // 라우팅 정보 등록 시작지점
//                .route(r ->
//                           r.path("/first-service/**")
//                            .filters(f -> f.addRequestHeader("fsregh", "fshregv")
//                                    .addResponseHeader("fsresh", "fsreshv"))
//                            .uri("http://localhost:8001/")
//                ) //개별 라우팅 정보를 등록하는 route() 메서드
//
//                .route(r ->
//                        r.path("/second-service/**")
//                                .filters(f -> f.addRequestHeader("ssregh", "sshregv")
//                                        .addResponseHeader("ssresh", "ssreshv"))
//                                .uri("http://localhost:8002/")
//                ) //개별 라우팅 정보를 등록하는 route() 메서드
//
//                .build(); //라우팅 정보 등록 완료
//    }
}
