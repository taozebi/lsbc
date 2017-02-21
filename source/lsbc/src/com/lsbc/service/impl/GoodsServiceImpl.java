package com.lsbc.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lsbc.dao.GoodsMapper;
import com.lsbc.model.Goods;
import com.lsbc.service.GoodsService;
import com.lsbc.util.Constant;

@Service
@Transactional
public class GoodsServiceImpl implements GoodsService{
	
	@Resource
	private GoodsMapper goodsMapper;

	@Override
	public Map<String, Object> addGoods(Goods goods) {
		Map<String,Object> map =new HashMap<String,Object>();
		if(StringUtils.isNotBlank(goods.getGoodsName())){
			//添加商品
			goodsMapper.addGoods(goods);
			map.put(Constant.STATUS, Constant.SUCCESS);
		}else{
			//添加商品失败,商品名为空
			map.put(Constant.STATUS, Constant.FAIL);
		}
		return map;
	}

	@Override
	public Map<String, Object> updateGoods(Goods goods) {
		Map<String,Object> map =new HashMap<String,Object>();
		if(StringUtils.isNotBlank(goods.getGoodsName())){
			//修改商品信息
			goodsMapper.updateGoods(goods);
			map.put(Constant.STATUS, Constant.SUCCESS);
		}else{
			//修改商品信息失败,商品名为空
			map.put(Constant.STATUS, Constant.FAIL);
		}
		return map;
	}

	@Override
	public Map<String, Object> getGoods(Goods goods) {
		Map<String,Object> map =new HashMap<String,Object>();
		Goods find = goodsMapper.getGoods(goods);
		if(find != null){
			//获取商品信息
			map.put(Constant.STATUS, Constant.SUCCESS);
			map.put(Constant.DATA, find);
		}else{
			//获取商品信息失败,商品名为空
			map.put(Constant.STATUS, Constant.FAIL);
		}
		return map;
	}

	@Override
	public Map<String, Object> delGoods(Goods goods) {
		Map<String,Object> map =new HashMap<String,Object>();
		if(StringUtils.isNotBlank(goods.getGoodsName())){
			//删除商品
			goodsMapper.delGoods(goods);
			map.put(Constant.STATUS, Constant.SUCCESS);
		}else{
			//删除商品失败,商品名为空
			map.put(Constant.STATUS, Constant.FAIL);
		}
		return map;
	}
	
	@Override
	public Map<String, Object> getGoodsList(Goods goods) {
		Map<String,Object> map =new HashMap<String,Object>();
		List<Goods> list = goodsMapper.findGoodsByPage(goods);
		map.put(Constant.STATUS, Constant.SUCCESS);
		map.put(Constant.DATA, list);
		return map;
	}
	
}
