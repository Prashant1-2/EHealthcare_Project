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
@Table(name = "TEST_eHC")
@NamedNativeQuery(name = "Test.findByNameNative", query = "select * from TEST_eHC p where p.NAME=?1", resultClass = Test.class)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Test {

	@Id
	@GeneratedValue
	private int Tid;
	private String Tname;
	private String Descr;
	private int Amount;

}
