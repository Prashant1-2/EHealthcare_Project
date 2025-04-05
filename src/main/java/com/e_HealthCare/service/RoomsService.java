package com.e_HealthCare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e_HealthCare.entity.Rooms;
import com.e_HealthCare.repository.RoomsRepository;

@Service
public class RoomsService {
	@Autowired
	private RoomsRepository repository;

	public Rooms saveRoom(Rooms room) {
		return repository.save(room);
	}

	public Rooms getRoomById(int id) {
		return repository.findById(id).orElse(null);
	}

	public List<Rooms> getRooms() {

		return repository.findAll();
	}

	public Rooms updateRoom(Rooms room) {
		return repository.save(room);
	}

	public String deleteRoom(int id) {
		repository.deleteById(id);
		return "Room removed " + id;
	}

}
