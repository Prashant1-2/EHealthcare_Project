package com.e_HealthCare.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.Table;

@Entity
@Table(name = "APPOINTMENTDETAIL")
@NamedNativeQuery(name = "Appointment.findByNameNative", query = "select * from APPOINTMENTDETAIL", resultClass = Appointment.class)
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

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDocname() {
		return docname;
	}

	public void setDocname(String docname) {
		this.docname = docname;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPphone() {
		return pphone;
	}

	public void setPphone(String pphone) {
		this.pphone = pphone;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public String getPtype() {
		return ptype;
	}

	public void setPtype(String ptype) {
		this.ptype = ptype;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Appointment(int aid, int pid, String pname, String address, String docname, String date, String disease,
			String gender, String mail, String pphone, String room, String ptype, String username) {
		super();
		this.aid = aid;
		this.pid = pid;
		this.pname = pname;
		this.address = address;
		this.docname = docname;
		this.date = date;
		this.disease = disease;
		this.gender = gender;
		this.mail = mail;
		this.pphone = pphone;
		this.room = room;
		this.ptype = ptype;
		this.username = username;
	}

	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}