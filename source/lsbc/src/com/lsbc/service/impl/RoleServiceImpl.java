package com.lsbc.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lsbc.dao.RoleMapper;
import com.lsbc.service.RoleService;

@Service
@Transactional
public class RoleServiceImpl implements RoleService{

	@Resource
	private RoleMapper roleMapper;
	
}
