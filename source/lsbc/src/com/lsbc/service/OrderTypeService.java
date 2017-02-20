package com.lsbc.service;

import java.util.Map;

import com.lsbc.model.OrderType;

public interface OrderTypeService {
	
	public Map<String,Object> addOrderType(OrderType orderType);
	
	public Map<String,Object> getOrderType(OrderType orderType);
	
	public Map<String,Object> updateOrderType(OrderType orderType);
	
	public Map<String,Object> delOrderType(OrderType orderType);

	public Map<String,Object> getAllOrderType(OrderType orderType);

}
