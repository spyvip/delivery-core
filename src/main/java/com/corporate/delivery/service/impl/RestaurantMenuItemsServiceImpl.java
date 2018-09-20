package com.corporate.delivery.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corporate.delivery.dao.RestaurantMenuItemsDao;
import com.corporate.delivery.model.MenuItems;
import com.corporate.delivery.service.RestaurantMenuItemsService;


@Service("restaurantMenuItemsService")
public class RestaurantMenuItemsServiceImpl implements RestaurantMenuItemsService{
	
	@Autowired
	RestaurantMenuItemsDao restaurantMenuItemsDao;
	
	public List<MenuItems> getMenuItems(Integer menuItemsId) {
		
		return restaurantMenuItemsDao.getMenuItems(menuItemsId);
	}

	public void insert(MenuItems menuItems) {
		
		restaurantMenuItemsDao.insert(menuItems);
		
	}

	public void updateMenuItems(MenuItems menuItems) {
		
		restaurantMenuItemsDao.updateMenuItems(menuItems);
		
	}

	public void deleteMenuItems(Integer menuItemsId) {
		
		restaurantMenuItemsDao.deleteMenuItems(menuItemsId);
		
	}

}
