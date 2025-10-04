package org.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @RequestMapping("/")
    String hello() {
        return "hello world";
    }

    @RequestMapping("/home")
    String home(){
        return "home";
    }
}
