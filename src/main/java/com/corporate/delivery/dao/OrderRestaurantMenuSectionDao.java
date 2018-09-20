package com.corporate.delivery.dao;

import java.util.List;

import com.corporate.delivery.model.OrderRestaurantMenuSection;

public interface OrderRestaurantMenuSectionDao {

	public List<OrderRestaurantMenuSection> getOrderRestaurantMenuSection(Integer userId);
	
	public void insert(OrderRestaurantMenuSection OrderRestaurantMenuSection) ;
	
	public void updateOrderRestaurantMenuSection(OrderRestaurantMenuSection OrderRestaurantMenuSection);
	
}
