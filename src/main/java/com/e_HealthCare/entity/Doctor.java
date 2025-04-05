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
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "DOCTOR_EHC")
@Data
@NoArgsConstructor
@AllArgsConstructor
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

}
