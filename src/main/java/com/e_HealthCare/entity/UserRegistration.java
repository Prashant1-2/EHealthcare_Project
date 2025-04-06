package com.e_HealthCare.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.Table;

@Entity
@Table(name = "USERREGISTRATION")
@NamedNativeQuery(name = "UserRegistration.findByNameNative", query = "select * from USERREGISTRATION p where p.username =?1", resultClass = UserRegistration.class)
public class UserRegistration {
	@Id
	@GeneratedValue
	private int ID;

	private String NAME;
	private String USERNAME;
	private String EMAIL;
	private String PASSWORD;
	private String ISADMIN;

	public String getISADMIN() {
		return ISADMIN;
	}

	public void setISADMIN(String iSADMIN) {
		this.ISADMIN = iSADMIN;
	}

	public UserRegistration() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserRegistration(int iD, String nAME, String uSERNAME, String eMAIL, String pASSWORD, String iSADMIN) {
		super();
		this.ID = iD;
		this.NAME = nAME;
		this.USERNAME = uSERNAME;
		this.EMAIL = eMAIL;
		this.PASSWORD = pASSWORD;
		this.ISADMIN = iSADMIN;
	}

	public int getID() {
		return ID;
	}

	public String getNAME() {
		return NAME;
	}

	public String getUSERNAME() {
		return USERNAME;
	}

	public String getEMAIL() {
		return EMAIL;
	}

	public String getPASSWORD() {
		return PASSWORD;
	}

	public void setID(int iD) {
		this.ID = iD;
	}

	public void setNAME(String nAME) {
		this.NAME = nAME;
	}

	public void setUSERNAME(String uSERNAME) {
		this.USERNAME = uSERNAME;
	}

	public void setEMAIL(String eMAIL) {
		this.EMAIL = eMAIL;
	}

	public void setPASSWORD(String pASSWORD) {
		this.PASSWORD = pASSWORD;
	}

}
