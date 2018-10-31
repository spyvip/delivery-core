package com.corporate.delivery.dao;

import java.util.List;

import com.corporate.delivery.model.FilterOrder;
import com.corporate.delivery.model.order.OrderHeader;

public interface OrderHeaderDao {
	
	public List<OrderHeader> getOrderHeader(Integer userId);
	
	public List<OrderHeader> getMerchantOrRestaurantOrders(Integer zipBustypeMerchantId);
	
	public List<OrderHeader> getOrderHeaderDetail(Integer zipBustypeMerchantId, String fromdate, String todate);
	
	public void insert(OrderHeader orderHeader) ;
	
	public void updateOrderHeader(OrderHeader orderHeader);
	
	public void deleteOrderHeader(Integer userId);

	public void updateOrderStatus(String id, String orderStatus);
	
	public List<OrderHeader> getOrderByFilter(String userType, String orderType, String fromdate, String todate);
}
