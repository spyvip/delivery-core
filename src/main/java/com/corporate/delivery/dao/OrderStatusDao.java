package com.corporate.delivery.dao;

import java.util.List;

import com.corporate.delivery.model.order.OrderStatus;

public interface OrderStatusDao {

public List<OrderStatus> getOrderStatus(int userId);
	
	public void insert(OrderStatus orderStatus) ;
	
	public void updateOrderStatus(OrderStatus orderStatus);
	
	public void deleteOrderStatus(OrderStatus orderStatus);
}
