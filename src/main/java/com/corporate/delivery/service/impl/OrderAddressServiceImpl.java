package com.corporate.delivery.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.corporate.delivery.dao.OrderAddressDao;
import com.corporate.delivery.dao.UserPaymentServiceDao;
import com.corporate.delivery.model.order.OrderAddresses;
import com.corporate.delivery.service.OrderAddressService;

@Service("orderAddressService")
@Transactional
public class OrderAddressServiceImpl implements OrderAddressService {
	
	@Autowired
	OrderAddressDao orderAddressDao;
	public List<OrderAddresses> getOrderAddress(Integer userId) {
		
		return orderAddressDao.getOrderAddress(userId);
	}

	public void insert(OrderAddresses orderAddress) {
		orderAddressDao.insert(orderAddress);
		
	}

	public void updateOrderAddress(OrderAddresses orderAddress) {
		orderAddressDao.updateOrderAddress(orderAddress);
		
	}

	public void deleteOrderAddress(Integer userId) {
		orderAddressDao.deleteOrderAddress(userId);
		
	}
	
}
