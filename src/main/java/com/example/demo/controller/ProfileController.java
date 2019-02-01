package com.example.demo.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfileController {
    @GetMapping(value = "/")
    public String getProfilePage(Authentication authentication){

        return "profile.xhtml";
    }
}
