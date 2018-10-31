package com.corporate.delivery.dao.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.corporate.delivery.dao.AbstractDao;
import com.corporate.delivery.dao.RestaurantMenuDao;
import com.corporate.delivery.model.Menu;
import com.corporate.delivery.model.MenuSection;


@Repository("restaurantMenuDao")
public class RestaurantMenuDaoImpl  extends AbstractDao<Integer, Menu> implements RestaurantMenuDao{

	public List<Menu> getRestaurantMenus(Integer restaurantId) {
		
		Query query = this.getSession().createQuery("from Menu me where me.restaurantBustypeId = " + new Integer(restaurantId));
		List<Menu> list = query.list();
		return list;
	}
	
	public List<Menu> getScheduleRestaurantMenus(Integer restaurantId) {
		Query 	query = this.getSession().createQuery("from Menu me where me.restaurantBustypeId = " + new Integer(restaurantId) + " and " + "me.schedule = " + true);
		List<Menu> list = query.list();
		return list;
	}

	public void insert(Menu menu) {
		this.getSession().save(menu);
		
	}

	public void updateRestaurantMenus(Menu menu) {
		this.getSession().update(menu);
		
	}

	public void deleteRestaurantMenus(Integer menuId) {
		
		/*Query query = this.getSession().createQuery("from Menu up where up.menuId = " + new Integer(menuId));
		List<Menu> list = query.list();
		for(Menu menuSection : list){
			this.getSession().delete(menuSection);
		}*/
		
		Criteria cr = getSession().createCriteria(Menu.class);
		cr.add(Restrictions.eq("id", menuId));
		Menu menu = (Menu) cr.uniqueResult();
		this.getSession().delete(menu);
	}

}
