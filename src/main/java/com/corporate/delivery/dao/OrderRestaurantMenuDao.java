package com.corporate.delivery.dao;

import java.util.List;

import com.corporate.delivery.model.OrderRestaurantMenu;

public interface OrderRestaurantMenuDao {

	public List<OrderRestaurantMenu> getOrderRestaurantMenu(Integer userId);
	
	public List<OrderRestaurantMenu>getOrderRestaurantMenuDetail(Integer id);
	
	public void insert(OrderRestaurantMenu orderRestaurantMenu);
	
	public void updateOrderRestaurantMenu(OrderRestaurantMenu orderRestaurantMenu);
	
	public void deleteOrderRestaurantMenu(Integer userId);
	
}
