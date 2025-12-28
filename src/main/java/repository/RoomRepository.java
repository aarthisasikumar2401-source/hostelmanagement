package com.hostel.hostelmanagement.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.hostel.hostelmanagement.model.Room;

public interface RoomRepository extends MongoRepository<Room, String> {
}
