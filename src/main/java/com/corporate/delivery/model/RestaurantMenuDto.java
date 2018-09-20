package com.corporate.delivery.model;

import java.util.List;

import com.corporate.delivery.model.order.OrderRestaurant;

public class RestaurantMenuDto {
	
	@SuppressWarnings("unused")
	private OrderRestaurant orderRestaurant;
	
	@SuppressWarnings("unused")
	private List<OrderRestaurantMenu> orderRestaurantMenus;
	
	
	
	public RestaurantMenuDto(OrderRestaurant orderRestaurant, List<OrderRestaurantMenu> orderRestaurantMenus) {
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

}
