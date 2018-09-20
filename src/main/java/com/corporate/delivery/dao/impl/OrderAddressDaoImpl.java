package com.corporate.delivery.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.corporate.delivery.dao.AbstractDao;
import com.corporate.delivery.dao.OrderAddressDao;

import com.corporate.delivery.model.order.OrderAddresses;

@Repository("orderAddressDao")
public class OrderAddressDaoImpl extends AbstractDao<Integer, OrderAddresses>implements OrderAddressDao{

	public List<OrderAddresses> getOrderAddress(Integer userId) {
		Query query = this.getSession().createQuery("from OrderAddresses up where up.userId = " + new Integer(userId));
		List<OrderAddresses> list = query.list();
		return list;
	}

	public void insert(OrderAddresses orderAddress) {
		this.getSession().save(orderAddress);
		
	}

	public void updateOrderAddress(OrderAddresses orderAddress) {
		this.getSession().update(orderAddress);
		
	}

	public void deleteOrderAddress(Integer userId) {
		this.getSession().delete(userId);
		
	}

}
