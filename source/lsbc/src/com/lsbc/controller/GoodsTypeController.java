package com.lsbc.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lsbc.service.GoodsTypeService;

@Controller
@RequestMapping("/goodsType")
public class GoodsTypeController {

	@Resource
	private GoodsTypeService goodsTypeService;
	
}
