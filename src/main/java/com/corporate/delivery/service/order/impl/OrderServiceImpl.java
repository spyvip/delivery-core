package com.corporate.delivery.service.order.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.corporate.delivery.dao.CouponUserDao;
import com.corporate.delivery.dao.OrderAddressDao;
import com.corporate.delivery.dao.OrderHeaderDao;
import com.corporate.delivery.dao.OrderItemsDao;
import com.corporate.delivery.dao.OrderRestaurantMenuDao;
import com.corporate.delivery.dao.OrderRestaurantMenuSectionDao;
import com.corporate.delivery.dao.OrderStatusDao;
import com.corporate.delivery.model.Merchant;
import com.corporate.delivery.model.OrderRestaurantMenu;
import com.corporate.delivery.model.RestaurantMenuDto;
import com.corporate.delivery.model.order.OrderAddresses;
import com.corporate.delivery.model.order.OrderHeader;
import com.corporate.delivery.model.order.OrderProcess;
import com.corporate.delivery.model.order.OrderRestaurant;
import com.corporate.delivery.model.order.OrderStatus;
import com.corporate.delivery.model.order.OrderStatusEnum;
import com.corporate.delivery.service.order.OrderService;


@Service("orderService")
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderHeaderDao 	orderHeaderDao;
	
	@Autowired 
	OrderAddressDao orderAddressDao;
	
	@Autowired
	OrderItemsDao orderItemsDao;
	
	@Autowired
	CouponUserDao couponUserDao;
	
	@Autowired
	OrderStatusDao orderStatusDao;
	
	@Autowired
	OrderRestaurantMenuDao orderRestaurantMenuDao;
	
	@Autowired
	OrderRestaurantMenuSectionDao orderRestaurantMenuSectionDao;
	
	@Transactional
	public String processsOrder(OrderProcess orderProcess) {
		//Insert data into ORDER_HEADER table
		//Insert data into ORDER_ADDRESS( Shipping Address,  Billing Address)
		//Credit Card Validation and charge
		//Update data into ORDER_STATUS table  as OPEN( with OPEN_DATE, OPEN_TIME)
		//Insert data into USER_COUPON table
			
		OrderHeader orderHeader = orderProcess.getOrderHeader();
		List<RestaurantMenuDto> restaurantMenuDtos = orderProcess.getRestaurantMenuDtos();
		OrderAddresses orderAddresses = orderProcess.getOrderAddresses();
		OrderStatus   orderStatus =	orderProcess.getOrderStatus(); 
		
		System.out.println(orderHeader.getId());
		orderHeaderDao.insert(orderHeader);
		System.out.println(orderHeader.getId());
		
		setOrderId(orderHeader, restaurantMenuDtos, orderAddresses, orderStatus);
	
		for( RestaurantMenuDto restaurantMenuDto : restaurantMenuDtos ) {		
			OrderRestaurant orderRestaurant = restaurantMenuDto.getOrderRestaurant();
			
			System.out.println("Before id" + orderRestaurant.getId());
			orderItemsDao.insert(orderRestaurant);
			System.out.println("After id" + orderRestaurant.getId());
			
			List<OrderRestaurantMenu>  orderRestaurantMenuList = restaurantMenuDto.getOrderRestaurantMenus();
			setOrderRestaurantInMenu(orderRestaurant, orderRestaurantMenuList);
			
			for(OrderRestaurantMenu  orderRestaurantMenu : orderRestaurantMenuList) {
				System.out.println("Before insert " +  orderRestaurantMenu.getId());
				orderRestaurantMenuDao.insert(orderRestaurantMenu);
				System.out.println("After insert" + orderRestaurantMenu.getId());
			}
		}
		
		orderAddressDao.insert(orderAddresses);
		orderStatusDao.insert(orderStatus);
	
		/*Credit card Charge */
		// Call Credit card API.
		/*
		* try{
		* 	if(Credit card fails){}
		* }
		* 	then throw custom run time exception 
		*/	
		//couponUserDao.insert(orderProcess.getCouponUser());
		
		/*if(true) {
			throw new RuntimeException("Exp. testing");
		}*/
		return orderProcess.getOrderHeader().getId().toString();
	}
	
	private void setOrderRestaurantInMenu(OrderRestaurant orderRestaurant, List<OrderRestaurantMenu> orderRestaurantMenuList) {	 
		for( OrderRestaurantMenu orderRestaurantMenu : orderRestaurantMenuList ){
			orderRestaurantMenu.setOrderRestaurantId(orderRestaurant.getId());
		}
	}

	private void setOrderId(OrderHeader orderHeader, List<RestaurantMenuDto> restaurantMenuDtos, OrderAddresses orderAddresses, OrderStatus orderStatus) {
		Integer orderId = orderHeader.getId();
		orderAddresses.setOrderId(orderId);		
		for(RestaurantMenuDto restaurantMenuDto : restaurantMenuDtos) {
			restaurantMenuDto.getOrderRestaurant().setOrderId(orderId);
		}	
		orderStatus.setOrderId(orderId);
	}
	
	/*
	private void setOrderId(OrderHeader orderHeader, List<OrderRestaurant> orderItems, OrderAddresses orderAddresses, OrderStatus orderStatus) {
		Integer orderId = orderHeader.getId();
		orderAddresses.setOrderId(orderId);
		
		// loop thr the list and set id on it.
		//orderItems.setOrderId(orderId);
		
		orderStatus.setOrderId(orderId);
	}
	*/
	
	private void updateOrderStatusOpen(OrderStatus orderStatus, OrderStatusEnum orderStatusEnum) {		
		orderStatus.setOpenStatus(orderStatusEnum.getValue());
		//	orderStatus.setOpenDate(new Date());
		//	orderStatus.setOpenStatus(orderStatusEnum.getValue());
		//	orderStatus.setOpenTime(LocalDateTime.now().toString());
	}

	public List<OrderHeader> getMerchantOrRestaurantOrders(Merchant merchant) {
		return null;
	}

}
