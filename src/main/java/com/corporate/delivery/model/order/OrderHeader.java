package com.corporate.delivery.model.order;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ORDER_HEADER")
public class OrderHeader {

	private Integer id;
	private Date orderDate;
	private String orderTime;
	private Integer userId;
	private String name;
	
	private Integer zipBustypeMerchantId;
	private String instructions;
	private String businessType;
	
	// delivery address
	private String deliveryAddress;
	private String deliveryCity;
	private String deliveryState;
	private Integer deliveryZip;
	
	// payment details
	private String cardType;
	private Integer lastFourDigits;
	private String expDate;
	private String token;
	
	// Order summary
	private double deliveryCharge;
	private double subTotalSales;
	private double taxSales;
	private double totalSales;
	private double totalBase;
	private double totalRestaurant;
	private double tip;
	
	//subtotal_sales
	//tax_sales
	//tip
		
	//total_base    
	//total_restaurant 
	//total_sales -- (tax + subtotal + tip + deliveryCharge) - (if coupon applied)

	private String couponType; 
	private String couponCode; 
	private Double couponAmount;
	
	private String payMethod;
	
	
	@Id
	@GeneratedValue
	@Column(name = "id") 
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name = "order_date", unique=true, nullable = false)
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	
	@Column(name = "order_time", nullable = false)
	public String getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}
	
	@Column(name = "userid", unique=true, nullable = false)
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	@Column(name = "name",  nullable = false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name = "delivery_address", unique=true, nullable = false)
	public String getDeliveryAddress() {
		return deliveryAddress;
	}
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	
	@Column(name = "instructions",  nullable = false)
	public String getInstructions() {
		return instructions;
	}
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}
	
	@Column(name = "business_type",  nullable = false) 
	public String getBusinessType() {
		return businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
	
	
	@Column(name = "zipBustypeMerchantId", unique=true, nullable = false) 
	public Integer getZipBustypeMerchantId() {
		return zipBustypeMerchantId;
	}
	public void setZipBustypeMerchantId(Integer zipBustypeMerchantId) {
		this.zipBustypeMerchantId = zipBustypeMerchantId;
	}
	
	@Column(name = "card_type", nullable = false) 
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	
	@Column(name = "lastFourDigits", nullable = false) 
	public Integer getLastFourDigits() {
		return lastFourDigits;
	}
	public void setLastFourDigits(Integer lastFourDigits) {
		this.lastFourDigits = lastFourDigits;
	}
	
	@Column(name = "exp_date",  nullable = false) 
	public String getExpDate() {
		return expDate;
	}
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	
	@Column(name = "token", unique=true, nullable = false) 
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}

	@Column(name = "city",  nullable = false)
	public String getDeliveryCity() {
		return deliveryCity;
	}
	public void setDeliveryCity(String deliveryCity) {
		this.deliveryCity = deliveryCity;
	}
	
	@Column(name = "state",  nullable = false)
	public String getDeliveryState() {
		return deliveryState;
	}
	public void setDeliveryState(String deliveryState) {
		this.deliveryState = deliveryState;
	}
	
	@Column(name = "zipcode",  nullable = false) 
	public Integer getDeliveryZip() {
		return deliveryZip;
	}
	public void setDeliveryZip(Integer deliveryZip) {
		this.deliveryZip = deliveryZip;
	}
	
	@Column(name = "Coupon_type", unique=true, nullable = false)
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
	
	@Column(name = "coupon_amount", unique=true, nullable = false)
	public Double getCouponAmount() {
		return couponAmount;
	}
	public void setCouponAmount(Double couponAmount) {
		this.couponAmount = couponAmount;
	}
	
	@Column(name = "delivery_charge",  nullable = false) 
	public double getDeliveryCharge() {
		return deliveryCharge;
	}
	public void setDeliveryCharge(double deliveryCharge) {
		this.deliveryCharge = deliveryCharge;
	}
	
	@Column(name = "subtotal_sales", nullable = false) 
	public double getSubTotalSales() {
		return subTotalSales;
	}
	public void setSubTotalSales(double subTotalSales) {
		this.subTotalSales = subTotalSales;
	}
	
	@Column(name = "tax_sales", nullable = false) 
	public double getTaxSales() {
		return taxSales;
	}
	public void setTaxSales(double taxSales) {
		this.taxSales = taxSales;
	}
	
	@Column(name = "total_sales", nullable = false) 
	public double getTotalSales() {
		return totalSales;
	}
	public void setTotalSales(double totalSales) {
		this.totalSales = totalSales;
	}
	
	@Column(name = "total_base", nullable = false) 
	public double getTotalBase() {
		return totalBase;
	}
	public void setTotalBase(double totalBase) {
		this.totalBase = totalBase;
	}
	
	@Column(name = "total_restaurant", nullable = false) 
	public double getTotalRestaurant() {
		return totalRestaurant;
	}
	public void setTotalRestaurant(double totalRestaurant) {
		this.totalRestaurant = totalRestaurant;
	}
	
	@Column(name = "tip", nullable = false) 
	public double getTip() {
		return tip;
	}
	public void setTip(double tip) {
		this.tip = tip;
	}
	
	@Column(name = "pay_method")
	public String getPayMethod() {
		return payMethod;
	}
	public void setPayMethod(String payMethod) {
		this.payMethod = payMethod;
	}
}
