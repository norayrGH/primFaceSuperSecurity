package com.example.demo.controller;


import com.example.demo.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @RequestMapping("/")
    public String index(){

        return "ok";
    }
    @RequestMapping("/users")
    public String users(){

        return "users";
    }
}
