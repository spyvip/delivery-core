package com.corporate.delivery.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COUPON_USER")
public class CouponUser {

	private Integer id;
	private String businessType;
	private Integer zip;
	private String couponType;
	private String couponCode;
	private Date maxValidDate;
	private Integer userId;
	private Integer maxNumberOfUsages;
	private Integer numberOfUsagesComplete;
	private Double amountOffPerUsage;
	private Integer maxPercentageOffPerUsage;
	private Integer minOrderAmount;
	private Integer maxAmountOffPerUsage;
	
	@Id
	@GeneratedValue   
	@Column(name = "id", nullable = false)  
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name = "business_type", unique=true, nullable = false)
	public String getBusinessType() {
		return businessType;
	}
	
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
	
	@Column(name = "zip", unique=true, nullable = false)
	public Integer getZip() {
		return zip;
	}
	
	public void setZip(Integer zip) {
		this.zip = zip;
	}
	
	@Column(name = "coupon_type", unique=true, nullable = false)
	public String getCouponType() {
		return couponType;
	}
	
	public void setCouponType(String couponType) {
		this.couponType = couponType;
	}
	
	@Column(name = "coupon_code", unique=true, nullable = false)
	public String getCouponCode() {
		return couponCode;
	}
	
	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}
	
	@Column(name = "maxValid_Date", unique=true, nullable = false)
	public Date getMaxValidDate() {
		return maxValidDate;
	}
	
	public void setMaxValidDate(Date maxValidDate) {
		this.maxValidDate = maxValidDate;
	}
	
	@Column(name = "user_id", unique=true, nullable = false)
	public Integer getUserId() {
		return userId;
	}
	
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	@Column(name = "maxNumberOfUsages", unique=true, nullable = false)
	public Integer getMaxNumberOfUsages() {
		return maxNumberOfUsages;
	}
	
	public void setMaxNumberOfUsages(Integer maxNumberOfUsages) {
		this.maxNumberOfUsages = maxNumberOfUsages;
	}
	
	@Column(name = "numberOfUsageComplete", unique=true, nullable = false)
	public Integer getNumberOfUsagesComplete() {
		return numberOfUsagesComplete;
	}
	
	public void setNumberOfUsagesComplete(Integer numberOfUsagesComplete) {
		this.numberOfUsagesComplete = numberOfUsagesComplete;
	}
	
	@Column(name = "amountOffPerUsage", unique=true, nullable = false)
	public Double getAmountOffPerUsage() {
		return amountOffPerUsage;
	}
	
	public void setAmountOffPerUsage(Double amountOffPerUsage) {
		this.amountOffPerUsage = amountOffPerUsage;
	}
	
	@Column(name = "max_percentage_off_per_usage", unique=true, nullable = false)
	public Integer getMaxPercentageOffPerUsage() {
		return maxPercentageOffPerUsage;
	}
	
	public void setMaxPercentageOffPerUsage(Integer maxPercentageOffPerUsage) {
		this.maxPercentageOffPerUsage = maxPercentageOffPerUsage;
	}
	
	@Column(name = "min_order_amount", unique=true, nullable = false)
	public Integer getMinOrderAmount() {
		return minOrderAmount;
	}
	
	public void setMinOrderAmount(Integer minOrderAmount) {
		this.minOrderAmount = minOrderAmount;
	}
	
	@Column(name = "max_amount_off_per_usage", unique=true, nullable = false)
	public Integer getMaxAmountOffPerUsage() {
		return maxAmountOffPerUsage;
	}
	
	public void setMaxAmountOffPerUsage(Integer maxAmountOffPerUsage) {
		this.maxAmountOffPerUsage = maxAmountOffPerUsage;
	}
	
}
