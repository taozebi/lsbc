package com.lsbc.service.impl;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lsbc.dao.GoodsMapper;
import com.lsbc.dao.OrderListMapper;
import com.lsbc.dao.OrderMapper;
import com.lsbc.model.Order;
import com.lsbc.model.OrderList;
import com.lsbc.service.OrderService;
import com.lsbc.util.Constant;

@Service
@Transactional
public class OrderServiceImpl implements OrderService{

	@Resource
	private OrderMapper orderMapper;
	@Resource 
	private OrderListMapper orderListMapper;
	@Resource 
	private GoodsMapper goodsMapper;
	@Resource
	private SimpleDateFormat dateTimeFormat;
	

	@Override
	public Map<String, Object> addOrder(Order order) {
		Map<String,Object> map =new HashMap<String,Object>();
		String id = null;
		if(order.getOrderType() == 1){
			id = "JH";
		}else if(order.getOrderType() == 2){
			id = "TH";
		}else if(order.getOrderType() == 3){
			id = "XS";
		}else if(order.getOrderType() == 4){
			id = "LS";
		}
		id += "-"+dateTimeFormat.format(System.currentTimeMillis());
		order.setId(id);
		orderMapper.addOrder(order);
		for(OrderList orderList: order.getOrderLists()){
			orderList.setInOrderId(id);
			orderListMapper.addOrderList(orderList);
			if(order.getOrderType() == 1 || order.getOrderType() == 2){
				orderListMapper.addGoodsNumber(orderList);
			}else{
				orderListMapper.minusGoodsNumber(orderList);
			}
		}
		map.put(Constant.STATUS, Constant.SUCCESS);
		return map;
	}

	@Override
	public Map<String, Object> getOrder(Order order) {
		Map<String,Object> map =new HashMap<String,Object>();
		Order find = orderMapper.getOrder(order);
		if(find != null){
			map.put(Constant.STATUS, Constant.SUCCESS);
			map.put(Constant.DATA, find);
		}else{
			//添加失败,购买单位为空
			map.put(Constant.STATUS, Constant.FAIL);
		}
		return map;
	}

	@Override
	public Map<String, Object> updateOrder(Order order) {
		Map<String,Object> map =new HashMap<String,Object>();
		orderMapper.updateOrder(order);
		map.put(Constant.STATUS, Constant.SUCCESS);
		return map;
	}

	@Override
	public Map<String, Object> delOrder(Order order) {
		Map<String,Object> map =new HashMap<String,Object>();
		orderMapper.delOrder(order);
		map.put(Constant.STATUS, Constant.SUCCESS);
		return map;
	}

	@Override
	public Map<String, Object> getAllOrder(Order order) {
		Map<String,Object> map =new HashMap<String,Object>();
		List<Order> orders = orderMapper.findOrderByPage(order);
		map.put(Constant.STATUS, Constant.SUCCESS);
		map.put(Constant.DATA, orders);
		return map;
	}
	
}
