package com.example.apiSpring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping()
public class Main {

    @GetMapping()
    public String home() {
        return "API 👌";
    }


}
