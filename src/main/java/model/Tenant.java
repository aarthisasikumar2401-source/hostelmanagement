package com.hostel.hostelmanagement.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tenants")
public class Tenant {

    @Id
    private String id;

    private String name;
    private String email;
    private String roomNumber;
    private String joiningDate;
    private String status;

    public String getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getRoomNumber() { return roomNumber; }
    public String getJoiningDate() { return joiningDate; }
    public String getStatus() { return status; }

    public void setId(String id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public void setRoomNumber(String roomNumber) { this.roomNumber = roomNumber; }
    public void setJoiningDate(String joiningDate) { this.joiningDate = joiningDate; }
    public void setStatus(String status) { this.status = status; }
}
