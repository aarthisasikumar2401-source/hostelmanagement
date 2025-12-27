package com.hostel.hostelmanagement.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "payments")
public class Payment {

    @Id
    private String id;

    private String tenantEmail;
    private String month;
    private int amount;
    private String status;

    public String getTenantEmail() { return tenantEmail; }
    public String getMonth() { return month; }
    public int getAmount() { return amount; }
    public String getStatus() { return status; }
}
