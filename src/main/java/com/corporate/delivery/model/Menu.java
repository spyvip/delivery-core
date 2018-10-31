package com.corporate.delivery.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
	
	private Boolean mon;	
	private Boolean tue;	
	private Boolean wed;	
	private Boolean thu;	
	private Boolean fri;	
	private Boolean sat;	
	private Boolean sun;
	
	
	private Boolean schedule;	
	
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
	
	@Column(name = "Mon", unique=true, nullable = false)
	public Boolean getMon() {
		return mon;
	}
	public void setMon(Boolean mon) {
		this.mon = mon;
	}
	
	@Column(name = "Tue", unique=true, nullable = false)
	public Boolean getTue() {
		return tue;
	}
	public void setTue(Boolean tue) {
		this.tue = tue;
	}
	
	@Column(name = "Wed", unique=true, nullable = false)
	public Boolean getWed() {
		return wed;
	}
	public void setWed(Boolean wed) {
		this.wed = wed;
	}
	
	@Column(name = "Thu", unique=true, nullable = false)
	public Boolean getThu() {
		return thu;
	}
	public void setThu(Boolean thu) {
		this.thu = thu;
	}
	
	@Column(name = "Fri", unique=true, nullable = false)
	public Boolean getFri() {
		return fri;
	}
	public void setFri(Boolean fri) {
		this.fri = fri;
	}
	
	@Column(name = "Sat", unique=true, nullable = false)
	public Boolean getSat() {
		return sat;
	}
	public void setSat(Boolean sat) {
		this.sat = sat;
	}
	
	@Column(name = "Sun", unique=true, nullable = false)
	public Boolean getSun() {
		return sun;
	}
	public void setSun(Boolean sun) {
		this.sun = sun;
	}
	
	@Column(name = "schedule", unique=true, nullable = false)
	public Boolean getSchedule() {
		return schedule;
	}
	public void setSchedule(Boolean schedule) {
		this.schedule = schedule;
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
