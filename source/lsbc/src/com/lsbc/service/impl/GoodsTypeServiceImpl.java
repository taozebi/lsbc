package com.lsbc.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lsbc.dao.GoodsTypeMapper;
import com.lsbc.model.GoodsType;
import com.lsbc.service.GoodsTypeService;
import com.lsbc.util.Constant;

@Service
@Transactional
public class GoodsTypeServiceImpl implements GoodsTypeService{

	@Resource
	private GoodsTypeMapper goodsTypeMapper;

	@Override
	public Map<String, Object> addGoodsType(GoodsType goodsType) {
		Map<String,Object> map =new HashMap<String,Object>();
		if(goodsType != null && !goodsType.getGoodsTypeName().isEmpty()){
			//获取商品信息
			goodsTypeMapper.addGoodsType(goodsType);
			map.put(Constant.STATUS, Constant.SUCCESS);
		}else{
			//获取商品信息失败,商品名为空
			map.put(Constant.STATUS, Constant.FAIL);
		}
		return map;
	}

	@Override
	public Map<String, Object> getGoodsType(GoodsType goodsType) {
		Map<String,Object> map =new HashMap<String,Object>();
		GoodsType find = goodsTypeMapper.getGoodsType(goodsType);
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
	public Map<String, Object> updateGoodsType(GoodsType goodsType) {
		Map<String,Object> map =new HashMap<String,Object>();
		if(goodsType != null && goodsType.getId()>0){
			//获取商品信息
			goodsTypeMapper.updateGoodsType(goodsType);
			map.put(Constant.STATUS, Constant.SUCCESS);
		}else{
			//获取商品信息失败,商品名为空
			map.put(Constant.STATUS, Constant.FAIL);
		}
		return map;
	}

	@Override
	public Map<String, Object> delGoodsType(GoodsType goodsType) {
		Map<String,Object> map =new HashMap<String,Object>();
		if(goodsType != null && goodsType.getId()>0){
			//获取商品信息
			goodsTypeMapper.delGoodsType(goodsType);
			map.put(Constant.STATUS, Constant.SUCCESS);
		}else{
			//获取商品信息失败,商品名为空
			map.put(Constant.STATUS, Constant.FAIL);
		}
		return map;
	}

	@Override
	public Map<String, Object> getAllGoodsType(GoodsType goodsType) {
		Map<String,Object> map =new HashMap<String,Object>();
		if(goodsType != null){
			List<GoodsType> list = goodsTypeMapper.findGoodsTypeByPage(goodsType);
			if(list.size() > 0){
				//获取商品信息
				map.put(Constant.STATUS, Constant.SUCCESS);
				map.put(Constant.DATA, list);
			}else{
				map.put(Constant.STATUS, Constant.FAIL);
			}
		}else{
			//获取商品信息失败,商品名为空
			map.put(Constant.STATUS, Constant.FAIL);
		}
		return map;
	}
	
}
