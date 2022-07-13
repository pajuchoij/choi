package com.example.choi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/a")
    public String abc(Model model) {
        model.addAttribute("x", "최준");
        return "hi";
    }

}
