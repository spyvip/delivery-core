package com.corporate.delivery.service.order;

import java.util.List;

import com.corporate.delivery.model.Merchant;
import com.corporate.delivery.model.order.OrderHeader;
import com.corporate.delivery.model.order.OrderProcess;

public interface OrderService {
	
	public String processsOrder(OrderProcess orderProcess);
	
	public List<OrderHeader> getMerchantOrRestaurantOrders(Merchant merchant);
	
}
