package com.lsbc.service.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lsbc.dao.GoodsMapper;
import com.lsbc.model.Goods;
import com.lsbc.service.GoodsService;

@Service
@Transactional
public class GoodsServiceImpl implements GoodsService{
	
	@Resource
	private GoodsMapper goodsMapper;

	@Override
	public Map<String, Object> addGoods(Goods goods) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> modifyGoods(Goods goods) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> getGoods(Goods goods) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> getGoodsList(Goods goods) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> deleteGoods(Goods goods) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
