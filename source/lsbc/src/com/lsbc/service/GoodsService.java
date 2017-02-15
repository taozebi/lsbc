package com.lsbc.service;

import java.util.Map;

import com.lsbc.model.Goods;

public interface GoodsService {
	
	/**
	 * 添加商品
	 * @param goods
	 * @return
	 */
	public Map<String,Object> addGoods(Goods goods);
	
	/**
	 * 修改商品信息
	 * @param goods
	 * @return
	 */
	public Map<String,Object> updateGoods(Goods goods);
	
	/**
	 * 获取某一个商品信息
	 * @param goods
	 * @return
	 */
	public Map<String,Object> getGoods(Goods goods);
	
	/**
	 * 获取商品信息列表
	 * @param goods
	 * @return
	 */
	public Map<String,Object> getGoodsList(Goods goods);
	
	/**
	 * 删除商品
	 * @param goods
	 * @return
	 */
	public Map<String,Object> delGoods(Goods goods);
	
	

}
