package com.corporate.delivery.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.corporate.delivery.dao.LoginDao;
import com.corporate.delivery.model.Merchant;
import com.corporate.delivery.model.User;
import com.corporate.delivery.service.LoginService;

@Service("loginService")
@Transactional
public class loginServiceImpl implements LoginService {

	 @Autowired
	 LoginDao loginDao;
	
	public boolean isUserNameExists(String username, String loginType) {
		return loginDao.isUserNameExists(username, loginType);
	}

	public User getUser(String username) {
		return loginDao.getUser(username);
	}

	public Merchant getMerchantOrRestaurant(String username) {
		return loginDao.getMerchantOrRestaurant(username);
	}

}
