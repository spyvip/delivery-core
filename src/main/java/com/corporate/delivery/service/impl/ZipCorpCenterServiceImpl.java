package com.corporate.delivery.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.corporate.delivery.dao.ZipCorpCenterDao;
import com.corporate.delivery.model.ZipCorpCenter;
import com.corporate.delivery.service.ZipCorpCenterService;

@Service("zipCorpCenterService")
@Transactional
public class ZipCorpCenterServiceImpl implements ZipCorpCenterService{

	@Autowired
	ZipCorpCenterDao zipCorpCenterDao;

	public List<ZipCorpCenter> getZipCorpCenter(int corpZipCode) {
		
		return zipCorpCenterDao.getZipCorpCenter(corpZipCode);
	}

	public void insert(ZipCorpCenter zipCorpCenter) {
		zipCorpCenterDao.insert(zipCorpCenter);
		
	}

	public void updateZipCorpCenter(ZipCorpCenter zipCorpCenter) {
		zipCorpCenterDao.updateZipCorpCenter(zipCorpCenter);
		
	}

	public void deleteZipCorpCenter(ZipCorpCenter zipCorpCenter) {
		zipCorpCenterDao.deleteZipCorpCenter(zipCorpCenter);
		
	}

	
	
	
}
