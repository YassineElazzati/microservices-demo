package com.example.api_order_service;

import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @GetMapping
    public String getOrders() {
        return "📦 Hello depuis le order-service";
    }
}
