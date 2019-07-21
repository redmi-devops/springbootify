package com.tom.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping(value = "/doit")
    public String getSomething(@Value("${favouriteFood:cabbage}") String favouriteFood) {
        return "Your favourite food is " + favouriteFood;
    }


}
