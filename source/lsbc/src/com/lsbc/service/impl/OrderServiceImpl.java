package com.lsbc.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lsbc.dao.OrderMapper;
import com.lsbc.service.OrderService;

@Service
@Transactional
public class OrderServiceImpl implements OrderService{

	@Resource
	private OrderMapper orderMapper;
	
}
