package com.corporate.delivery.service;
 
import java.util.List;

import com.corporate.delivery.model.Restaurant;
 
public interface RestaurantService {
 
    Restaurant findById(int id);
 
    List<Restaurant> getByZipcodeAndOrderType(Integer zipBustypeMerchantId);
    
    public List<Restaurant> getByTime(Integer zipBustypeMerchantId, String time);
    
    public void insert(Restaurant restaurant);
    
    public void updateRestaurant(Restaurant restaurant);
    
    public void deleteRestaurant(Integer id);
     
}