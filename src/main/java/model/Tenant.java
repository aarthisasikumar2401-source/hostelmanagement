package com.hostel.hostelmanagement.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tenants")
public class Tenant {

    @Id
    private String id;

    private String name;
    private String roomNumber;
    private String phone;
    private String email;

    public Tenant() {}

    public Tenant(String name, String roomNumber, String phone, String email) {
        this.name = name;
        this.roomNumber = roomNumber;
        this.phone = phone;
        this.email = email;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getRoomNumber() { return roomNumber; }
    public String getPhone() { return phone; }
    public String getEmail() { return email; }

    public void setId(String id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setRoomNumber(String roomNumber) { this.roomNumber = roomNumber; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setEmail(String email) { this.email = email; }
}
