package com.corporate.delivery.model.order;

import java.util.List;

import com.corporate.delivery.model.RestaurantMenuDto;

public class OrderProcess {
	
	OrderHeader orderHeader;
	OrderAddresses orderAddresses;
	List<RestaurantMenuDto> restaurantMenuDtos;
	OrderStatus orderStatus;
	
	public OrderProcess(OrderHeader orderHeader, List<RestaurantMenuDto> restaurantMenuDtos, OrderAddresses orderAddresses, OrderStatus orderStatus) {
		this.orderHeader = orderHeader;
		this.restaurantMenuDtos = restaurantMenuDtos;
		this.orderAddresses = orderAddresses;
		this.orderStatus = orderStatus;
	}

	
	public OrderHeader getOrderHeader() {
		return orderHeader;
	}
	public void setOrderHeader(OrderHeader orderHeader) {
		this.orderHeader = orderHeader;
	}

	
	public OrderAddresses getOrderAddresses() {
		return orderAddresses;
	}
	public void setOrderAddresses(OrderAddresses orderAddresses) {
		this.orderAddresses = orderAddresses;
	}

	public List<RestaurantMenuDto> getRestaurantMenuDtos() {
		return restaurantMenuDtos;
	}
	public void setRestaurantMenuDtos(List<RestaurantMenuDto> restaurantMenuDtos) {
		this.restaurantMenuDtos = restaurantMenuDtos;
	}
	
	/*
	public List<OrderRestaurant> getOrderRestaurants() {
		return orderRestaurants;
	}
	public void setOrderItems(List<OrderRestaurant> orderRestaurants) {
		this.orderRestaurants = orderRestaurants;
	}
	*/

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

}
