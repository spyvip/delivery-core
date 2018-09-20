package com.corporate.delivery.model;

public enum LoginType {
	
	USER("U"),
	MERCHANT_OR_RESTAURANT("MR");
	
	private String value;
	
	private LoginType(String value){
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
	

}
