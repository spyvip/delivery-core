package com.corporate.delivery.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corporate.delivery.dao.OrderStatusDao;
import com.corporate.delivery.model.order.OrderStatus;
import com.corporate.delivery.service.OrderStatusService;

@Service("orderStatusService")
public class OrderStatusServiceImpl implements OrderStatusService{

	@Autowired
	OrderStatusDao orderStatusDao;
	
	@Transactional
	public List<OrderStatus> getOrderStatus(int userId) {
		
		return orderStatusDao.getOrderStatus(userId);
	}
	
	@Transactional
	public void insert(OrderStatus orderStatus) {
		
		orderStatusDao.insert(orderStatus);
	}
	
	@Transactional
	public void updateOrderStatus(OrderStatus orderStatus) {
		
		orderStatusDao.updateOrderStatus(orderStatus);
	}
	
	@Transactional
	public void deleteOrderStatus(OrderStatus orderStatus) {
		
		orderStatusDao.deleteOrderStatus(orderStatus);
	}

}
