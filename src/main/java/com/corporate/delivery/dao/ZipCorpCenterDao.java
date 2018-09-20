package com.corporate.delivery.dao;

import java.util.List;

import com.corporate.delivery.model.ZipCorpCenter;

public interface ZipCorpCenterDao {

public List<ZipCorpCenter> getZipCorpCenter(int id);
	
	public void insert(ZipCorpCenter zipCorpCenter) ;
	
	public void updateZipCorpCenter(ZipCorpCenter zipCorpCenter);
	
	public void deleteZipCorpCenter(ZipCorpCenter zipCorpCenter);
	
}
