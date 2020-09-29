package com.example.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@Controller
public class NumbersController {
    @GetMapping("/numbers/{num}")
    public String numberFacts(Model model, @PathVariable int num) {
        try {
            String urlString = "http://numbersapi.com/" + num;
            URL url = new URL(urlString);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String trivia = br.readLine();
            model.addAttribute("trivia", trivia);
        } catch (Exception e) {
            model.addAttribute("trivia", String.format("%d broke the machine.", num));
        }
        return "numbers";
    }
}
