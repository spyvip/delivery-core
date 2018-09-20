package com.corporate.delivery.service;

import java.util.List;

import com.corporate.delivery.model.ZipBusTypeMerchant;
import com.corporate.delivery.model.creditcard.UserPayment;

public interface UserPaymentService {
	
	public List<UserPayment> getUserPayment(Integer userId);
	
	public void insert(UserPayment userPayment) ;
	
	public void updateUserPayment(UserPayment userPayment);
	
	public void deleteUserPayment(int Id);
	
}
