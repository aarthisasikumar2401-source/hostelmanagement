package com.hostel.hostelmanagement.repository;

import com.hostel.hostelmanagement.model.Room;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoomRepository extends MongoRepository<Room, String> {
}
