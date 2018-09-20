package com.corporate.delivery.dao;

import java.util.List;

import com.corporate.delivery.model.MenuSection;

public interface RestaurantMenuSectionItemsDao {

	
	List<MenuSection> getMenuSections(Integer menuId);
	
	public void insert(MenuSection menuSection) ;
	
	public void updateMenuSections(MenuSection menuSection);
	
	public void deleteMenuSection(Integer menuSectionId);	
}
