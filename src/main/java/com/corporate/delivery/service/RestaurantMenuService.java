package com.corporate.delivery.service;

import java.util.List;

import com.corporate.delivery.model.Menu;

public interface RestaurantMenuService {

	public List<Menu> getRestaurantMenus(Integer menuId); 
	
	public void insertMenu(Menu menu) ;
	
	public void updateRestaurantMenus(Menu menu);
	
	public void deleteRestaurantMenus(Integer menuId);
	
}
