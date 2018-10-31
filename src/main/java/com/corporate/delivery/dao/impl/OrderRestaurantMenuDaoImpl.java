package com.corporate.delivery.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.corporate.delivery.dao.AbstractDao;
import com.corporate.delivery.dao.OrderRestaurantMenuDao;
import com.corporate.delivery.model.OrderRestaurantMenu;

@Repository("orderRestaurantMenuDao")
public class OrderRestaurantMenuDaoImpl extends AbstractDao<Integer,OrderRestaurantMenu> implements OrderRestaurantMenuDao {

	public List<OrderRestaurantMenu> getOrderRestaurantMenu(Integer id){
		Query query = this.getSession().createQuery("from OrderRestaurantMenu orm where orm.Id = " + new Integer(id));
		List<OrderRestaurantMenu> list = query.list();
		
		return list;
	}
	
	public List<OrderRestaurantMenu>getOrderRestaurantMenuDetail(Integer id){
		Criteria cr = getSession().createCriteria(OrderRestaurantMenu.class);
		cr.add(Restrictions.eq("orderRestaurantId", id));
		return cr.list();
	}
	
	public void insert(OrderRestaurantMenu orderRestaurantMenu){
		this.getSession().save(orderRestaurantMenu);
	}
	
	public void updateOrderRestaurantMenu(OrderRestaurantMenu orderRestaurantMenu){
		this.getSession().update(orderRestaurantMenu);
	}
	
	public void deleteOrderRestaurantMenu(OrderRestaurantMenu orderRestaurantMenu){
		this.getSession().delete(orderRestaurantMenu);
	}
	
	public void deleteOrderRestaurantMenu(Integer id){
		this.getSession().delete(id);
	}
	
}
