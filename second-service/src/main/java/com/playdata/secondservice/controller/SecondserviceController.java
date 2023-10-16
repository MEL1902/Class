package com.playdata.secondservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("second-service")
@RequiredArgsConstructor
public class SecondserviceController {

    private final Environment env;

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String hello(){
        return "Hello,Second-service!"; }

        @GetMapping("port-check")
                public String portCheck(){
            return env.getProperty("local.server.port");
        }
    }