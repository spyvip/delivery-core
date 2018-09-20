package com.corporate.delivery.service;

import com.corporate.delivery.model.Merchant;
import com.corporate.delivery.model.User;

public interface LoginService {

	public boolean isUserNameExists(String username, String loginType);
	
	public User getUser(String username);
	
	public Merchant getMerchantOrRestaurant(String username);
	
}
