package com.lsbc.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lsbc.dao.OrderTypeMapper;
import com.lsbc.service.OrderTypeService;

@Service
@Transactional
public class OrderTypeServiceImpl implements OrderTypeService{

	@Resource
	private OrderTypeMapper orderTypeMapper;
	
}
