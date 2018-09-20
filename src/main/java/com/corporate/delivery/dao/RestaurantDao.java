package com.corporate.delivery.dao;
 
import java.util.List;

import com.corporate.delivery.model.Restaurant;
 
public interface RestaurantDao {
 
    Restaurant findById(int id);
 
    List<Restaurant> getByZipcodeAndOrderType(Integer zipBustypeMerchantId);
   
   List<Restaurant> getByTime(Integer zipBustypeMerchantId, String time);
 
   public void insert(Restaurant restaurant);
   
   public void updateRestaurant(Restaurant restaurant);
   
   public void deleteRestaurant(Integer id);
     
}