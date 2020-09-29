package com.example.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {
    @GetMapping("/")
    public String showHome(){
        return "home";
    }

    @GetMapping("/hello")
    public String helloWorld() {
        return "hello";
    }
    @GetMapping("/capitalize/{message}")
    public String capitalize(Model model, @PathVariable String message) {
        model.addAttribute("message", message.toUpperCase());
        return "capitalize";
    }
}
