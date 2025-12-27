package com.hostel.hostelmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/dashboard")
    public String dashboardPage() {
        return "dashboard";
    }

    @GetMapping("/complaint")
    public String complaintPage() {
        return "complaint";
    }

    @GetMapping("/payment")
    public String paymentPage() {
        return "payment";
    }

    @GetMapping("/room")
    public String roomPage() {
        return "room";
    }

    @GetMapping("/tenant")
    public String tenantPage() {
        return "tenant";
    }
}
