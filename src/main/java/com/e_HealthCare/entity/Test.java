package com.e_HealthCare.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.Table;

@Entity
@Table(name = "TEST_eHC")
@NamedNativeQuery(name = "Test.findByNameNative", query = "select * from TEST_eHC p where p.NAME=?1", resultClass = Test.class)
public class Test {

	@Id
	@GeneratedValue
	private int Tid;
	private String Tname;
	private String Descr;
	private int Amount;

	public Test(int tid, String tname, String descr, int amount) {
		super();
		Tid = tid;
		Tname = tname;
		Descr = descr;
		Amount = amount;
	}

	public String getDesc() {
		return Descr;
	}

	public void setDesc(String desc) {
		Descr = desc;
	}

	public int getAmount() {
		return Amount;
	}

	public void setAmount(int amount) {
		Amount = amount;
	}

	public int getTid() {
		return Tid;
	}

	public void setTid(int tid) {
		Tid = tid;
	}

	public String getTname() {
		return Tname;
	}

	public void setTname(String tname) {
		Tname = tname;
	}

	public Test() {
		super();
	}

}
