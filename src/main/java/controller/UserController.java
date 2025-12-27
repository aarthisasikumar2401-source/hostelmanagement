package com.hostel.hostelmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user") // Class-level prefix
public class UserController {

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        model.addAttribute("name", "User Dashboard");
        return "user-dashboard"; // Make sure you have user-dashboard.html in templates
    }

    // Other UserController methods here
}
