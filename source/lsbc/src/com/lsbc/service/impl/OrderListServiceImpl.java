package com.lsbc.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lsbc.dao.OrderListMapper;
import com.lsbc.service.OrderListService;


@Service
@Transactional
public class OrderListServiceImpl implements OrderListService{

	@Resource
	private OrderListMapper orderListMapper;
	
}
