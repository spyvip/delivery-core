package com.corporate.delivery.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.corporate.delivery.dao.OrderItemsDao;
import com.corporate.delivery.model.creditcard.UserPayment;
import com.corporate.delivery.model.order.OrderRestaurant;
import com.corporate.delivery.service.OrderRestaurantService;

@Service("orderRestaurantService")
@Transactional
public class OrderRestaurantServiceImpl implements OrderRestaurantService {
	
	@Autowired
	OrderItemsDao orderItemsServiceDao;
	
	public List<OrderRestaurant> getOrderRestaurant(Integer orderId) {
		
		return orderItemsServiceDao.getOrderItems(orderId);
	}
	
	public List<OrderRestaurant>getOrderRestaurantDetail(Integer id){
		return orderItemsServiceDao.getOrderRestaurantDetail(id);
	}

	public void insert(OrderRestaurant orderRestaurant) {
		orderItemsServiceDao.insert(orderRestaurant);
	}

	
	public void updateOrderRestaurant(OrderRestaurant orderItems){
		orderItemsServiceDao.updateOrderItems(orderItems);
	}
	
	public void deleteOrderRestaurant(Integer orderId){
		orderItemsServiceDao.deleteOrderItems(orderId);
	}

	

	
}
