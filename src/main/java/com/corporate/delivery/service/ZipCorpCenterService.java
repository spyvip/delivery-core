package com.corporate.delivery.service;

import java.util.List;

import com.corporate.delivery.model.ZipCorpCenter;


public interface ZipCorpCenterService {

	public List<ZipCorpCenter> getZipCorpCenter(int corpZipCode);

	public void insert(ZipCorpCenter zipCorpCenter) ;
	
	public void updateZipCorpCenter(ZipCorpCenter zipCorpCenter);
	
	public void deleteZipCorpCenter(ZipCorpCenter zipCorpCenter);

}
