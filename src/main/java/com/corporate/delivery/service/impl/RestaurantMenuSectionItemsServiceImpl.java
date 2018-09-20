package com.corporate.delivery.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.corporate.delivery.dao.RestaurantMenuSectionItemsDao;
import com.corporate.delivery.model.MenuSection;
import com.corporate.delivery.service.RestaurantMenuSectionItemsService;

@Service("retaurantMenuSectionService")
public class RestaurantMenuSectionItemsServiceImpl implements RestaurantMenuSectionItemsService{

	@Autowired
	RestaurantMenuSectionItemsDao restaurantMenuSectionDao;
	
	@Transactional
	public List<MenuSection> getMenuSections(Integer menuId) {
		
		return restaurantMenuSectionDao.getMenuSections(menuId);
	}

	@Transactional
	public void insert(MenuSection menuSection) {
		restaurantMenuSectionDao.insert(menuSection);
		
	}

	@Transactional
	public void updateMenuSections(MenuSection menuSection) {
		restaurantMenuSectionDao.updateMenuSections(menuSection);
		
	}

	@Transactional
	public void deleteMenuSection(Integer menuSectionId) {
		restaurantMenuSectionDao.deleteMenuSection(menuSectionId);
		
	}

}
