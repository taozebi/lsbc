package com.lsbc.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lsbc.model.GoodsType;
import com.lsbc.service.GoodsTypeService;

@Controller
@RequestMapping("/goodsType")
public class GoodsTypeController {
	
	private static final Logger L = LoggerFactory.getLogger(GoodsTypeController.class);

	@Resource
	private GoodsTypeService goodsTypeService;
	
	@RequestMapping("/addGoodsType.action")
	@ResponseBody
	public Map<String,Object> addGoodsType(GoodsType goodsType){
		L.info(">>>>>>>>>>>>>>>>>>>addGoodsType");
		return goodsTypeService.addGoodsType(goodsType);
	}
	
	@RequestMapping("/getGoodsType.action")
	@ResponseBody
	public Map<String,Object> getGoodsType(GoodsType goodsType){
		L.info(">>>>>>>>>>>>>>>>>>>getGoodsType");
		return goodsTypeService.getGoodsType(goodsType);
	}
	
	@RequestMapping("/delGoodsType.action")
	@ResponseBody
	public Map<String,Object> delGoodsType(GoodsType goodsType){
		L.info(">>>>>>>>>>>>>>>>>>>delGoodsType");
		return goodsTypeService.delGoodsType(goodsType);
	}
	
	@RequestMapping("/updateGoodsType.action")
	@ResponseBody
	public Map<String,Object> updateGoodsType(GoodsType goodsType){
		L.info(">>>>>>>>>>>>>>>>>>>updateGoodsType");
		return goodsTypeService.updateGoodsType(goodsType);
	}
	
	@RequestMapping("/getAllGoodsType.action")
	@ResponseBody
	public Map<String,Object> getAllGoodsType(GoodsType goodsType){
		L.info(">>>>>>>>>>>>>>>>>>>getAllGoodsType");
		return goodsTypeService.getAllGoodsType(goodsType);
	}
	
}
