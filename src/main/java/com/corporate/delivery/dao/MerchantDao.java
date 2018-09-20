package com.corporate.delivery.dao;

import com.corporate.delivery.model.Merchant;

public interface MerchantDao {
	
	public void insert(Merchant merchant);
	
	public void deleteMerchant(Integer id);

	public void updatMerchant(Merchant merchant);

}
