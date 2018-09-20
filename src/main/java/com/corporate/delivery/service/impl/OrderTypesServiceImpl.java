package com.corporate.delivery.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.corporate.delivery.dao.OrderTypesDao;
import com.corporate.delivery.model.ZipBusTypeMerchant;
import com.corporate.delivery.service.OrderTypesService;

@Service("orderTypesService")
@Transactional
public class OrderTypesServiceImpl implements OrderTypesService {

	@Autowired
	OrderTypesDao orderTypesDao;
	
	public List<ZipBusTypeMerchant> getOrderTypes(String zipcode) {
		return orderTypesDao.getOrderTypes(zipcode, null, null);
	}

}
