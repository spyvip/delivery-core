package com.corporate.delivery.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import com.corporate.delivery.dao.AbstractDao;
import com.corporate.delivery.dao.UserPaymentServiceDao;
import com.corporate.delivery.model.User;
import com.corporate.delivery.model.creditcard.UserPayment;

@Repository("userPaymentServiceDao")
public class UserPaymentServiceDaoImpl extends AbstractDao<Integer, UserPayment>implements UserPaymentServiceDao {

	public List<UserPayment> getUserPayment(Integer userId){
		Query query = this.getSession().createQuery("from UserPayment up where up.userId = " + new Integer(userId));
		List<UserPayment> list = query.list();
		return list;
	}

	public void insert(UserPayment userPayment) {
		this.getSession().save(userPayment);
	}
	
	public void updateUserPayment(UserPayment userPayment) {
		this.getSession().update(userPayment);
	}

	public void deleteUserPayment(int Id) {
		
		Criteria cr = getSession().createCriteria(UserPayment.class);
		cr.add(Restrictions.eq("id", Id));
		UserPayment userPayment = (UserPayment) cr.uniqueResult();
		
		this.getSession().delete(userPayment);		
	}

	/*
	public List<UserPayment> updateUserPayment(int userId, String name) {
		Query query = this.getSession().createQuery("update UserPayment up set up.name = " + new String(name)+
    												" where up.userId =" + new Integer(userId));
		List<UserPayment> list = query.list();
		return list;
	}

	public List<UserPayment> deleteUserPayment(int userId) {	
		Query query = this.getSession().createQuery("delete UserPayment up where up.userId = " + new Integer(userId)+
													" where up.userId =" + new Integer(userId));
	List<UserPayment> list = query.list();
	return list;
	}*/
	
}
