package com.corporate.delivery.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Item")
public class Item {
	
	private Integer id;
	private String name;
	private String description;
	private Integer price;
	private String value;
	
	@Id
	@GeneratedValue
	@Column(name = "id") 
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name = "name") 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		this.value = name;
	}
	
	@Column(name = "description") 
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Column(name = "price") 
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	} 

}
