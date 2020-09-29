package com.example.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
    @GetMapping("/")
    public String showHome(){
        return "home";
    }

    @GetMapping("/hello")
    public String helloWorld(Model model, String name) {
        model.addAttribute("name", name);
        return "hello";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String postHelloWorld(@ModelAttribute("name")String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }

    @GetMapping("/capitalize/{message}")
    public String capitalize(Model model, @PathVariable String message) {
        model.addAttribute("message", message.toUpperCase());
        return "capitalize";
    }
}
