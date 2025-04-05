package com.e_HealthCare.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.Table;

import org.springframework.boot.context.properties.bind.Name;

@Entity
@Table(name = "PDETAILS")
@NamedNativeQuery(name = "Personal.findByNameNative", query = "select * from PDETAILS p where p.username like %?1", resultClass = Personal.class)
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
	public int getId() {
		return id;
	}
	public String getUsername() {
		return username;
	}
	public String getEmail() {
		return email;
	}
	public String getDob() {
		return dob;
	}
	public String getGender() {
		return gender;
	}
	public String getAddress() {
		return address;
	}
	public String getFathername() {
		return fathername;
	}
	public String getMothername() {
		return mothername;
	}
	public String getName() {
		return name;
	}
	public void setId(int pid) {
		this.id = pid;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public void setMothername(String mothername) {
		this.mothername = mothername;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Personal(int pid, String username, String email, String dob, String gender, String address, String fathername,
			String mothername, String name) {
		super();
		this.id = pid;
		this.username = username;
		this.email = email;
		this.dob = dob;
		this.gender = gender;
		this.address = address;
		this.fathername = fathername;
		this.mothername = mothername;
		this.name = name;
	}
	public Personal() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
