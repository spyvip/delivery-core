package com.corporate.delivery.model.order;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ORDER_ADDRESSES")
public class OrderAddresses {
   private Integer id;
   private Integer orderId;
   private String deliveryAddress;
   private String deliveryCity;
   private String deliveryState;
   private Integer deliveryZip; 
   private String billingAddress;
   private String billingCity;
   private String billingState;
   private Integer billingZip;
   
   @Id
	@GeneratedValue   
	@Column(name = "id", nullable = false)   
   public Integer getId() {
	   return id;
   }
   public void setId(Integer id) {
	   this.id = id;
   }

   @Column(name = "order_id", unique=true, nullable = false)
   public Integer getOrderId() {
	   return orderId;
   }
   public void setOrderId(Integer orderId) {
	   this.orderId = orderId;
   }

   @Column(name = "delivery_address", nullable = false)
   public String getDeliveryAddress() {
	   return deliveryAddress;
   }
   public void setDeliveryAddress(String deliveryAddress) {
	   this.deliveryAddress = deliveryAddress;
   }

   @Column(name = "delivery_city", nullable = false)
   public String getDeliveryCity() {
	   return deliveryCity;
   }
   public void setDeliveryCity(String deliveryCity) {
	   this.deliveryCity = deliveryCity;
   }

   @Column(name = "delivery_state", nullable = false)
   public String getDeliveryState() {
	   return deliveryState;
   }
   public void setDeliveryState(String deliveryState) {
	   this.deliveryState = deliveryState;
   }

   @Column(name = "delivery_zip", unique=true, nullable = false)
   public Integer getDeliveryZip() {
	   return deliveryZip;
   }
   public void setDeliveryZip(Integer deliveryZip) {
	   this.deliveryZip = deliveryZip;
   }

   @Column(name = "billing_address", nullable = false)
   public String getBillingAddress() {
	   return billingAddress;
   }
   public void setBillingAddress(String billingAddress) {
	   this.billingAddress = billingAddress;
   }

   @Column(name = "billing_city", unique=true, nullable = false)
   public String getBillingCity() {
	   return billingCity;
   }
   public void setBillingCity(String billingCity) {
	   this.billingCity = billingCity;
   }

   @Column(name = "billing_state", nullable = false)
   public String getBillingState() {
	   return billingState;
   }
   public void setBillingState(String billingState) {
	   this.billingState = billingState;
   }

   @Column(name = "billing_zip", unique=true, nullable = false)
   public Integer getBillingZip() {
	   return billingZip;
   }
   public void setBillingZip(Integer billingZip) {
	   this.billingZip = billingZip;
   }

}
