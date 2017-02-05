package com.lsbc.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lsbc.service.OrderListService;

@Controller
@RequestMapping("/orderList")
public class OrderListController {

	@Resource
	private OrderListService orderListService;
	
}
