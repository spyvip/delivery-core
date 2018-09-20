package com.corporate.delivery.service;

import java.util.List;

import com.corporate.delivery.model.order.OrderRestaurant;

public interface OrderRestaurantService {

	public List<OrderRestaurant> getOrderRestaurant(Integer orderId);
	
	public List<OrderRestaurant>getOrderRestaurantDetail(Integer id);
	
	public void insert(OrderRestaurant orderRestaurant) ;
	
	public void updateOrderRestaurant(OrderRestaurant orderRestaurant);
	
	public void deleteOrderRestaurant(Integer orderId);
}
