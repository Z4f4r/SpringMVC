package com.zafar.springCourse.config.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
// @RequestMapping("/second") -> /second/exit
public class SecondController {
    @GetMapping("/exit")
    public String exit() {
        return "second/exit";
    }
}
