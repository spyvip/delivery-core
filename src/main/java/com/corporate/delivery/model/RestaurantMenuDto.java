package com.corporate.delivery.model;

import java.util.List;

import com.corporate.delivery.model.order.OrderHeader;
import com.corporate.delivery.model.order.OrderRestaurant;

public class RestaurantMenuDto {
	
	
private OrderHeader orderHeader;
	
	@SuppressWarnings("unused")
	private OrderRestaurant orderRestaurant;
	
	@SuppressWarnings("unused")
	private List<OrderRestaurantMenu> orderRestaurantMenus;
	
	
	public RestaurantMenuDto(OrderRestaurant orderRestaurant, List<OrderRestaurantMenu> orderRestaurantMenus) {
		this.orderRestaurant = orderRestaurant;
		this.orderRestaurantMenus = orderRestaurantMenus;
	}
	
	public RestaurantMenuDto(OrderHeader orderHeader,OrderRestaurant orderRestaurant, List<OrderRestaurantMenu> orderRestaurantMenus) {
		this.orderHeader = orderHeader;
		this.orderRestaurant = orderRestaurant;
		this.orderRestaurantMenus = orderRestaurantMenus;
	}

	public OrderRestaurant getOrderRestaurant() {
		return orderRestaurant;
	}

	public void setOrderRestaurant(OrderRestaurant orderRestaurant) {
		this.orderRestaurant = orderRestaurant;
	}

	public List<OrderRestaurantMenu> getOrderRestaurantMenus() {
		return orderRestaurantMenus;
	}

	public void setOrderRestaurantMenus(List<OrderRestaurantMenu> orderRestaurantMenus) {
		this.orderRestaurantMenus = orderRestaurantMenus;
	}

	public OrderHeader getOrderHeader() {
		return orderHeader;
	}

	public void setOrderHeader(OrderHeader orderHeader) {
		this.orderHeader = orderHeader;
	}
	
}
