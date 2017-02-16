package com.lsbc.service.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lsbc.dao.OrderMapper;
import com.lsbc.model.Order;
import com.lsbc.service.OrderService;
import com.lsbc.util.Constant;

@Service
@Transactional
public class OrderServiceImpl implements OrderService{

	@Resource
	private OrderMapper orderMapper;

	@Override
	public Map<String, Object> addOrder(Order order) {
		Map<String,Object> map =new HashMap<String,Object>();
		Order find = orderMapper.getOrder(order);
		if(find != null){
			map.put(Constant.STATUS, Constant.FAIL);
		}
		if(StringUtils.isNotBlank(order.getCustomer())){
			//添加用户
			orderMapper.addOrder(order);
			map.put(Constant.STATUS, Constant.SUCCESS);
		}else{
			//添加失败,购买单位为空
			map.put(Constant.STATUS, Constant.FAIL);
		}
		return map;
	}

	@Override
	public Map<String, Object> getOrder(Order order) {
		Map<String,Object> map =new HashMap<String,Object>();
		Order find = orderMapper.getOrder(order);
		if(find != null){
			map.put(Constant.STATUS, Constant.SUCCESS);
		}else{
			//添加失败,购买单位为空
			map.put(Constant.STATUS, Constant.FAIL);
		}
		return map;
	}

	@Override
	public Map<String, Object> updateOrder(Order order) {
		Map<String,Object> map =new HashMap<String,Object>();
		if(order.getId() > -1){
			orderMapper.updateOrder(order);
			map.put(Constant.STATUS, Constant.SUCCESS);
		}else{
			//添加失败,购买单位为空
			map.put(Constant.STATUS, Constant.FAIL);
		}
		return map;
	}

	@Override
	public Map<String, Object> delOrder(Order order) {
		Map<String,Object> map =new HashMap<String,Object>();
		if(order.getId() > -1){
			orderMapper.delOrder(order);
			map.put(Constant.STATUS, Constant.SUCCESS);
		}else{
			//添加失败,购买单位为空
			map.put(Constant.STATUS, Constant.FAIL);
		}
		return map;
	}

	@Override
	public Map<String, Object> getAllOrder(Order order) {
		Map<String,Object> map =new HashMap<String,Object>();
		if(order != null){
			orderMapper.findOrderByPage(order);
			map.put(Constant.STATUS, Constant.SUCCESS);
		}else{
			//添加失败,购买单位为空
			map.put(Constant.STATUS, Constant.FAIL);
		}
		return map;
	}
	
}
