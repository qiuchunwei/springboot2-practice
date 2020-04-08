package com.firefly.hellofirefly.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloFireFlyController {

    @GetMapping("/hello")
    public String helloFireFly() {
        return "~~ @Hello,FireFly@ ~~";
    }

}
