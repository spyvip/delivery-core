package com.corporate.delivery.dao;

import java.util.List;

import com.corporate.delivery.model.Menu;

public interface RestaurantMenuDao {

	List<Menu> getRestaurantMenus(Integer menuId); 
	
	public void insert(Menu menu) ;
	
	public void updateRestaurantMenus(Menu menu);
	
	public void deleteRestaurantMenus(Integer menuId);
		
	
	
}
