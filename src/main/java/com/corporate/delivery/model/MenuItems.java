package com.corporate.delivery.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "MENU_SECTION_ITEMS")
public class MenuItems {
	private Integer id;
	private Integer sectionId;
	private String itemName;
	private Integer price;
	
    private MenuSection menuSection;
    
	public MenuItems(){
		
	}

	@Id
	@GeneratedValue   
	@Column(name = "id", nullable = false) 
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public void setSectionId(Integer sectionId) {
		this.sectionId = sectionId;
	}
	
	@Column(name = "itemName", unique=true, nullable = false)
	public String getItemName() {
		return itemName;
	}
	
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	@Column(name = "price", unique=true, nullable = false)
	public Integer getPrice() {
		return price;
	}
	
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	public MenuItems(Integer id, Integer sectionId,String itemName, Integer price){
		this.id = id;
		this.sectionId=sectionId;
		this.itemName=itemName;
		this.price=price;
	}

	@ManyToOne
	@JoinColumn(name="sectionId", nullable=false )
	public MenuSection getMenuSection() {
		return menuSection;
	}

	public void setMenuSection(MenuSection menuSection) {
		this.menuSection = menuSection;
	}
	
}
