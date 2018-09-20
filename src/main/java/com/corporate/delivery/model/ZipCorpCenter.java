package com.corporate.delivery.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "zip_corp_center")
public class ZipCorpCenter {
	
	private Integer id;
	private String name;
	private Integer corpZipCode;
	private boolean active;
	
	@Id
	@GeneratedValue
	@Column(name = "id") 
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name = "name", unique=true, nullable = false)
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name = "corp_zipcode", unique=true, nullable = false)
	public Integer getCorpZipCode() {
		return corpZipCode;
	}
	
	public void setCorpZipCode(Integer corpZipCode) {
		this.corpZipCode = corpZipCode;
	}
	
	@Column(name = "active", nullable = false)
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	} 
	

	
	
}
