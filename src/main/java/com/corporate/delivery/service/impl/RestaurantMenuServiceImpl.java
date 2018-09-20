package com.corporate.delivery.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.corporate.delivery.dao.RestaurantMenuDao;
import com.corporate.delivery.model.Menu;
import com.corporate.delivery.service.RestaurantMenuService;

@Service("restaurantMenuService")
public class RestaurantMenuServiceImpl implements RestaurantMenuService {
	
	@Autowired
	RestaurantMenuDao restaurantMenuDao;

	@Transactional
	public List<Menu> getRestaurantMenus(Integer menuId) {
		return restaurantMenuDao.getRestaurantMenus(menuId);
	}

	@Transactional
	public void insertMenu(Menu menuId) {
		restaurantMenuDao.insert(menuId);
	}

	@Transactional
	public void updateRestaurantMenus(Menu menu) {
		restaurantMenuDao.updateRestaurantMenus(menu);
	}

	@Transactional
	public void deleteRestaurantMenus(Integer menuId) {
		restaurantMenuDao.deleteRestaurantMenus(menuId);
	}
	
}
