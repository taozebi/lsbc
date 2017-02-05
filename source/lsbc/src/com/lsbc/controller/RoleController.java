package com.lsbc.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lsbc.service.RoleService;

@Controller
@RequestMapping("/role")
public class RoleController {

	@Resource
	private RoleService roleService;
	
}
