package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GatewayController {

    @GetMapping("/api/my-service/hello")
    public String myServiceHello() {
        return "Hello from My Service!";
    }

    @GetMapping("/api/another-service/hello")
    public String anotherServiceHello() {
        return "Hello from Another Service!";
    }
}
