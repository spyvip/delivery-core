package com.corporate.delivery.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.corporate.delivery.dao.AbstractDao;
import com.corporate.delivery.dao.OrderRestaurantMenuSectionDao;
import com.corporate.delivery.model.OrderRestaurantMenuSection;

@Repository("orderRestaurantMenuSection")
public class OrderRestaurantMenuSectionDaoImpl extends AbstractDao<Integer,OrderRestaurantMenuSection> implements OrderRestaurantMenuSectionDao{

	public List<OrderRestaurantMenuSection> getOrderRestaurantMenuSection(Integer menuId){
		
		return null;
	}
	
	public void insert(OrderRestaurantMenuSection orderRestaurantMenuSection) {
		this.getSession().save(orderRestaurantMenuSection);
	}
	
	public void updateOrderRestaurantMenuSection(OrderRestaurantMenuSection orderRestaurantMenuSection){
		this.getSession().update(orderRestaurantMenuSection);
	}
	
	
}
