package com.e_HealthCare.entity;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.Table;

@Entity
@Table(name = "ROOMS_eHC")
@NamedNativeQuery(name = "Rooms.findByNameNative", query = "select * from ROOMS_eHC p where p.NAME=?1", resultClass = Rooms.class)
public class Rooms {

	@Id
//	@GeneratedValue
	private int Rid;
	private String Status;
//private int Did;
	private int Rent;
	private int Floor;

	public int getRid() {
		return Rid;
	}

	public void setRid(int rid) {
		Rid = rid;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public int getRent() {
		return Rent;
	}

	public void setRent(int rent) {
		Rent = rent;
	}

	public int getFloor() {
		return Floor;
	}

	public void setFloor(int floor) {
		Floor = floor;
	}

	public Rooms(int rid, String status, int rent, int floor) {
		super();
		Rid = rid;
		Status = status;
		Rent = rent;
		Floor = floor;
	}

	public Rooms() {
		super();
	}

}