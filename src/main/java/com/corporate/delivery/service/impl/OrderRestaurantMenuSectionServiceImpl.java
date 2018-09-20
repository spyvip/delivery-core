package com.corporate.delivery.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.corporate.delivery.dao.OrderRestaurantMenuSectionDao;
import com.corporate.delivery.model.OrderRestaurantMenuSection;
import com.corporate.delivery.service.OrderRestaurantMenuSectionService;

@Service("orderRestaurantMenuSectionService")
public class OrderRestaurantMenuSectionServiceImpl implements OrderRestaurantMenuSectionService{

	@Autowired
	OrderRestaurantMenuSectionDao orderRestaurantMenuSectionDao;
	
	@Transactional(readOnly = true)
	public List<OrderRestaurantMenuSection> getOrderRestaurantMenuSection(Integer userId){
		return null;	
	}
	
	@Transactional
	public void insert(OrderRestaurantMenuSection orderRestaurantMenuSection) {
		orderRestaurantMenuSectionDao.insert(orderRestaurantMenuSection);
	}
	
	@Transactional
	public void updateOrderRestaurantMenuSection(OrderRestaurantMenuSection orderRestaurantMenuSection){
		orderRestaurantMenuSectionDao.updateOrderRestaurantMenuSection(orderRestaurantMenuSection);
	}
	
	
}
