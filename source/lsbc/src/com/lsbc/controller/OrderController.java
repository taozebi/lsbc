package com.lsbc.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lsbc.model.Order;
import com.lsbc.service.OrderService;

@Controller
@RequestMapping("/order")
public class OrderController {

	private static final Logger L = LoggerFactory.getLogger(OrderController.class);
	@Resource
	private OrderService orderService;
	
	
	@RequestMapping("/addOrder.action")
	@ResponseBody
	public Map<String,Object> addOrder(@RequestBody Order order){
		L.info(">>>>>>>>>>>>>>>>>>>addOrder");
		return orderService.addOrder(order);
	}
	
	@RequestMapping("/delOrder.action")
	@ResponseBody
	public Map<String,Object> delOrder(Order order){
		L.info(">>>>>>>>>>>>>>>>>>>delOrder");
		return orderService.delOrder(order);
	}
	
	@RequestMapping("/updateOrder.action")
	@ResponseBody
	public Map<String,Object> updateOrder(Order order){
		L.info(">>>>>>>>>>>>>>>>>>>updateOrder");
		return orderService.updateOrder(order);
	}
	
	@RequestMapping("/getOrder.action")
	@ResponseBody
	public Map<String,Object> getOrder(Order order){
		L.info(">>>>>>>>>>>>>>>>>>>getOrder");
		return orderService.getOrder(order);
	}
	
	@RequestMapping("/getAllOrder.action")
	@ResponseBody
	public Map<String,Object> getAllOrder(Order order){
		L.info(">>>>>>>>>>>>>>>>>>>getAllOrder");
		return orderService.getAllOrder(order);
	}
	
}
