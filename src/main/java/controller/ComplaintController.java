package com.hostel.hostelmanagement.controller;

import com.hostel.hostelmanagement.model.Complaint;
import com.hostel.hostelmanagement.repository.ComplaintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



import java.util.List;



@RestController
public class ComplaintController {

    @Autowired
    private ComplaintRepository repo;

    // Save complaint from website
    @PostMapping("/api/complaint")
    public Complaint addComplaint(@RequestBody Complaint complaint) {
        complaint.setStatus("OPEN");
        return repo.save(complaint);
    }

    // Fetch all complaints for display
    @GetMapping("/api/complaints")
    public List<Complaint> getComplaints() {
        return repo.findAll();
    }
}
