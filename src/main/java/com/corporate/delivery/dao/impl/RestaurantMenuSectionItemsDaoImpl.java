package com.corporate.delivery.dao.impl;

import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.corporate.delivery.dao.AbstractDao;
import com.corporate.delivery.dao.RestaurantMenuSectionItemsDao;
import com.corporate.delivery.model.MenuItems;
import com.corporate.delivery.model.MenuSection;
import com.corporate.delivery.model.creditcard.UserPayment;


@Repository("restaurantMenuSectionDao")
public class RestaurantMenuSectionItemsDaoImpl extends AbstractDao<Integer, MenuSection> implements RestaurantMenuSectionItemsDao{

	public List<MenuSection> getMenuSections(Integer menuId) {
		
		Query query = this.getSession().createQuery("from MenuSection ms where ms.menuId = " + new Integer(menuId));
		List<MenuSection> list = query.list();
		
		return list;
	}

	public void insert(MenuSection menuSection) {
		this.getSession().save(menuSection);
		
	}

	public void updateMenuSections(MenuSection menuSection) {
		this.getSession().update(menuSection);
		
	}

	public void deleteMenuSection(Integer menuSectionId) {
		Criteria cr = getSession().createCriteria(MenuSection.class);
		cr.add(Restrictions.eq("id", menuSectionId));
		MenuSection menuSection = (MenuSection) cr.uniqueResult();
		this.getSession().delete(menuSection);
	}

}
