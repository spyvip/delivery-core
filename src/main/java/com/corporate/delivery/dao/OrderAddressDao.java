package com.corporate.delivery.dao;

import java.util.List;

import com.corporate.delivery.model.order.OrderAddresses;

public interface OrderAddressDao {
		
	public List<OrderAddresses> getOrderAddress(Integer userId);
	
	public void insert(OrderAddresses orderAddress) ;
	
	public void updateOrderAddress(OrderAddresses orderAddress);
	
	public void deleteOrderAddress(Integer userId);

}
