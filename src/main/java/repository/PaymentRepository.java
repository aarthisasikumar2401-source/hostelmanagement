package com.hostel.hostelmanagement.repository;

import com.hostel.hostelmanagement.model.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PaymentRepository extends MongoRepository<Payment, String> {
}
