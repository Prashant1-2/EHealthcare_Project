package com.e_HealthCare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e_HealthCare.entity.Personal;
import com.e_HealthCare.repository.PersonalRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Service
public class PersonalService {

	private static final Logger logger = LogManager.getLogger(PersonalService.class);

	@Autowired
	private PersonalRepository repository;

	public Personal saveuser(Personal personal) {
		logger.info("Saving user: {}", personal);
		return repository.save(personal);
	}

	public List<Personal> saveusers(List<Personal> personals) {
		logger.info("Saving multiple users: {}", personals);
		return repository.saveAll(personals);
	}

	public List<Personal> getusers() {
		logger.info("Fetching all users");
		return repository.findAll();
	}

	public Personal getuserbyid(int id) {
		logger.info("Fetching user with ID: {}", id);
		return repository.findById(id).orElse(null);
	}

	public Personal updateuser(Personal personal) {
		logger.info("Updating user: {}", personal);
		return repository.save(personal);
	}

	public String deleteuser(int id) {
		logger.info("Deleting user with ID: {}", id);
		repository.deleteById(id);
		return "User removed: " + id;
	}

	public Personal getUserByUserName(String username) {
		logger.info("Fetching user with username: {}", username);
		return repository.findByUsername(username);
	}

	public Personal updateuserByUserName(Personal personal) {
		logger.info("Updating user: {}", personal);
		return repository.save(personal);
	}

}
