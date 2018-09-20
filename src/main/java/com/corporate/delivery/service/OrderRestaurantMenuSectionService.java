package com.corporate.delivery.service;

import java.util.List;

import com.corporate.delivery.model.OrderRestaurantMenuSection;

public interface OrderRestaurantMenuSectionService {

	public List<OrderRestaurantMenuSection> getOrderRestaurantMenuSection(Integer userId);
	
	public void insert(OrderRestaurantMenuSection OrderRestaurantMenuSection) ;
	
	public void updateOrderRestaurantMenuSection(OrderRestaurantMenuSection OrderRestaurantMenuSection);
	
	
}
