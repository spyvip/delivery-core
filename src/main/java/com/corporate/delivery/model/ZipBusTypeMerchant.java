package com.corporate.delivery.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ZIP_BUSTYPE_MERCHANT")
public class ZipBusTypeMerchant {
	
	private Integer id;
	private String businessZipcode;
	private String city;
	private String  businesssState;
	private String  businessType;
	private String  merchantId;
	private boolean  active;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name = "business_zipcode", nullable = false)
	public String getBusinessZipcode() {
		return businessZipcode;
	}
	public void setBusinessZipcode(String businessZipcode) {
		this.businessZipcode = businessZipcode;
	}
	
	@Column(name = "business_city", nullable = false)
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Column(name = "business_State", nullable = false)
	public String getBusinesssState() {
		return businesssState;
	}
	public void setBusinesssState(String businesssState) {
		this.businesssState = businesssState;
	}
	
	@Column(name = "business_type", nullable = false)
	public String getBusinessType() {
		return businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
	
	@Column(name = "merchantId", nullable = false)
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	
	@Column(name = "active", nullable = false)
	public boolean isActive() {
		return active;
	}
	
	public void setActive(boolean active) {
		this.active = active;
	}
	
	
}
