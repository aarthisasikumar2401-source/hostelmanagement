package com.hostel.hostelmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth") // Class-level prefix
public class AuthController {

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        model.addAttribute("name", "Admin Dashboard");
        return "dashboard"; // Make sure you have dashboard.html in templates
    }

    // Other AuthController methods here
}
