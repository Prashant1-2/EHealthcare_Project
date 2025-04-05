package com.e_HealthCare.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "USERREGISTRATION")
@NamedNativeQuery(name = "UserRegistration.findByNameNative", query = "select * from USERREGISTRATION p where p.username =?1", resultClass = UserRegistration.class)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRegistration {
	@Id
	@GeneratedValue
	private int ID;

	private String NAME;
	private String USERNAME;
	private String EMAIL;
	private String PASSWORD;
	private String ISADMIN;

}
