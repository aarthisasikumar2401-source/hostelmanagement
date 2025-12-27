package com.hostel.hostelmanagement.controller;

import com.hostel.hostelmanagement.model.Complaint;
import com.hostel.hostelmanagement.repository.ComplaintRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ComplaintController {

    private final ComplaintRepository complaintRepository;

    public ComplaintController(ComplaintRepository complaintRepository) {
        this.complaintRepository = complaintRepository;
    }

    @GetMapping("/api/complaints")
    public List<Complaint> getAllComplaints() {
        return complaintRepository.findAll();
    }
}
