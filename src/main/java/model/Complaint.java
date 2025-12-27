package com.hostel.hostelmanagement.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "complaints")
public class Complaint {

    @Id
    private String id;
    private String tenantEmail;
    private String issue;
    private String status;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getTenantEmail() { return tenantEmail; }
    public void setTenantEmail(String tenantEmail) { this.tenantEmail = tenantEmail; }

    public String getIssue() { return issue; }
    public void setIssue(String issue) { this.issue = issue; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
