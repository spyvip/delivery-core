package com.corporate.delivery.dao.impl;

public enum CouponMessages {
	
	INVALID_COUPON_CODE("Invalid coupon code"),
	ENTER_VALID_COUPON_CODE("Please enter valid coupon code"),
	INVALID_COUPON_MAXIMUM_COUPON_USAGE_DETECTED("Invalid coupon, Maximum coupon usage detected"),
	COUPON_VALIDITY_EXPIRED_ON_MAX_VALID_DATE("Coupon code date has expired"),
	COUPON_CAN_BE_USED_FOR_MINIMUM_ORDER("Coupon can be used for minimum order of $");


	private String value;
	
	private CouponMessages(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
}
