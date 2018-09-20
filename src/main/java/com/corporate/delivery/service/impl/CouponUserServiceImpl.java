package com.corporate.delivery.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.corporate.delivery.dao.CouponUserDao;
import com.corporate.delivery.model.CouponUser;
import com.corporate.delivery.service.CouponUserService;

@Service("couponUserService")
public class CouponUserServiceImpl implements CouponUserService{

	@Autowired
	CouponUserDao couponUserDao;

	public List<CouponUser> getCouponUser(int userId) {
		
		return couponUserDao.getCouponUser(userId);
	}

	public void insert(CouponUser couponUser) {
		
		couponUserDao.insert(couponUser);
	}

	public void updateCouponUser(CouponUser couponUser) {
		couponUserDao.updateCouponUser(couponUser);
		
	}

	public void deleteCouponUser(CouponUser couponUser) {
		couponUserDao.deleteCouponUser(couponUser);
		
	}

	@Transactional(readOnly = true)
	public String applyCoupon(String userId, String zipCode, String couponCode, String subTotal) {
	
		return couponUserDao.applyCoupon(userId, zipCode, couponCode, subTotal);
		 
	}
	
	
	
}
