package com.corporate.delivery.dao;

import java.util.List;

import com.corporate.delivery.model.order.OrderRestaurant;

public interface OrderItemsDao {
	
	public List<OrderRestaurant> getOrderItems(Integer orderId);
	
	public List<OrderRestaurant>getOrderRestaurantDetail(Integer id);
	
	public void insert(OrderRestaurant orderItems) ;
	
	public void updateOrderItems(OrderRestaurant orderItems);
	
	public void deleteOrderItems(Integer orderId);
}
