package com.corporate.delivery.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.corporate.delivery.dao.AbstractDao;
import com.corporate.delivery.dao.MailDao;
import com.corporate.delivery.model.User;

@Repository("mailDao")
public class MailDaoImpl extends AbstractDao<Integer, User> implements MailDao {

	public boolean isMailExists(String email){
		Query query = getSession().createQuery("from User u where u.username = '" + email + "'");
		List<User> list = query.list();
		boolean result = !list.isEmpty();
		return result;
	}

}
