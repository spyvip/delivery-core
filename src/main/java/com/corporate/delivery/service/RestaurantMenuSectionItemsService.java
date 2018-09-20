package com.corporate.delivery.service;

import java.util.List;

import com.corporate.delivery.model.MenuSection;

public interface RestaurantMenuSectionItemsService {

	
	List<MenuSection> getMenuSections(Integer menuId);
	
	public void insert(MenuSection menuSection) ;
	
	public void updateMenuSections(MenuSection menuSection);
	
	public void deleteMenuSection(Integer menuSectionId);	
}
