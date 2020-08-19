package com.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jenkins")
public class Jenkins {

    @GetMapping
    public String message(){
        return "After configuring stop cluster the Update";
    }
}
