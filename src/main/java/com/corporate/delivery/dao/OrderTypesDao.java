package com.corporate.delivery.dao;

import java.util.List;

import com.corporate.delivery.model.ZipBusTypeMerchant;

public interface OrderTypesDao {
	
	public List<ZipBusTypeMerchant> getOrderTypes(String zipcode, String city, String state);

}
