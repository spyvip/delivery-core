package com.corporate.delivery.dao;

import java.util.List;

import com.corporate.delivery.model.User;

public interface UserDao {
	
	public User getById(Integer Id);

	public void insert(User user);
	
	public void updateUser(User user);
	
	public void deleteUser(Integer id);
}
