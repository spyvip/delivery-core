package com.corporate.delivery.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import com.corporate.delivery.dao.AbstractDao;
import com.corporate.delivery.dao.OrderTypesDao;
import com.corporate.delivery.model.ZipBusTypeMerchant;

@Repository("orderTypesDao")
public class OrderTypesDaoImpl extends AbstractDao<Integer, ZipBusTypeMerchant> implements OrderTypesDao  {

	@SuppressWarnings("unchecked")
	public List<ZipBusTypeMerchant> getOrderTypes(String zipcode, String city, String state) {
		Criteria cr = getSession().createCriteria(ZipBusTypeMerchant.class);
		
		if(zipcode != null && !StringUtils.isEmpty(zipcode)) {
			cr.add(Restrictions.eq("businessZipcode", new String(zipcode)));
		} else {
			cr.add(Restrictions.eq("businesssState", state));
			cr.add(Restrictions.eq("city", city));
		}
		
		
		return cr.list();
	}

}
