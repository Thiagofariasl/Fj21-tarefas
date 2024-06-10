package com.example.fj21tarefas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/home")
    public String index() {
        System.out.println("indo para index.jsp");
        return "index";
    }
}
