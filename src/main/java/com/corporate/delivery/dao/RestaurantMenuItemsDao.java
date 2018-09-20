package com.corporate.delivery.dao;

import java.util.List;

import com.corporate.delivery.model.MenuItems;

public interface RestaurantMenuItemsDao {

	List<MenuItems> getMenuItems(Integer menuItemsId);
	
	public void insert(MenuItems menuItems) ;
	
	public void updateMenuItems(MenuItems menuItems);
	
	public void deleteMenuItems(Integer menuItemsId);
}
