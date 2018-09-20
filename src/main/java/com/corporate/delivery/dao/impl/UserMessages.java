package com.corporate.delivery.dao.impl;

public enum UserMessages {
	
	PLEASE_ENTER_CORRECT_PASSWORD("Please enter correct password!"),
	PASSWORD_CHANGED_SUCCESSFULLY("Password changed successfully");
	
	private String value;
	
	private UserMessages(String value){
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
