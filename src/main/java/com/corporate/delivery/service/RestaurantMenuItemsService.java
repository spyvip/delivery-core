package com.corporate.delivery.service;

import java.util.List;

import com.corporate.delivery.model.MenuItems;

public interface RestaurantMenuItemsService {
	

	List<MenuItems> getMenuItems(Integer menuItemsId);
	
	public void insert(MenuItems menuItems) ;
	
	public void updateMenuItems(MenuItems menuItems);
	
	public void deleteMenuItems(Integer menuItemsId);	
}
