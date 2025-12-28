package com.hostel.hostelmanagement.repository;

import com.hostel.hostelmanagement.model.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends MongoRepository<Payment, String> {
    // You can add custom queries if needed later
}
