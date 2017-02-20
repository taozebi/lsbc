package com.lsbc.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lsbc.model.OrderList;
import com.lsbc.service.OrderListService;

@Controller
@RequestMapping("/orderList")
public class OrderListController {

	private static final Logger L = LoggerFactory.getLogger(OrderListController.class);

	@Resource
	private OrderListService orderListService;
	
	@Resource
	
	
	@RequestMapping("/addOrderList.action")
	@ResponseBody
	public Map<String,Object> addOrderList(OrderList order){
		L.info(">>>>>>>>>>>>>>>>>>>addOrderList");
		return orderListService.addOrderList(order);
	}
	
	@RequestMapping("/delOrderList.action")
	@ResponseBody
	public Map<String,Object> delOrderList(OrderList order){
		L.info(">>>>>>>>>>>>>>>>>>>delOrderList");
		return orderListService.delOrderList(order);
	}
	
	@RequestMapping("/updateOrderList.action")
	@ResponseBody
	public Map<String,Object> updateOrderList(OrderList order){
		L.info(">>>>>>>>>>>>>>>>>>>updateOrderList");
		return orderListService.updateOrderList(order);
	}
	
	@RequestMapping("/getOrderList.action")
	@ResponseBody
	public Map<String,Object> getOrderList(OrderList order){
		L.info(">>>>>>>>>>>>>>>>>>>getOrderList");
		return orderListService.getOrderList(order);
	}
	
	@RequestMapping("/getAllOrderList.action")
	@ResponseBody
	public Map<String,Object> getAllOrderList(OrderList order){
		L.info(">>>>>>>>>>>>>>>>>>>getAllOrderList");
		return orderListService.getAllOrderList(order);
	}
	
}
