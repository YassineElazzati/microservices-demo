package com.example.api_user_service;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public String getUsers() {
        return "👤 Hello depuis le user-service";
    }
}
