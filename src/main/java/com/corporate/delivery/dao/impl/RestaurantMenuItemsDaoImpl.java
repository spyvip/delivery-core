package com.corporate.delivery.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import com.corporate.delivery.dao.AbstractDao;
import com.corporate.delivery.dao.RestaurantMenuItemsDao;
import com.corporate.delivery.model.MenuItems;


@Repository("restaurantMenuItemsDao")
public class RestaurantMenuItemsDaoImpl extends AbstractDao<Integer, MenuItems> implements RestaurantMenuItemsDao{

	public List<MenuItems> getMenuItems(Integer menuItemsId) {
		
		Query query = this.getSession().createQuery("from MenuItems mi where mi.id = " + new Integer(menuItemsId));
		List<MenuItems> list = query.list();
		return list;
	}

	public void insert(MenuItems menuItems) {
	
		this.getSession().save(menuItems);
	}

	public void updateMenuItems(MenuItems menuItems) {
		
		this.getSession().update(menuItems);
		
	}

	public void deleteMenuItems(Integer menuItemsId) {
		
		this.getSession().delete(menuItemsId);
		
	}

}
