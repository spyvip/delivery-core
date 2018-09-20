package com.corporate.delivery.dao;

import com.corporate.delivery.model.Merchant;
import com.corporate.delivery.model.User;

public interface LoginDao {
	
	public boolean isUserNameExists(String username, String loginType); 

	public User getUser(String username);
	
	public Merchant getMerchantOrRestaurant(String username);
	
	
}
