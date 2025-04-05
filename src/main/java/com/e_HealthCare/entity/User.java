package com.e_HealthCare.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//mapping of database
//Entity class representing the User entity in the database

@Entity
@Table(name = "USERREGISTRATION")
public class User {
	@Id
	@Column(name = "USERNAME", nullable = false)
	private String usernameString;

	@Column(name = "PASSWORD", nullable = false)
	private String passwordString;

	@Column(name = "ISADMIN") // Add this column for admin access
	private String isAdminString;

	// Default Constructor for User entity.
	// Contructor for creating a User entity with specified attributes.
	// Getters and Setters for the User entity's attributes.
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String usernameString, String passwordString, String isAdminString) {
		super();
		this.usernameString = usernameString;
		this.passwordString = passwordString;
		this.isAdminString = isAdminString;
	}

	public String getUsernameString() {
		return usernameString;
	}

	public void setUsernameString(String usernameString) {
		this.usernameString = usernameString;
	}

	public String getPasswordString() {
		return passwordString;
	}

	public void setPasswordString(String passwordString) {
		this.passwordString = passwordString;
	}

	public String getIsAdminString() {
		return isAdminString;
	}

	public void setIsAdminString(String isAdminString) {
		this.isAdminString = isAdminString;
	}

}
