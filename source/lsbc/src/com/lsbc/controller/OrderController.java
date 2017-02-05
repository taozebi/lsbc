package com.lsbc.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lsbc.service.OrderService;

@Controller
@RequestMapping("/order")
public class OrderController {

	@Resource
	private OrderService orderService;
	
}
