package com.lsbc.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lsbc.dao.GoodsTypeMapper;
import com.lsbc.service.GoodsTypeService;

@Service
@Transactional
public class GoodsTypeServiceImpl implements GoodsTypeService{

	@Resource
	private GoodsTypeMapper goodsTypeMapper;
	
}
