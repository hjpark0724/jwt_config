package dev.basker.jwt_config.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "Hello, JWT";
    }

    @GetMapping("/secure")
    public String secure() {
        return "this is secured!";
    }

}
