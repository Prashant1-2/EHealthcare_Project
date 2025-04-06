package com.e_HealthCare.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.e_HealthCare.entity.AuthenticationResponse;
import com.e_HealthCare.entity.UserCredentials;
import com.e_HealthCare.service.UserService;



@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class UserController {
	private static final Logger logger = LogManager.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    @PostMapping("/auth")
    public AuthenticationResponse authenticate(@RequestBody UserCredentials credentials) {
        // Authenticate the user
        boolean isAuthenticated = userService.authenticateUser(credentials.getInputusernameString(), credentials.getInputpasswordString());

        if (isAuthenticated) {
            // Check if the user is an admin based on the 'isadmin' column in the database
            boolean isAdmin = userService.isUserAdmin(credentials.getInputusernameString());
            if (isAdmin) {
            	logger.info("User {} is an admin", credentials.getInputusernameString());
                // If the user is an admin, route to admin API
                return new AuthenticationResponse("Admin API Access", credentials.getInputusernameString());
            } else {
            	logger.info("User {} is not an admin", credentials.getInputusernameString());
                // If the user is not an admin, route to user API
                return new AuthenticationResponse("User API Access", credentials.getInputusernameString());
            }
        } else {
        	logger.warn("Authentication failed for user {}", credentials.getInputusernameString());
            return new AuthenticationResponse("Authentication Failed", null);
        }
    }
}

