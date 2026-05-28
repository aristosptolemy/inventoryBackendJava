package com.example.inventory.controller;

//　確認用
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/")
    public String root() {
        return "Inventory backend is running";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}