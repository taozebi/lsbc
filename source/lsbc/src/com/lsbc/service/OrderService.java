package com.lsbc.service;

import java.util.Map;

import com.lsbc.model.Order;

public interface OrderService {
	
	public Map<String,Object> addOrder(Order order);
	
	public Map<String,Object> getOrder(Order order);
	
	public Map<String,Object> updateOrder(Order order);
	
	public Map<String,Object> delOrder(Order order);

	public Map<String,Object> getAllOrder(Order order);

}
