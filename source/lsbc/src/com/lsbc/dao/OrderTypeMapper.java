package com.lsbc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lsbc.model.OrderType;

@Repository
public interface OrderTypeMapper {

	List<OrderType> findOrderTypeByPage(OrderType pageObject);

	int findPageCount(OrderType OrderType);

	void addOrderType(OrderType OrderType);

	void updateOrderType(OrderType OrderType);

	void delOrderType(OrderType OrderType);

	OrderType getOrderType(OrderType OrderType);

}

