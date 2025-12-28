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

    public Complaint() {}

    public Complaint(String tenantEmail, String issue, String status) {
        this.tenantEmail = tenantEmail;
        this.issue = issue;
        this.status = status;
    }

    public String getId() { return id; }
    public String getTenantEmail() { return tenantEmail; }
    public void setTenantEmail(String tenantEmail) { this.tenantEmail = tenantEmail; }
    public String getIssue() { return issue; }
    public void setIssue(String issue) { this.issue = issue; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
