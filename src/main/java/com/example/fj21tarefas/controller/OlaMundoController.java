
package com.example.fj21tarefas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OlaMundoController {

    @RequestMapping("/ola")
    public String home() {
        return "mundo";
    }

}
