package com.example.demo.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
//    @PostMapping("/login")
//    public String loginPagePost(Authentication authentication){
//        if(authentication != null)
//            return "profile.xhtml";
//        return "login.xhtml";
//    }
    @GetMapping("/login")
    public String loginPage(){


        return "login.xhtml";
    }
}
