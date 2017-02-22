package com.lsbc.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lsbc.dao.OrderListMapper;
import com.lsbc.model.OrderList;
import com.lsbc.service.OrderListService;
import com.lsbc.util.Constant;

@Service
@Transactional
public class OrderListServiceImpl implements OrderListService {

	@Resource
	private OrderListMapper orderListMapper;

	@Override
	public Map<String, Object> addOrderList(OrderList orderList) {
		Map<String, Object> map = new HashMap<String, Object>();
		orderListMapper.addOrderList(orderList);
		map.put(Constant.STATUS, Constant.SUCCESS);
		return map;
	}

	@Override
	public Map<String, Object> getOrderList(OrderList orderList) {
		Map<String, Object> map = new HashMap<String, Object>();
		OrderList order = orderListMapper.getOrderList(orderList);
		if (order != null) {
			map.put(Constant.STATUS, Constant.SUCCESS);
			map.put(Constant.DATA, order);
		} else {
			// 添加失败
			map.put(Constant.STATUS, Constant.FAIL);
		}
		return map;
	}

	@Override
	public Map<String, Object> updateOrderList(OrderList orderList) {
		Map<String, Object> map = new HashMap<String, Object>();
		orderListMapper.updateOrderList(orderList);
		map.put(Constant.STATUS, Constant.SUCCESS);
		return map;
	}

	@Override
	public Map<String, Object> delOrderList(OrderList orderList) {
		Map<String, Object> map = new HashMap<String, Object>();
		orderListMapper.delOrderList(orderList);
		map.put(Constant.STATUS, Constant.SUCCESS);
		// 添加失败
		map.put(Constant.STATUS, Constant.FAIL);
		return map;
	}

	@Override
	public Map<String, Object> getAllOrderList(OrderList orderList) {
		Map<String, Object> map = new HashMap<String, Object>();
		List<OrderList> list = orderListMapper.findOrderListByPage(orderList);
		if (list.size() > 0) {
			map.put(Constant.STATUS, Constant.SUCCESS);
			map.put(Constant.DATA, list);
		} else {
			// 添加失败
			map.put(Constant.STATUS, Constant.FAIL);
		}
		return map;
	}

}
