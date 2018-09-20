package com.corporate.delivery.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "merchant")
public class Merchant {
	
	private Integer id;
	
	private String firstname;
	private String lastname;
	private String username;
	private String email;
	private String phone;
	private String password;
	
	private String address;
	private String city;
	private String state;
	private String zip;
	
	private String mrType;
	private String lastVisited;
	private String timeRange;
	private Integer areaLimit;
	
	private boolean active = true;
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name = "firstname", unique=true, nullable = false)
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	@Column(name = "lastname", unique=true, nullable = false)
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	@Column(name = "username", unique=true, nullable = false)
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Column(name = "Email", unique=true, nullable = false)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Column(name = "Phone", unique=true, nullable = false)
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Column(name = "password", unique=true, nullable = false)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Column(name = "Address", unique=true, nullable = false)
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Column(name = "city", unique=false, nullable = false)
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Column(name = "State", unique=true, nullable = false)
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	@Column(name = "zip", unique=true, nullable = false)
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}

	@Column(name = "mr_type", unique=true, nullable = false)
	public String getMrType() {
		return mrType;
	}
	public void setMrType(String mrType) {
		this.mrType = mrType;
	}
	
	@Column(name = "last_visited", unique=true, nullable = false)
	public String getLastVisited() {
		return lastVisited;
	}
	public void setLastVisited(String lastVisited) {
		this.lastVisited = lastVisited;
	}
	
	@Column(name = "timeRange", unique=true, nullable = false)
	public String getTimeRange() {
		return timeRange;
	}
	public void setTimeRange(String timeRange) {
		this.timeRange = timeRange;
	}
	
	@Column(name = "area_limit", unique=true, nullable = false)
	public Integer getAreaLimit() {
		return areaLimit;
	}
	public void setAreaLimit(Integer area_limit) {
		this.areaLimit = area_limit;
	}
	
	@Column(name = "active", unique=true, nullable = false)
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	 
}
