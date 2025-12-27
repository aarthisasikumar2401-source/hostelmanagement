package com.hostel.hostelmanagement.repository;

import com.hostel.hostelmanagement.model.Complaint;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComplaintRepository extends MongoRepository<Complaint, String> {}
