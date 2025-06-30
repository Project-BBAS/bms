package com.bbas.bms.controller;

import com.bbas.bms.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @GetMapping("/signup")
    public String getSignUpPage() {
        return "user/signup";
    }

    @PostMapping("/signup")
    public String registerUser() {
        return "redirect:/";
    }
}
