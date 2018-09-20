package com.corporate.delivery.service;

import java.util.List;

import com.corporate.delivery.model.order.OrderAddresses;
import com.corporate.delivery.model.order.OrderHeader;

public interface OrderAddressService {

	public List<OrderAddresses> getOrderAddress(Integer userId);
	
	public void insert(OrderAddresses orderAddress) ;
	
	public void updateOrderAddress(OrderAddresses orderAddress);
	
	public void deleteOrderAddress(Integer userId);
}
