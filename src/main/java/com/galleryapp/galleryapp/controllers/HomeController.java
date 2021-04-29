package com.galleryapp.galleryapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    public HomeController(){}
    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "Vue Gallery App";
    }
}
