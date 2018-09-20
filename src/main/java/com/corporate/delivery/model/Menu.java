package com.corporate.delivery.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "RESTAURANT_MENU")
public class Menu {
	private Integer id;	 
	private Integer restaurantBustypeId;	
	private Integer groupNumber;
	private String groupName;
	private Integer groupMenuNumber;
	private String name;	 
	private String description;	
	private String menuImage;	 	
	private Double basePrice;
	private Double salesPrice;
	private Double restaurantPrice;
	private Boolean active;	 
	
	//private List<MenuSection> sections;
 
	@Id
	@GeneratedValue   
	@Column(name = "id", nullable = false) 
	public Integer getId() {
		return id;
	}	
	public void setId(Integer id) {
		this.id = id;
	}
		
		
	@Column(name = "restaurant_bustypeId", unique=true, nullable = false)
	public Integer getRestaurantBustypeId() {
		return restaurantBustypeId;
	}	
	public void setRestaurantBustypeId(Integer restaurantBustypeId) {
		this.restaurantBustypeId = restaurantBustypeId;
	}
		
	@Column(name = "group_number", unique=true, nullable = false)
	public Integer getGroupNumber() {
		return groupNumber;
	}	
	public void setGroupNumber(Integer groupNumber) {
		this.groupNumber = groupNumber;
	}
		
	@Column(name = "group_name", unique=true, nullable = false)
	public String getGroupName() {
		return groupName;
	}	
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
		
	@Column(name = "group_menu_number", unique=true, nullable = false)
	public Integer getGroupMenuNumber() {
		return groupMenuNumber;
	}	
	public void setGroupMenuNumber(Integer groupMenuNumber) {
		this.groupMenuNumber = groupMenuNumber;
	}
		
	@Column(name = "name", unique=true, nullable = false)
	public String getName() {
		return name;
	}	
	public void setName(String name) {
		this.name = name;
	}
		
	@Column(name = "description", unique=true, nullable = false)
	public String getDescription() {
		return description;
	}	
	public void setDescription(String description) {
		this.description = description;
	}
		
	@Column(name = "menu_image", unique=true, nullable = false)
	public String getMenuImage() {
		return menuImage;
	}	
	public void setMenuImage(String menuImage) {
		this.menuImage = menuImage;
	}
		
	@Column(name = "base_price", unique=true, nullable = false)
	public Double getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(Double basePrice) {
		this.basePrice = basePrice;
	}

	@Column(name = "sales_price", unique=true, nullable = false)
	public Double getSalesPrice() {
		return salesPrice;
	}
	public void setSalesPrice(Double salesPrice) {
		this.salesPrice = salesPrice;
	}

	@Column(name = "restaurant_price", unique=true, nullable = false)
	public Double getRestaurantPrice() {
		return restaurantPrice;
	}

	public void setRestaurantPrice(Double restaurantPrice) {
		this.restaurantPrice = restaurantPrice;
	}

	@Column(name = "active", unique=true, nullable = false)
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	
	/*
	@OneToMany(mappedBy = "Menu", cascade = CascadeType.ALL)
	public List<MenuSection> getSections() {
		return sections;
	}
	public void setSections(List<MenuSection> sections) {
		this.sections = sections;
	}*/
	
}
