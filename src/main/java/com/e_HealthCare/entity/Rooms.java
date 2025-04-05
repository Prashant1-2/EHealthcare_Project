package com.e_HealthCare.entity;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ROOMS_eHC")
@NamedNativeQuery(name = "Rooms.findByNameNative", query = "select * from ROOMS_eHC p where p.NAME=?1", resultClass = Rooms.class)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rooms {

	@Id
//	@GeneratedValue
	private int Rid;
	private String Status;
//private int Did;
	private int Rent;
	private int Floor;

}