package com.hostel.hostelmanagement.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "rooms")
public class Room {

    @Id
    private String id;

    private String roomNumber;
    private String type;
    private int capacity;
    private int occupied;
    private int rent;
    private String status;

    public String getRoomNumber() { return roomNumber; }
    public String getType() { return type; }
    public int getCapacity() { return capacity; }
    public int getOccupied() { return occupied; }
    public int getRent() { return rent; }
    public String getStatus() { return status; }
}
