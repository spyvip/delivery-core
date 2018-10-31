package com.corporate.delivery.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.corporate.delivery.model.order.OrderHeader;

@Entity
@Table(name="ORDER_RESTAURANTS_MENU")
public class OrderRestaurantMenu {
	private Integer id;
	private Integer orderRestaurantId;
	
	private String menuName;
	private Integer quantity;
	private String description;
	
	private Double basePriceMenu;
	private Double restaurantPriceMenu;
	private Double salePriceMenu;
	private Double salePriceTax;
	
	/*private List<OrderRestaurantMenuSection> orderRestaurantMenuSection;*/
	
	@Id
	@GeneratedValue   
	@Column(name = "id", nullable = false) 
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name = "order_restaurants_id", nullable = false)
	public Integer getOrderRestaurantId() {
		return orderRestaurantId;
	}
	public void setOrderRestaurantId(Integer orderRestaurantId) {
		this.orderRestaurantId = orderRestaurantId;
	}
	
	@Column(name = "menu_name", nullable = false)
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	
	@Column(name = "quantity", nullable = false)
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	@Column(name = "description", nullable = false)
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Column(name = "base_price_menu", nullable = false)
	public Double getBasePriceMenu() {
		return basePriceMenu;
	}
	public void setBasePriceMenu(Double basePriceMenu) {
		this.basePriceMenu = basePriceMenu;
	}
	
	@Column(name = "restaurant_price_menu", nullable = false)
	public Double getRestaurantPriceMenu() {
		return restaurantPriceMenu;
	}
	public void setRestaurantPriceMenu(Double restaurantPriceMenu) {
		this.restaurantPriceMenu = restaurantPriceMenu;
	}
	
	@Column(name = "sales_price_menu", nullable = false)
	public Double getSalePriceMenu() {
		return salePriceMenu;
	}
	public void setSalePriceMenu(Double salePriceMenu) {
		this.salePriceMenu = salePriceMenu;
	}
	
	@Column(name = "sales_price_tax", nullable = false)
	public Double getSalePriceTax() {
		return salePriceTax;
	}
	public void setSalePriceTax(Double salePriceTax) {
		this.salePriceTax = salePriceTax;
	}
	
	/*@OneToMany(mappedBy = "orderRestaurantMenu", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	public List<OrderRestaurantMenuSection> getOrderRestaurantMenuSection() {
		return orderRestaurantMenuSection;
	} 
	public void setOrderRestaurantMenuSection(List<OrderRestaurantMenuSection> orderRestaurantMenuSection) {
		this.orderRestaurantMenuSection = orderRestaurantMenuSection;
	}*/
	
	 
	
}
