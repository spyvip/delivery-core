package com.corporate.delivery.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.corporate.delivery.dao.MailDao;
import com.corporate.delivery.service.MailService;

@Service("mailService")
@Transactional
public class MailServiceImpl implements MailService{

	@Autowired
	MailDao mailDao;
	
	public boolean isMailExists(String email){
		return mailDao.isMailExists(email);
	}
}
