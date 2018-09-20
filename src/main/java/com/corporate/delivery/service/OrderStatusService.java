package com.corporate.delivery.service;

import java.util.List;

import com.corporate.delivery.model.order.OrderStatus;



public interface OrderStatusService {
	
	public List<OrderStatus> getOrderStatus(int userId);
	
	public void insert(OrderStatus orderStatus) ;
	
	public void updateOrderStatus(OrderStatus orderStatus);
	
	public void deleteOrderStatus(OrderStatus orderStatus);

}
