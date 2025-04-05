package com.e_HealthCare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e_HealthCare.entity.Rooms;
import com.e_HealthCare.repository.RoomsRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Service
public class RoomsService {
	private static final Logger logger = LogManager.getLogger(RoomsService.class);

	@Autowired
	private RoomsRepository repository;

	public Rooms saveRoom(Rooms room) {
		logger.info("Saving room: {}", room);
		return repository.save(room);
	}

	public Rooms getRoomById(int id) {
		logger.info("Fetching room with ID: {}", id);
		return repository.findById(id).orElse(null);
	}

	public List<Rooms> getRooms() {
		logger.info("Fetching all rooms");
		return repository.findAll();
	}

	public Rooms updateRoom(Rooms room) {
		logger.info("Updating room: {}", room);
		return repository.save(room);
	}

	public String deleteRoom(int id) {
		logger.info("Deleting room with ID: {}", id);
		repository.deleteById(id);
		return "Room removed " + id;
	}
}
