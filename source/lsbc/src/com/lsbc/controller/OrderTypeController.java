package com.lsbc.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lsbc.model.OrderType;
import com.lsbc.service.OrderTypeService;

@Controller
@RequestMapping("/orderType")
public class OrderTypeController {
	
	private static final Logger L = LoggerFactory.getLogger(OrderTypeController.class);
	@Resource
	private OrderTypeService orderTypeService;
	
	@RequestMapping("/addGoodsType.action")
	@ResponseBody
	public Map<String,Object> addOrderType(OrderType orderType){
		L.info(">>>>>>>>>>>>>>>>>>>addGoodsType");
		return orderTypeService.addOrderType(orderType);
	}
	
	@RequestMapping("/getGoodsType.action")
	@ResponseBody
	public Map<String,Object> getGoodsType(OrderType orderType){
		L.info(">>>>>>>>>>>>>>>>>>>getGoodsType");
		return orderTypeService.getOrderType(orderType);
	}
	
	@RequestMapping("/delGoodsType.action")
	@ResponseBody
	public Map<String,Object> delGoodsType(OrderType orderType){
		L.info(">>>>>>>>>>>>>>>>>>>delGoodsType");
		return orderTypeService.delOrderType(orderType);
	}
	
	@RequestMapping("/updateGoodsType.action")
	@ResponseBody
	public Map<String,Object> updateGoodsType(OrderType orderType){
		L.info(">>>>>>>>>>>>>>>>>>>updateGoodsType");
		return orderTypeService.updateOrderType(orderType);
	}
	
	@RequestMapping("/getAllGoodsType.action")
	@ResponseBody
	public Map<String,Object> getAllGoodsType(OrderType orderType){
		L.info(">>>>>>>>>>>>>>>>>>>getAllGoodsType");
		return orderTypeService.getAllOrderType(orderType);
	}
}
