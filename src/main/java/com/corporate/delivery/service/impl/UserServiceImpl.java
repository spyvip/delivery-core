package com.corporate.delivery.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.corporate.delivery.dao.UserDao;
import com.corporate.delivery.model.User;
import com.corporate.delivery.service.UserService;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDao dao;
	public User getById(Integer Id){
		return dao.getById(Id);
	}
	
	public void insert(User user){
		dao.insert(user);
	}
	
	public void updateUser(User user){
		dao.updateUser(user);
	}
	
	public void deleteUser(Integer id){
		dao.deleteUser(id);
	}
}
