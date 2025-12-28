package com.hostel.hostelmanagement.controller;

import com.hostel.hostelmanagement.model.Payment;
import com.hostel.hostelmanagement.repository.PaymentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payments")
@CrossOrigin
public class PaymentRestController {

    private final PaymentRepository paymentRepository;

    public PaymentRestController(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    // Get all payments
    @GetMapping
    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    // Add new payment
    @PostMapping
    public Payment addPayment(@RequestBody Payment payment) {
        return paymentRepository.save(payment);
    }
}
