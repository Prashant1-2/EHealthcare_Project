package com.e_HealthCare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import com.carelon.ehealthcare.springbootapp.Dao.UserRepository;
//import com.carelon.ehealthcare.springbootapp.entity.User;

import com.e_HealthCare.entity.User;
import com.e_HealthCare.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public boolean authenticateUser(String inputusernameString, String InputpasswordString) {
		User user = userRepository.findByUsernameString(inputusernameString);
		return user != null && user.getPasswordString().equals(InputpasswordString);
	}

	public boolean isUserAdmin(String InputemailString) {
		User user = userRepository.findByUsernameString(InputemailString);
		// Check if the 'isadmin' column is 'true' for the user in the database
		return user != null && "true".equalsIgnoreCase(user.getIsAdminString());
	}
}