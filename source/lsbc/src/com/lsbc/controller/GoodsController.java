package com.lsbc.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lsbc.model.Goods;
import com.lsbc.service.GoodsService;

@Controller
@RequestMapping("/goods")
public class GoodsController {
	
	private static final Logger L = LoggerFactory.getLogger(GoodsController.class);
	@Resource
	private GoodsService goodsService;
	
	@RequestMapping("/addGoods.action")
	@ResponseBody
	public Map<String,Object> addGoods(Goods goods){
		L.info(">>>>>>>>>>>>>>>>>>>addGoods");
		return goodsService.addGoods(goods);
	}
	
	@RequestMapping("/delGoods.action")
	@ResponseBody
	public Map<String,Object> delGoods(Goods goods){
		L.info(">>>>>>>>>>>>>>>>>>>delGoods");
		return goodsService.addGoods(goods);
	}
	
	@RequestMapping("/updateGoods.action")
	@ResponseBody
	public Map<String,Object> updateGoods(Goods goods){
		L.info(">>>>>>>>>>>>>>>>>>>updateGoods");
		return goodsService.updateGoods(goods);
	}
	
	@RequestMapping("/getGoods.action")
	@ResponseBody
	public Map<String,Object> getGoods(Goods goods){
		L.info(">>>>>>>>>>>>>>>>>>>getGoods");
		return goodsService.getGoods(goods);
	}
	
	@RequestMapping("/getGoodsList.action")
	@ResponseBody
	public Map<String,Object> getGoodsList(Goods goods){
		L.info(">>>>>>>>>>>>>>>>>>>getGoodsList");
		return goodsService.getGoodsList(goods);
	}
	
}
