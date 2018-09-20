package com.corporate.delivery.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.corporate.delivery.dao.OrderHeaderDao;
import com.corporate.delivery.model.order.OrderHeader;
import com.corporate.delivery.model.order.OrderProcess;
import com.corporate.delivery.service.OrderHeaderService;

@Service("orderHeaderService")
public class OrderHeaderServiceImpl implements OrderHeaderService {
	
	@Autowired
	OrderHeaderDao orderHeaderDao; 
	
	@Transactional
	public List<OrderHeader> getOrderHeader(Integer userId) {
		return orderHeaderDao.getOrderHeader(userId);
	}
	
	@Transactional
	public List<OrderHeader> getMerchantOrRestaurantOrders(Integer zipBustypeMerchantId){
		return orderHeaderDao.getMerchantOrRestaurantOrders(zipBustypeMerchantId);
	}
	
	@Transactional
	public List<OrderHeader> getOrderHeaderDetail(Integer zipBustypeMerchantId, String fromdate, String todate){
		return orderHeaderDao.getOrderHeaderDetail(zipBustypeMerchantId, fromdate, todate);
	}
	
	@Transactional
	public void insert(OrderHeader orderHeader) {
		orderHeaderDao.insert(orderHeader);
	}

	public void updateOrderHeader(OrderHeader orderHeader) {
		orderHeaderDao.insert(orderHeader);
	}

	public void deleteOrderHeader(OrderHeader orderHeader) {
		orderHeaderDao.deleteOrderHeader(orderHeader.getId());
	}
	
	@Transactional
	public Integer processOrder(OrderProcess orderProcess) {
		orderHeaderDao.insert(orderProcess.getOrderHeader());
		return null;
	}

	public Integer processOrder(Integer userId) {
		
		return null;
	}
	
}
