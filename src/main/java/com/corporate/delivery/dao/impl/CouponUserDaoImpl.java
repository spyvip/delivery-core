package com.corporate.delivery.dao.impl;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.corporate.deliver.utils.Utils;
import com.corporate.delivery.dao.AbstractDao;
import com.corporate.delivery.dao.CouponUserDao;
import com.corporate.delivery.model.CouponUser;


@Repository("couponUserDao")
public class CouponUserDaoImpl extends AbstractDao<Integer, CouponUser>implements CouponUserDao{

	public List<CouponUser> getCouponUser(int userId) {
		
		Query query = this.getSession().createQuery("from CouponUser up where up.userId = " + new Integer(userId));
		List<CouponUser> list = query.list();
		return list;
	}
	

	public void insert(CouponUser couponUser) {
		this.getSession().save(couponUser);
	}

	public void updateCouponUser(CouponUser couponUser) {
		this.getSession().update(couponUser);
	}

	public void deleteCouponUser(CouponUser couponUser) {
		this.getSession().delete(couponUser);	
	}

	public String applyCoupon(String userId, String zipCode, String couponCode, String subTotal) {
		Double discountOff = null;
		CouponUser couponUser = this.getCouponUserByUserIdAndcouponCode(userId, couponCode );
		if(couponUser == null) {
			couponUser = getCouponUserByZipCodeAndcouponCode( zipCode, couponCode);
		}
		
		if(couponUser == null) {	
			return CouponMessages.INVALID_COUPON_CODE.getValue();
		}
		
		if(couponUser.getMaxNumberOfUsages() > couponUser.getNumberOfUsagesComplete()){	
			Date date = couponUser.getMaxValidDate();
			boolean isBefore = Utils.isBeforeDay(date, new Date());
			if(isBefore) {	
				return CouponMessages.COUPON_VALIDITY_EXPIRED_ON_MAX_VALID_DATE.getValue();
			}
			Double subtotal = Double.parseDouble(subTotal);
			
			if(subtotal >= couponUser.getMinOrderAmount() && couponUser.getCouponType().equals("%")){
				discountOff = ((subtotal) * (couponUser.getMaxPercentageOffPerUsage()))/100;
			} else if(subtotal >= couponUser.getMinOrderAmount() && couponUser.getCouponType().equals("$")){
				discountOff = couponUser.getAmountOffPerUsage();
			}else if(subtotal < couponUser.getMinOrderAmount()) {	
				return CouponMessages.COUPON_CAN_BE_USED_FOR_MINIMUM_ORDER.getValue() + couponUser.getMinOrderAmount() + " or more" ;
			}
			
		} else {
			return CouponMessages.INVALID_COUPON_MAXIMUM_COUPON_USAGE_DETECTED.getValue();
		}
		
		if(discountOff > couponUser.getMaxAmountOffPerUsage()){
			return "Discount Off is more than maximum amount off per usage";
		}
		
		return "$"+ " " + Double.toString(discountOff);
	}
	
	private CouponUser getCouponUserByUserIdAndcouponCode(String userId, String couponCode ) {
		Query query = this.getSession().createQuery("from CouponUser up where up.userId = " + new Integer(userId) + " and " + "up.couponCode = " + couponCode);
		CouponUser couponUser = (CouponUser)query.uniqueResult();
		return couponUser;
	}
	
	private CouponUser getCouponUserByZipCodeAndcouponCode(String zipCode, String couponCode ) {
		Query query = this.getSession().createQuery("from CouponUser up where up.zip = " + new Integer(zipCode) +" and " + "up.couponCode = " + couponCode );
		CouponUser couponUser = (CouponUser) query.uniqueResult();
		return couponUser;
	}

}
