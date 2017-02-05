package com.lsbc.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lsbc.service.OrderTypeService;

@Controller
@RequestMapping("/orderType")
public class OrderTypeController {

	@Resource
	private OrderTypeService orderTypeService;
	
}
