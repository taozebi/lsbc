package com.lsbc.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lsbc.model.UserInfo;
import com.lsbc.service.UserInfoService;

@Controller
@RequestMapping("/userInfo")
public class UserInfoController {
	
	private static final Logger L = LoggerFactory.getLogger(UserInfoController.class);

	@Resource
	private UserInfoService userInfoService;
	
	@RequestMapping("/login.action")
	@ResponseBody
	public Map<String,Object> login(UserInfo user){
		L.info(">>>>>>>>>>>>>>>>>>>login");
		return userInfoService.login(user);
	}
	@RequestMapping("/addUser.action")
	@ResponseBody
	public Map<String,Object> addUser(UserInfo user){
		L.info(">>>>>>>>>>>>>>>>>>>addUser");
		return userInfoService.addUser(user);
	}
	
}
