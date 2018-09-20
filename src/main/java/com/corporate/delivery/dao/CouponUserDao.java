package com.corporate.delivery.dao;

import java.util.List;

import com.corporate.delivery.model.CouponUser;

public interface CouponUserDao  {

	public List<CouponUser> getCouponUser(int userId);
	
	public void insert(CouponUser couponUser) ;
	
	public void updateCouponUser(CouponUser couponUser);
	
	public void deleteCouponUser(CouponUser couponUser);
	
	public String applyCoupon(String userId, String zipCode, String couponCode, String subTotal);
}
