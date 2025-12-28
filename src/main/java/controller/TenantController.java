package com.hostel.hostelmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.hostel.hostelmanagement.model.Tenant;
import com.hostel.hostelmanagement.repository.TenantRepository;

@RestController
@RequestMapping("/tenant")
public class TenantController {

    @Autowired
    private TenantRepository tenantRepository;

    // Add tenant
    @PostMapping("/add")
    public Tenant addTenant(@RequestBody Tenant tenant) {
        return tenantRepository.save(tenant);
    }

    // Display all tenants
    @GetMapping("/all")
    public List<Tenant> getAllTenants() {
        return tenantRepository.findAll();
    }
}
