package com.corporate.delivery.model.order;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.corporate.delivery.model.OrderRestaurantMenu;

@Entity
@Table(name="ORDER_ITEMS")
public class OrderRestaurant {

	private Integer id;
	private Integer orderId;
	private Integer restaurantId ;
	private String restaurantName ;
	
	private Double baseRestaurantPrice;
	private Double restaurantPrice;
	private Double saleRestaurantPrice;
	private Double saleTax;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id", unique=true, nullable = false) 
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name = "order_id", unique=true, nullable = false) 
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	
	@Column(name = "restaurant_id", unique=true, nullable = false) 
	public Integer getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(Integer restaurantId) {
		this.restaurantId = restaurantId;
	}
	
	@Column(name = "base_restaurant_price", nullable = false) 
	public Double getBaseRestaurantPrice() {
		return baseRestaurantPrice;
	}
	public void setBaseRestaurantPrice(Double baseRestaurantPrice) {
		this.baseRestaurantPrice = baseRestaurantPrice;
	}
	

	@Column(name = "restaurant_price", unique=true, nullable = false) 
	public Double getRestaurantPrice() {
		return restaurantPrice;
	}
	public void setRestaurantPrice(Double restaurantPrice) {
		this.restaurantPrice = restaurantPrice;
	}
	
	@Column(name = "sales_restaurant_price", nullable = false) 
	public Double getSaleRestaurantPrice() {
		return saleRestaurantPrice;
	}
	public void setSaleRestaurantPrice(Double saleRestaurantPrice) {
		this.saleRestaurantPrice = saleRestaurantPrice;
	}
	
	
	@Column(name = "sales_restaurant_tax", nullable = false) 
	public Double getSaleTax() {
		return saleTax;
	}
	public void setSaleTax(Double saleTax) {
		this.saleTax = saleTax;
	}
	
	
	@Column(name = "restaurant_name",nullable = false)
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	
}
