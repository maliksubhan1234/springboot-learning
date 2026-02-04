package com.example.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {
    @GetMapping("/mvc")
    @ResponseBody
    public String home() {
        return "Spring MVC is Working";
    }
    
    
}
