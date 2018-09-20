package com.corporate.delivery.dao;

import java.util.List;
import com.corporate.delivery.model.creditcard.UserPayment;

public interface UserPaymentServiceDao {

	public List<UserPayment> getUserPayment(Integer userId);
	
	public void insert(UserPayment userPayment);
	
	public void updateUserPayment(UserPayment userPayment);
	
	public void deleteUserPayment(int Id);

}
