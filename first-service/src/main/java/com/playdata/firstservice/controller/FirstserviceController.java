package com.playdata.firstservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("first-service") //gateway서버의 predicates의 식별 주소를 추가해야 합니다.
@RequiredArgsConstructor
public class FirstserviceController {

    private final Environment env;

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String hello(){
        return "Hello,First-service!";
    }

    @GetMapping("header-check")
    public String headerCheck(@RequestHeader("fsregh") String header) {
        return header;
    }

    @GetMapping("port-check")
    public String portCheck(){
        return env.getProperty("local.server.port");
    }
}
