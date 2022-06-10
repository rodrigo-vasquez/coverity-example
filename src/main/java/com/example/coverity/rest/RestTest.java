package com.example.coverity.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestTest {

    @GetMapping("/")
    public String greetings() {
        return "Hi coverity!";
    }

}
