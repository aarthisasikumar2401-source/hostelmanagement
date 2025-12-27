
package com.hostel.hostelmanagement.controller;

import com.hostel.hostelmanagement.model.Payment;
import com.hostel.hostelmanagement.repository.PaymentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    private final PaymentRepository paymentRepository;

    public PaymentController(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    // Get all payments
    @GetMapping
    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }
}
