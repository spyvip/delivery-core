package com.corporate.delivery.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.corporate.delivery.dao.AbstractDao;
import com.corporate.delivery.dao.OrderItemsDao;
import com.corporate.delivery.model.order.OrderRestaurant;

@Repository("orderItemsDao")
public class OrderItemsDaoImpl extends AbstractDao<Integer, OrderRestaurant> implements OrderItemsDao{

	public List<OrderRestaurant> getOrderItems(Integer orderId) {
		Query query = this.getSession().createQuery("from OrderItems up where up.userId = " + new Integer(orderId));
		List<OrderRestaurant> list = query.list();
		return list;
	}
	
	public List<OrderRestaurant>getOrderRestaurantDetail(Integer id){
		Criteria cr = getSession().createCriteria(OrderRestaurant.class);
		cr.add(Restrictions.eq("orderId", id));
		return cr.list();
	}

	public void insert(OrderRestaurant orderItems) {
		this.getSession().save(orderItems);
	}

	public void updateOrderItems(OrderRestaurant orderItems) {
		this.getSession().update(orderItems);
	}

	public void deleteOrderItems(Integer orderId) {
		this.getSession().delete(orderId);
		
	}
	
	

}
