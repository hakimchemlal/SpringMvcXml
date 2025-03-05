package com.springmvc.xml.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("/test")
    @ResponseBody
    public String home() {
        System.out.println("HomeController: home() method called"); // Pour debug
        return "home";
    }
}
