package com.e_HealthCare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e_HealthCare.entity.User;
import com.e_HealthCare.repository.UserRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Service
public class UserService {

	 private static final Logger logger = LogManager.getLogger(UserService.class);

	    @Autowired
	    private UserRepository userRepository;

	    public boolean authenticateUser(String inputusernameString, String InputpasswordString) {
	        logger.info("Authenticating user with username: {}", inputusernameString);
	        User user = userRepository.findByUsernameString(inputusernameString);
	        boolean isAuthenticated = user != null && user.getPasswordString().equals(InputpasswordString);
	        logger.info("Authentication {} for user: {}", isAuthenticated ? "successful" : "failed", inputusernameString);
	        return isAuthenticated;
	    }

	    public boolean isUserAdmin(String InputemailString) {
	        logger.info("Checking if user with email: {} is admin", InputemailString);
	        User user = userRepository.findByUsernameString(InputemailString);
	        boolean isAdmin = user != null && "true".equalsIgnoreCase(user.getIsAdminString());
	        logger.info("User with email: {} is {}an admin", InputemailString, isAdmin ? "" : "not ");
	        return isAdmin;
	    }
}