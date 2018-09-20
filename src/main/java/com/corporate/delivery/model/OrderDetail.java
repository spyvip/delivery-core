package com.corporate.delivery.model;

import org.joda.time.DateTime;

public class OrderDetail {
	
	public String corporateCenter;
	public String address;
	public String suitNo;
	public String city;
	public String state;
	public String zip;
	
	public DateTime date;
	public String deliverTime;
	
	public String getCorporateCenter() {
		return corporateCenter;
	}
	public void setCorporateCenter(String corporateCenter) {
		this.corporateCenter = corporateCenter;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSuitNo() {
		return suitNo;
	}
	public void setSuitNo(String suitNo) {
		this.suitNo = suitNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public DateTime getDate() {
		return date;
	}
	public void setDate(DateTime date) {
		this.date = date;
	}
	public String getDeliverTime() {
		return deliverTime;
	}
	public void setDeliverTime(String deliverTime) {
		this.deliverTime = deliverTime;
	}
	
	

}
