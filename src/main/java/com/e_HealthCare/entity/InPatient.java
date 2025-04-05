package com.e_HealthCare.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.Table;

@Entity
@Table(name = "E_HEALTHCARE_INPATIENT1")
@NamedNativeQuery(name = "InPatient.findByNameNative", query = "select * from E_HEALTHCARE_INPATIENT1", resultClass = InPatient.class)
public class InPatient {

	@Id
	@GeneratedValue
	@Column(name = "IPID")
	private int ipid;

	@Column(name = "IPADDRESS")
	private String ipaddress;

	@Column(name = "IPDOA")
	private String ipdoa;

	@Column(name = "IPDISEASE")
	private String ipdisease;

	@Column(name = "IPGENDER")
	private String ipgender;

	@Column(name = "IPMAIL")
	private String ipmail;

	@Column(name = "IPNAME")
	private String ipname;

	@Column(name = "IPPHONE")
	private String ipphone;

	@Column(name = "IPROOM")
	private Integer iproom;

	@Column(name = "USERNAME")
	private String username;

	@Column(name = "FLOOR")
	private Integer floor;

	public InPatient() {
		super();
	}

	public InPatient(int ipid, String ipaddress, String ipdoa, String ipdisease, String ipgender, String ipmail,
			String ipname, String ipphone, Integer iproom, String username, Integer floor) {
		super();
		this.username = username;
		this.floor = floor;
		this.ipid = ipid;
		this.ipaddress = ipaddress;
		this.ipdoa = ipdoa;
		this.ipdisease = ipdisease;
		this.ipgender = ipgender;
		this.ipmail = ipmail;
		this.ipname = ipname;
		this.ipphone = ipphone;
		this.iproom = iproom;
		this.username = username;
		this.floor = floor;
	}

	public int getIpid() {
		return ipid;
	}

	public void setIpid(int ipid) {
		this.ipid = ipid;
	}

	public String getIpaddress() {
		return ipaddress;
	}

	public void setIpaddress(String ipaddress) {
		this.ipaddress = ipaddress;
	}

	public String getIpdoa() {
		return ipdoa;
	}

	public void setIpdoa(String ipdoa) {
		this.ipdoa = ipdoa;
	}

	public String getIpdisease() {
		return ipdisease;
	}

	public void setIpdisease(String ipdisease) {
		this.ipdisease = ipdisease;
	}

	public String getIpgender() {
		return ipgender;
	}

	public void setIpgender(String ipgender) {
		this.ipgender = ipgender;
	}

	public String getIpmail() {
		return ipmail;
	}

	public void setIpmail(String ipmail) {
		this.ipmail = ipmail;
	}

	public String getIpname() {
		return ipname;
	}

	public void setIpname(String ipname) {
		this.ipname = ipname;
	}

	public String getIpphone() {
		return ipphone;
	}

	public void setIpphone(String ipphone) {
		this.ipphone = ipphone;
	}

	public Integer getIproom() {
		return iproom;
	}

	public void setIproom(Integer iproom) {
		this.iproom = iproom;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getFloor() {
		return floor;
	}

	public void setFloor(Integer floor) {
		this.floor = floor;
	}

}
