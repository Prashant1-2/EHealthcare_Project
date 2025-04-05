package com.e_HealthCare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e_HealthCare.entity.UserRegistration;
import com.e_HealthCare.repository.UserRegistrationRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Service
public class UserRegistrationService {

	private static final Logger logger = LogManager.getLogger(UserRegistrationService.class);

	@Autowired
	private UserRegistrationRepository repository;

	public UserRegistration saveUser(UserRegistration user) {
		logger.info("Saving user: {}", user);
		return repository.save(user);
	}

	public List<UserRegistration> saveUsers(List<UserRegistration> users) {
		logger.info("Saving multiple users: {}", users);
		return repository.saveAll(users);
	}

	public List<UserRegistration> getUsers() {
		logger.info("Fetching all users");
		return repository.findAll();
	}

	public UserRegistration getUserById(int id) {
		logger.info("Fetching user with ID: {}", id);
		return repository.findById(id).orElse(null);
	}

	public UserRegistration getUserByName(String name) {
		logger.info("Fetching user with name: {}", name);
		return repository.findByNameNative(name);
	}

	public String removeUser(int id) {
		logger.info("Deleting user with ID: {}", id);
		repository.deleteById(id);
		return "User removed: " + id;
	}

	public UserRegistration getUserByUserName(String username) {
		logger.info("Fetching user with username: {}", username);
		return repository.findByUsername(username);
	}
}
