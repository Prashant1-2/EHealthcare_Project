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
@Table(name = "E_HEALTHCARE_INPATIENT1")
@NamedNativeQuery(name = "InPatient.findByNameNative", query = "select * from E_HEALTHCARE_INPATIENT1", resultClass = InPatient.class)
@Data
@NoArgsConstructor
@AllArgsConstructor
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

}
