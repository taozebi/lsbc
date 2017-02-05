package com.lsbc.dao;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.lsbc.model.Order;

@Repository
public interface OrderMapper {

	List<Order> findOrderByPage(Order pageObject);

	int findPageCount(Order Order);

	void addOrder(Order Order);

	void updateOrder(Order Order);

	void delOrder(Order Order);

	Order getOrder(Order Order);

}

