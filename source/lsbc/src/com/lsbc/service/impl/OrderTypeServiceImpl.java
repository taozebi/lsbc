package com.lsbc.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lsbc.dao.OrderTypeMapper;
import com.lsbc.model.OrderType;
import com.lsbc.service.OrderTypeService;
import com.lsbc.util.Constant;

@Service
@Transactional
public class OrderTypeServiceImpl implements OrderTypeService{

	@Resource
	private OrderTypeMapper orderTypeMapper;

	@Override
	public Map<String, Object> addOrderType(OrderType orderType) {
		Map<String,Object> map =new HashMap<String,Object>();
		OrderType find = orderTypeMapper.getOrderType(orderType);
		if(find != null){
			map.put(Constant.STATUS, Constant.FAIL);
		}
		if(StringUtils.isNotBlank(orderType.getOrderTypeName())){
			//添加用户
			orderTypeMapper.addOrderType(orderType);
			map.put(Constant.STATUS, Constant.SUCCESS);
		}else{
			//添加失败,购买单位为空
			map.put(Constant.STATUS, Constant.FAIL);
		}
		return map;
	}

	@Override
	public Map<String, Object> getOrderType(OrderType orderType) {
		Map<String,Object> map =new HashMap<String,Object>();
		OrderType find = orderTypeMapper.getOrderType(orderType);
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
	public Map<String, Object> updateOrderType(OrderType orderType) {
		Map<String,Object> map =new HashMap<String,Object>();
		if(orderType.getId() > -1){
			orderTypeMapper.updateOrderType(orderType);
			map.put(Constant.STATUS, Constant.SUCCESS);
		}else{
			//添加失败,购买单位为空
			map.put(Constant.STATUS, Constant.FAIL);
		}
		return map;
	}

	@Override
	public Map<String, Object> delOrderType(OrderType orderType) {
		Map<String,Object> map =new HashMap<String,Object>();
		if(orderType.getId() > -1){
			orderTypeMapper.delOrderType(orderType);
			map.put(Constant.STATUS, Constant.SUCCESS);
		}else{
			//添加失败,购买单位为空
			map.put(Constant.STATUS, Constant.FAIL);
		}
		return map;
	}

	@Override
	public Map<String, Object> getAllOrderType(OrderType orderType) {
		Map<String,Object> map =new HashMap<String,Object>();
		List<OrderType> orders = orderTypeMapper.findOrderTypeByPage(orderType);
		if(orders.size()> 0){
			map.put(Constant.STATUS, Constant.SUCCESS);
			map.put(Constant.DATA, orders);
		}else{
			//添加失败,购买单位为空
			map.put(Constant.STATUS, Constant.FAIL);
		}
		return map;
	}
	
}
