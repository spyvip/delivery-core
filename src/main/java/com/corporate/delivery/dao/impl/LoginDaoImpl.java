package com.corporate.delivery.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.corporate.delivery.dao.AbstractDao;
import com.corporate.delivery.dao.LoginDao;
import com.corporate.delivery.model.LoginType;
import com.corporate.delivery.model.Merchant;
import com.corporate.delivery.model.User;

@Repository("loginDao")
public class LoginDaoImpl extends AbstractDao<Integer, User> implements LoginDao {
		
	public boolean isUserNameExists(String username, String loginType) {
		Query query = null;
		boolean result = false;
		if(loginType == LoginType.USER.getValue()) {
			query = getSession().createQuery("from User u where u.username = '" + username + "'");
			List<User> list = query.list();
			result = !list.isEmpty();
		} else {
			query = getSession().createQuery("from Merchant m where m.username = '" + username + "'");
			List<User> list = query.list();
			result = !list.isEmpty();
		}	
		
		return result;
	}

	public User getUser(String username) {
		Criteria cr = getSession().createCriteria(User.class);
		cr.add(Restrictions.eq("username", username));
		User user = (User) cr.uniqueResult();
		
		return user;
	}

	public Merchant getMerchantOrRestaurant(String username) {
		Criteria cr = getSession().createCriteria(Merchant.class);
		cr.add(Restrictions.eq("username", username));
		Merchant merchant = (Merchant) cr.uniqueResult();
		return merchant;
	}

}
