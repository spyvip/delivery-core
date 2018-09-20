package com.corporate.delivery.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.corporate.delivery.dao.MerchantDao;
import com.corporate.delivery.model.Merchant;
import com.corporate.delivery.model.User;
import com.corporate.delivery.service.MerchantService;

@Service("merchantService")
@Transactional
public class MerchantServiceImpl implements MerchantService{
	
	@Autowired
	MerchantDao dao;
	
	public void insert(Merchant merchant){
		dao.insert(merchant);
	}
	
	public void updateMerchant(Merchant merchant){
		dao.updatMerchant(merchant);
	}
	
	public void deleteMerchant(Integer id){
		dao.deleteMerchant(id);
	}
	
}
