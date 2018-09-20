package com.corporate.delivery.dao.impl;

import java.util.List;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.corporate.delivery.dao.AbstractDao;
import com.corporate.delivery.dao.OrderStatusDao;
import com.corporate.delivery.model.order.OrderStatus;

@Repository("orderStatusDao")
public class OrderStatusDaoImpl extends AbstractDao<Integer, OrderStatus> implements OrderStatusDao{

	public List<OrderStatus> getOrderStatus(int userId) {
		Query query = this.getSession().createQuery("from OrderStatus us where us.userId = " + new Integer(userId));
		List<OrderStatus> list = query.list();
		return list;
	}

	public void insert(OrderStatus orderStatus) {
		this.getSession().save(orderStatus);
		
	}

	public void updateOrderStatus(OrderStatus orderStatus) {
		
		this.getSession().update(orderStatus);
	}

	public void deleteOrderStatus(OrderStatus orderStatus) {
		
		this.getSession().delete(orderStatus);
	}

}
