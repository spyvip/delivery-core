package com.corporate.delivery.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.corporate.delivery.dao.UserPaymentServiceDao;
import com.corporate.delivery.model.creditcard.UserPayment;
import com.corporate.delivery.service.UserPaymentService;

@Service("userPaymentService")
@Transactional
public class UserPaymentServiceImpl implements UserPaymentService {

	@Autowired
	UserPaymentServiceDao userPaymentServiceDao;

	public List<UserPayment> getUserPayment(Integer userId) {
		return userPaymentServiceDao.getUserPayment(userId);
	}

	public void insert(UserPayment userPayment) {
		userPaymentServiceDao.insert(userPayment);
	}

	public void updateUserPayment(UserPayment userPayment) {
		userPaymentServiceDao.updateUserPayment(userPayment);	
	}

	public void deleteUserPayment(int Id) {
		userPaymentServiceDao.deleteUserPayment(Id);
	}
	
	
}
