package com.e_HealthCare.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.e_HealthCare.entity.Rooms;
import com.e_HealthCare.service.RoomsService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/rooms")
public class RoomsController {

	 private static final Logger logger = LogManager.getLogger(RoomsController.class);

	    @Autowired
	    private RoomsService service;

	    @PostMapping("/addRoom")
	    public Rooms addRoom(@RequestBody Rooms room) {
	        logger.info("Adding a new room: {}", room);
	        return service.saveRoom(room);
	    }

	    @GetMapping("/Rooms")
	    public List<Rooms> findAllRooms() {
	        logger.info("Fetching all rooms");
	        return service.getRooms();
	    }

	    @GetMapping("/RoomById/{id}")
	    public Rooms findRoomById(@PathVariable int id) {
	        logger.info("Fetching room with ID: {}", id);
	        return service.getRoomById(id);
	    }

	    @PutMapping("/updaterooms/{id}")
	    public Rooms updateRoom(@RequestBody Rooms room) {
	        logger.info("Updating room: {}", room);
	        return service.updateRoom(room);
	    }

	    @DeleteMapping("/delete/{id}")
	    public String deleteRoom(@PathVariable int id) {
	        logger.info("Deleting room with ID: {}", id);
	        return service.deleteRoom(id);
	    }
}
