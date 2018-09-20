package com.corporate.delivery.dao.impl;

import org.springframework.stereotype.Repository;

import com.corporate.delivery.dao.AbstractDao;
import com.corporate.delivery.dao.MerchantDao;
import com.corporate.delivery.model.Merchant;

@Repository("merchantDao")
public class MerchantDaoImpl extends AbstractDao<Integer, Merchant> implements MerchantDao{
	
	public void insert(Merchant merchant){
		this.getSession().save(merchant);
	}
	
	public void updatMerchant(Merchant merchant){
		this.getSession().update(merchant);
	}
	
	public void deleteMerchant(Integer id){
		this.getSession().delete(id);
	}

}
