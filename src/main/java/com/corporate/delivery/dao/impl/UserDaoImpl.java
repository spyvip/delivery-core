package com.corporate.delivery.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.corporate.delivery.dao.AbstractDao;
import com.corporate.delivery.dao.UserDao;
import com.corporate.delivery.model.Restaurant;
import com.corporate.delivery.model.User;

@Repository("userDao")
public class UserDaoImpl extends AbstractDao<Integer, User> implements UserDao{

	public User getById(Integer Id) {
		Criteria cr = getSession().createCriteria(User.class);
		cr.add(Restrictions.eq("id", Id));
		User user = (User) cr.uniqueResult();
		return user;
	}
	
	public void insert(User user){
		this.getSession().save(user);
	}
	
	public void updateUser(User user){
		
		this.getSession().update(user);
	}
	
	public void deleteUser(Integer id){
		this.getSession().delete(id);
	}
}
