package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class testController {

    @ResponseBody
    @RequestMapping("/demo")
    public String demo3(){
        return "demo";
    }
}
