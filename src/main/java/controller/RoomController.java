package com.hostel.hostelmanagement.controller;

import com.hostel.hostelmanagement.model.Room;
import com.hostel.hostelmanagement.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/room")
public class RoomController {

    @Autowired
    private RoomRepository roomRepository;

    // ✅ ADD ROOM
    @PostMapping("/add")
    public String addRoom(@ModelAttribute Room room) {
        roomRepository.save(room);
        return "<script>alert('Room added successfully');window.location.href='/room.html';</script>";
    }

    // ✅ DISPLAY ALL ROOMS (for fetch)
    @GetMapping("/all")
    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }
}
