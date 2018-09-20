package com.corporate.delivery.service;

import com.corporate.delivery.model.Merchant;

public interface MerchantService {
	
	public void insert(Merchant merchant);
	
	public void updateMerchant(Merchant merchant);
	
	public void deleteMerchant(Integer id);
}