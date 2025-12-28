package com.hostel.hostelmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String index() {
        return "redirect:/index.html";
    }

    @GetMapping("/dashboard")
    public String dashboard() {
        return "redirect:/dashboard.html";
    }

    @GetMapping("/payment")
    public String payment() {
        return "redirect:/payment.html";
    }

    @GetMapping("/complaint")
    public String complaint() {
        return "redirect:/complaint.html";
    }

    @GetMapping("/tenant")
    public String tenant() {
        return "redirect:/tenant.html";
    }

    @GetMapping("/room")
    public String room() {
        return "redirect:/room.html";
    }
}
