package com.corporate.delivery.model;

public enum MerchantType {
	
	MERCHANT("M"),
	RESTAURANT("R");
	
	private String value;
	
	private MerchantType(String value){
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	

}
