package com.e_HealthCare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e_HealthCare.entity.Personal;
import com.e_HealthCare.entity.UserRegistration;
import com.e_HealthCare.repository.UserRegistrationRepository;

@Service
public class UserRegistrationService {

	@Autowired
	private UserRegistrationRepository repository;

	public UserRegistration saveUser(UserRegistration user) {
		return repository.save(user);
	}

	public List<UserRegistration> saveUsers(List<UserRegistration> users) {
		return repository.saveAll(users);
	}

	public List<UserRegistration> getUsers() {
		return repository.findAll();
	}

	public UserRegistration getUserById(int id) {
		return repository.findById(id).orElse(null);
	}

	public UserRegistration getUserByName(String name) {
		return repository.findByNameNative(name);
	}

	// public Product updateProduct(Product product) {return "" }

	public String removeUser(int id) {
		repository.deleteById(id);
		return "user removed !! " + id;
	}
	
	public UserRegistration getUserByUserName(String username) {return repository.findByUsername(username);
	}

}
