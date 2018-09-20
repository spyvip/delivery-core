package com.corporate.delivery.model;

import java.util.List;

public class OrderItemDesc {
	
	Integer id;
	Integer orderId;
	Integer restaurantId;
	Integer menuId;
	String menuName;
	Integer quantity;
	Integer subTotalPrice;
	//List<MenuSection> menuSections;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Integer getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(Integer restaurantId) {
		this.restaurantId = restaurantId;
	}
	public Integer getMenuId() {
		return menuId;
	}
	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	/*public List<MenuSection> getMenuSections() {
		return menuSections;
	}
	public void setMenuSections(List<MenuSection> menuSections) {
		this.menuSections = menuSections;
	}*/
	public Integer getSubTotalPrice() {
		return subTotalPrice;
	}
	public void setSubTotalPrice(Integer subTotalPrice) {
		this.subTotalPrice = subTotalPrice;
	}
	
	

}
