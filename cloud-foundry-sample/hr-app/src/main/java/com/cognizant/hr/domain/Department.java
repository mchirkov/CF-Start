package com.cognizant.hr.domain;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Department {
	@Id
	private Integer id;
	private String name;
	private String businessUnit;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBusinessUnit() {
		return businessUnit;
	}
	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}
}
