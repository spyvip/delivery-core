package com.corporate.delivery.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.corporate.delivery.model.FilterOrder;
import com.corporate.delivery.model.order.OrderHeader;


public interface OrderHeaderService {

	public List<OrderHeader> getOrderHeader(Integer userId);
	
	public List<OrderHeader> getMerchantOrRestaurantOrders(Integer zipBustypeMerchantId);
	
	public List<OrderHeader> getOrderHeaderDetail(Integer zipBustypeMerchantId, String fromdate, String todate);
	
	public void insert(OrderHeader orderHeader) ;
	
	public void updateOrderHeader(OrderHeader orderHeader);
	
	public void deleteOrderHeader(OrderHeader orderHeader);
	
	public void updateOrderStatus(String id, String orderStatus);
	
	Integer processOrder(Integer userId);
	
	public List<OrderHeader> getOrderByFilter(String userType,String orderType,String fromdate,String todate);
}
