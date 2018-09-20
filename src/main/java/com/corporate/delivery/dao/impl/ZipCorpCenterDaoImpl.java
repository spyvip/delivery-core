package com.corporate.delivery.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.corporate.delivery.dao.AbstractDao;
import com.corporate.delivery.dao.ZipCorpCenterDao;
import com.corporate.delivery.model.ZipCorpCenter;


@Repository("zipCorpCenterDao") 
public class ZipCorpCenterDaoImpl extends AbstractDao<Integer, ZipCorpCenter> implements ZipCorpCenterDao{

	public List<ZipCorpCenter> getZipCorpCenter(int corpZipCode) {
		Query query = this.getSession().createQuery("from ZipCorpCenter zc where zc.corpZipCode = " + new Integer(corpZipCode));
		List<ZipCorpCenter> list = query.list();
		return list;
	}

	public void insert(ZipCorpCenter zipCorpCenter) {
		this.getSession().save(zipCorpCenter);
		
	}

	public void updateZipCorpCenter(ZipCorpCenter zipCorpCenter) {
		this.getSession().update(zipCorpCenter);
		
	}

	public void deleteZipCorpCenter(ZipCorpCenter zipCorpCenter) {
		this.getSession().delete(zipCorpCenter);
		
	}

	
	
	
}
