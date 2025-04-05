package com.e_HealthCare.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "DOCTOR_EHC")
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "doctor_seq")
	@SequenceGenerator(name = "doctor_seq", sequenceName = "DOCTOR_SEQ", allocationSize = 1)
	@Column(name = "ID")
	private int id;

	@Column(name = "DOCNAME")
	private String docname;

	@Column(name = "DOCEXP")
	private int docexp;

	@Temporal(TemporalType.DATE)
	@Column(name = "AVAILFROM")
	private Date availfrom;

	@Temporal(TemporalType.DATE)
	@Column(name = "AVAILTO")
	private Date availto;

	@Column(name = "DOCDEP")
	private String docdep;

	@Column(name = "DOCDES")
	private String docdes;

	@Column(name = "SLOT1")
	private String slot1;

	@Column(name = "SLOT2")
	private String slot2;

	@Column(name = "SLOT3")
	private String slot3;

	@Column(name = "SLOT4")
	private String slot4;

	@Column(name = "SLOT5")
	private String slot5;

	@Column(name = "CONTACT")
	private String contact;

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Doctor(int id, String docname, int docexp, Date availfrom, Date availto, String docdep, String docdes,
			String slot1, String slot2, String slot3, String slot4, String slot5, String contact) {
		super();
		this.id = id;
		this.docname = docname;
		this.docexp = docexp;
		this.availfrom = availfrom;
		this.availto = availto;
		this.docdep = docdep;
		this.docdes = docdes;
		this.slot1 = slot1;
		this.slot2 = slot2;
		this.slot3 = slot3;
		this.slot4 = slot4;
		this.slot5 = slot5;
		this.contact = contact;
	}

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDocname() {
		return docname;
	}

	public void setDocname(String docname) {
		this.docname = docname;
	}

	public int getDocexp() {
		return docexp;
	}

	public void setDocexp(int docexp) {
		this.docexp = docexp;
	}

	public Date getAvailfrom() {
		return availfrom;
	}

	public void setAvailfrom(Date availfrom) {
		this.availfrom = availfrom;
	}

	public Date getAvailto() {
		return availto;
	}

	public void setAvailto(Date availto) {
		this.availto = availto;
	}

	public String getDocdep() {
		return docdep;
	}

	public void setDocdep(String docdep) {
		this.docdep = docdep;
	}

	public String getDocdes() {
		return docdes;
	}

	public void setDocdes(String docdes) {
		this.docdes = docdes;
	}

	public String getSlot1() {
		return slot1;
	}

	public void setSlot1(String slot1) {
		this.slot1 = slot1;
	}

	public String getSlot2() {
		return slot2;
	}

	public void setSlot2(String slot2) {
		this.slot2 = slot2;
	}

	public String getSlot3() {
		return slot3;
	}

	public void setSlot3(String slot3) {
		this.slot3 = slot3;
	}

	public String getSlot4() {
		return slot4;
	}

	public void setSlot4(String slot4) {
		this.slot4 = slot4;
	}

	public String getSlot5() {
		return slot5;
	}

	public void setSlot5(String slot5) {
		this.slot5 = slot5;
	}

}
