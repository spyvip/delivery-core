package com.corporate.delivery.service;

import java.util.List;

import com.corporate.delivery.model.ZipBusTypeMerchant;

public interface OrderTypesService {

	public List<ZipBusTypeMerchant> getOrderTypes(String zipcode);
		
		
	
}
