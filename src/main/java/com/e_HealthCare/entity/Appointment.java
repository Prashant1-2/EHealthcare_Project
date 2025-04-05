package com.e_HealthCare.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "APPOINTMENTDETAIL")
@NamedNativeQuery(name = "Appointment.findByNameNative", query = "select * from APPOINTMENTDETAIL", resultClass = Appointment.class)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Appointment {

	@Id
	@Column(name = "AID")
	private int aid;

	@Column(name = "PID")
	private int pid;

	@Column(name = "PNAME")
	private String pname;

	@Column(name = "ADDRESS")
	private String address;

	@Column(name = "DOCNAME")
	private String docname;

	@Column(name = "APTDATE")
	private String date;

	@Column(name = "DISEASE")
	private String disease;

	@Column(name = "GENDER")
	private String gender;

	@Column(name = "MAIL")
	private String mail;

	@Column(name = "PPHONE")
	private String pphone;

	@Column(name = "ROOM")
	private String room;

	@Column(name = "PTYPE")
	private String ptype;

	@Column(name = "USERNAME")
	private String username;

}