package com.corporate.delivery.dao.impl;
 
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.corporate.delivery.dao.AbstractDao;
import com.corporate.delivery.dao.RestaurantDao;
import com.corporate.delivery.model.Menu;
import com.corporate.delivery.model.MenuSection;
import com.corporate.delivery.model.Restaurant;
 
@Repository("restaurantDao")
@SuppressWarnings("unchecked")
public class RestaurantDaoImpl extends AbstractDao<Integer, Restaurant> implements RestaurantDao {
 
    public Restaurant findById(int id) {
        return getByKey(id);
    }

    public List<Restaurant> getByZipcodeAndOrderType(Integer zipBustypeMerchantId) {
	    Criteria cr = getSession().createCriteria(Restaurant.class);
		cr.add(Restrictions.eq("zipBustypeMerchantId", zipBustypeMerchantId));
		return cr.list();
   }

   public List<Restaurant> getByTime(Integer zipBustypeMerchantId, String time) {
	    Criteria cr = getSession().createCriteria(Restaurant.class);
		cr.add(Restrictions.eq("zipBustypeMerchantId", zipBustypeMerchantId));
		List<Restaurant> l = cr.list();
		return l;
   }

   public void insert(Restaurant restaurant) {
	   this.getSession().save(restaurant);
   }

   public void updateRestaurant(Restaurant restaurant) {
	   this.getSession().update(restaurant);
   }

   public void deleteRestaurant(Integer id) {
	    
	   Query menuQuery = this.getSession().createQuery("from Menu up where up.restaurantBustypeId = " + new Integer(id));
	   List<Menu> menuList = menuQuery.list();
	   for(Menu menu : menuList){
		   Query sectionQuery = this.getSession().createQuery("from MenuSection up where up.menuId = " + menu.getId());
		   List<MenuSection> menuSectionList = sectionQuery.list();
		   for(MenuSection menuSection : menuSectionList){
			   this.getSession().delete(menuSection);
		   }
		   this.getSession().delete(menu);
	   }
		
	   Criteria cr = getSession().createCriteria(Restaurant.class);
	   cr.add(Restrictions.eq("id", id));
	   Restaurant restaurant = (Restaurant) cr.uniqueResult();
	   this.getSession().delete(restaurant);
   	}
}