package com.hostel.hostelmanagement.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.hostel.hostelmanagement.model.Tenant;

public interface TenantRepository extends MongoRepository<Tenant, String> {
}
