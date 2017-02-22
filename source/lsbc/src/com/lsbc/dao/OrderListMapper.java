package com.lsbc.dao;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.lsbc.model.OrderList;

@Repository
public interface OrderListMapper {

	List<OrderList> findOrderListByPage(OrderList pageObject);

	int findPageCount(OrderList OrderList);

	void addOrderList(OrderList OrderList);

	void updateOrderList(OrderList OrderList);

	void delOrderList(OrderList OrderList);

	OrderList getOrderList(OrderList OrderList);

	void addGoodsNumber(OrderList orderList);
	
	void minusGoodsNumber(OrderList orderList);

}

