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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.e_HealthCare.entity.UserRegistration;
import com.e_HealthCare.service.UserRegistrationService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*")
public class UserRegistrationController {

	private static final Logger logger = LogManager.getLogger(UserRegistrationController.class);

	@Autowired
	private UserRegistrationService service;

	@PostMapping("/adUser")
	public UserRegistration addUser(@RequestBody UserRegistration user) {
		logger.info("Adding a new user: {}", user);
		return service.saveUser(user);
	}

	@PostMapping("/addUsers")
	public List<UserRegistration> addUsers(@RequestBody List<UserRegistration> users) {
		logger.info("Adding multiple users: {}", users);
		return service.saveUsers(users);
	}

	@GetMapping("/users")
	public List<UserRegistration> findAllUsers() {
		logger.info("Fetching all users");
		return service.getUsers();
	}

	@GetMapping("/userById/{id}")
	public UserRegistration findUserById(@PathVariable int id) {
		logger.info("Fetching user with ID: {}", id);
		return service.getUserById(id);
	}

	@GetMapping("/user/{name}")
	public UserRegistration findUserByName(@PathVariable String name) {
		logger.info("Fetching user with name: {}", name);
		return service.getUserByName(name);
	}

	@DeleteMapping("/delete/{id}")
	public String removeUser(@PathVariable int id) {
		logger.info("Deleting user with ID: {}", id);
		return service.removeUser(id);
	}

	@GetMapping("/username1/{username}")
	public UserRegistration findUserByUserName(@PathVariable String username) {
		logger.info("Fetching user with username: {}", username);
		return service.getUserByUserName(username);
	}
}