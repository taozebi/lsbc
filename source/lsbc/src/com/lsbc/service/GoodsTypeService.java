package com.lsbc.service;

import java.util.Map;

import com.lsbc.model.GoodsType;

public interface GoodsTypeService {
	
	public Map<String,Object> addGoodsType(GoodsType goodsType);
	
	public Map<String,Object> getGoodsType(GoodsType goodsType);
	
	public Map<String,Object> updateGoodsType(GoodsType goodsType);
	
	public Map<String,Object> delGoodsType(GoodsType goodsType);

	public Map<String,Object> getAllGoodsType(GoodsType goodsType);

}
