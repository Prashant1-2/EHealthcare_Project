package com.e_HealthCare.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "PDETAILS")
@NamedNativeQuery(name = "Personal.findByNameNative", query = "select * from PDETAILS p where p.username like %?1", resultClass = Personal.class)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Personal {

	@Id
	@GeneratedValue
	@Column(name="ID")
	private int id;
	@Column(name="USERNAME")
	private String username;
	@Column(name="EMAIL")
	private String email;
	@Column(name="DOB")
	private String dob;
	@Column(name="GENDER")
	private String gender;
	@Column(name="ADDRESS")
	private String address;
	@Column(name="FATHERNAME")
	private String fathername;
	@Column(name="MOTHERNAME")
	private String mothername;
	@Column(name="NAME")
	private String name;
}
