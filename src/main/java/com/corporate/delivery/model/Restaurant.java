package com.corporate.delivery.model;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;
 
@Entity
@Table(name="RESTAURANT_BUSTYPE")
public class Restaurant {
  
    private Integer id;
    private Integer zipBustypeMerchantId;
    
    private String name;
    private String managerName;
    private String email;
    private String phone;
    
    private String tagLine;
    private String opencloseTime;
    private String timeRange;
    private String pricelevel;
    
    private String address;
    private String city;
    private String state;
    private String zip;
    
    private String image;
    private Double contractPercent;
    
    private boolean active;

    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
	@Column(name = "id", nullable = false) 
	public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name = "zipBustypeMerchantId", unique=true, nullable = false)
	public Integer getZipBustypeMerchantId() {
		return zipBustypeMerchantId;
	}
	public void setZipBustypeMerchantId(Integer zipBustypeMerchantId) {
		this.zipBustypeMerchantId = zipBustypeMerchantId;
	}
 
    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    @Column(name = "manager_name", nullable = false)
    public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	
	@Column(name = "email", nullable = false)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Column(name = "phone", nullable = false)
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
   
	@Column(name = "tagLine", unique=true, nullable = false)
	public String getTagLine() {
		return tagLine;
	}
	public void setTagLine(String tagLine) {
		this.tagLine = tagLine;
	}

	@Column(name = "opencloseTime", unique=true, nullable = false)
	public String getOpencloseTime() {
		return opencloseTime;
	}
	public void setOpencloseTime(String opencloseTime) {
		this.opencloseTime = opencloseTime;
	}

	@Column(name = "timeRange", unique=true, nullable = false)
	public String getTimeRange() {
		return timeRange;
	}
	public void setTimeRange(String timeRange) {
		this.timeRange = timeRange;
	}

	@Column(name = "pricelevel", unique=true, nullable = false)
	public String getPricelevel() {
		return pricelevel;
	}
	public void setPricelevel(String pricelevel) {
		this.pricelevel = pricelevel;
	}
	
	@Column(name = "Address", unique=true, nullable = false)
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@NotEmpty
	@Column(name = "city", unique=false, nullable = false)
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
		
	@Column(name = "State", unique=true, nullable = false)
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "zip", unique=true, nullable = false)
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}

	@Column(name = "image", unique=true, nullable = false)
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}

	@Column(name = "contract_percent", unique=true, nullable = false)
	public Double getContractPercent() {
		return contractPercent;
	}
	public void setContractPercent(Double contractPercent) {
		this.contractPercent = contractPercent;
	}
	
	@Column(name = "active", unique=true, nullable = false)
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
}