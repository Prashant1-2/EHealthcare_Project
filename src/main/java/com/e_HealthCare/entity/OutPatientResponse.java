package com.e_HealthCare.entity;

public class OutPatientResponse {
	private String message;
	private int id;

	public OutPatientResponse() {
		super();
	}

	public OutPatientResponse(String message, int id) {
		super();
		this.message = message;
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
