package com.lsbc.service;

import java.util.Map;

import com.lsbc.model.Order;
import com.lsbc.model.OrderList;

public interface OrderListService {
	
public Map<String,Object> addOrderList(OrderList orderList);
	
	public Map<String,Object> getOrderList(OrderList orderList);
	
	public Map<String,Object> updateOrderList(OrderList orderList);
	
	public Map<String,Object> delOrderList(OrderList orderList);

	public Map<String,Object> getAllOrderList(OrderList orderList);

}
