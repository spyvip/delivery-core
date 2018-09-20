package com.corporate.delivery.service.impl;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.corporate.delivery.dao.RestaurantDao;
import com.corporate.delivery.model.Restaurant;
import com.corporate.delivery.service.RestaurantService;
 
@Service("restaurantService")
@Transactional
public class RestaurantServiceImpl implements RestaurantService {
 
    @Autowired
    private RestaurantDao dao;
     
    public Restaurant findById(int id) {
        return dao.findById(id);
    }
       
 	public List<Restaurant> getByZipcodeAndOrderType(Integer zipBustypeMerchantId) {
		return dao.getByZipcodeAndOrderType(zipBustypeMerchantId);
	}
 
	public List<Restaurant> getByTime(Integer zipBustypeMerchantId, String time) {
		return dao.getByZipcodeAndOrderType(zipBustypeMerchantId);
	}

	public void insert(Restaurant restaurant) {
		dao.insert(restaurant);
	}

	public void updateRestaurant(Restaurant restaurant) {
		dao.updateRestaurant(restaurant);
	}

	public void deleteRestaurant(Integer id) {
		dao.deleteRestaurant(id);
	}      
}