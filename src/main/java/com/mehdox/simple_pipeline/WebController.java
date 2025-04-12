package com.mehdox.simple_pipeline;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @GetMapping("/sayHello")
    public String sayHello() {
        return "Hello from The Spring Rest Controller";
    }
}
