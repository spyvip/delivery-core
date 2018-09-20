package com.corporate.delivery.service.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.corporate.delivery.dao.OrderRestaurantMenuDao;
import com.corporate.delivery.model.OrderRestaurantMenu;
import com.corporate.delivery.service.OrderRestaurantMenuService;

@Service("orderRestaurantMenuService")
public class OrderRestaurantMenuServiceImpl implements OrderRestaurantMenuService {
	
	@Autowired
	OrderRestaurantMenuDao orderRestaurantMenuDao;
	
	@Transactional
	public List<OrderRestaurantMenu> getOrderRestaurantMenu(Integer id){
		return orderRestaurantMenuDao.getOrderRestaurantMenu(id);
	}
	
	@Transactional
	public List<OrderRestaurantMenu>getOrderRestaurantMenuDetail(Integer id){
		return orderRestaurantMenuDao.getOrderRestaurantMenuDetail(id);
	}
	
	@Transactional
	public void insert(OrderRestaurantMenu orderRestaurantMenu){
		orderRestaurantMenuDao.insert(orderRestaurantMenu);
	}
	
	@Transactional
	public void updateOrderRestaurantMenu(OrderRestaurantMenu orderRestaurantMenu){
		orderRestaurantMenuDao.updateOrderRestaurantMenu(orderRestaurantMenu);
	}
	
	@Transactional
	public void deleteOrderRestaurantMenu(OrderRestaurantMenu orderRestaurantMenu){
		orderRestaurantMenuDao.deleteOrderRestaurantMenu(orderRestaurantMenu.getId());
	}
	
}
