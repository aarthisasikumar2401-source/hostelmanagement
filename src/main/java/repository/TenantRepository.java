package com.hostel.hostelmanagement.repository;

import com.hostel.hostelmanagement.model.Tenant;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TenantRepository extends MongoRepository<Tenant, String> {
}
