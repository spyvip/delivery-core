package com.corporate.delivery.model;

public class RestaurantUpdate {

	private Integer id;
    private String name;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String image;
    private Integer zipBustypeMerchantId;
    private String tagLine;
    private String opencloseTime;
    private String timeRange;
    private String pricelevel;
    private boolean active;
    
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	public Integer getZipBustypeMerchantId() {
		return zipBustypeMerchantId;
	}
	public void setZipBustypeMerchantId(Integer zipBustypeMerchantId) {
		this.zipBustypeMerchantId = zipBustypeMerchantId;
	}
	public String getTagLine() {
		return tagLine;
	}
	public void setTagLine(String tagLine) {
		this.tagLine = tagLine;
	}
	public String getOpencloseTime() {
		return opencloseTime;
	}
	public void setOpencloseTime(String opencloseTime) {
		this.opencloseTime = opencloseTime;
	}
	public String getTimeRange() {
		return timeRange;
	}
	public void setTimeRange(String timeRange) {
		this.timeRange = timeRange;
	}
	public String getPricelevel() {
		return pricelevel;
	}
	public void setPricelevel(String pricelevel) {
		this.pricelevel = pricelevel;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
    
    
}
