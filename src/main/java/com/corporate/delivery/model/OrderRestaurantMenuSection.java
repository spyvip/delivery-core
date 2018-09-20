package com.corporate.delivery.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ORDER_RESTAURANTS_MENU_SECTION")
public class OrderRestaurantMenuSection {
	
	private Integer id;
	private Integer orderRestaurantMenuId;
	private String name;
	private String value;
	
	private OrderRestaurantMenu orderRestaurantMenu;
	
	@Id
	@GeneratedValue   
	@Column(name = "id", nullable = false) 
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	/*@Column(name = "order_restaurant_menu_id", nullable = false)
	public Integer getOrderRestaurantMenuId() {
		return orderRestaurantMenuId;
	}*/
	/*public void setOrderRestaurantMenuId(Integer orderRestaurantMenuId) {
		this.orderRestaurantMenuId = orderRestaurantMenuId;
	}*/
	
	@Column(name = "name", nullable = false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name = "value", nullable = false)
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	@ManyToOne
    @JoinColumn(name = "order_restaurant_menu_id")
	public OrderRestaurantMenu getOrderRestaurantMenu() {
		return orderRestaurantMenu;
	}
	public void setOrderRestaurantMenu(OrderRestaurantMenu orderRestaurantMenu) {
		this.orderRestaurantMenu = orderRestaurantMenu;
	}
	
}
