package com.e_HealthCare.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.e_HealthCare.entity.User;

public interface UserRepository extends JpaRepository<User, String>{
	
	//Repository interface for User entities. Extends JpaRepository for basic CRUD operation.
	//It manage User entities with String as the primary key data type.

	User findByUsernameString(String usernameString);
	
}
