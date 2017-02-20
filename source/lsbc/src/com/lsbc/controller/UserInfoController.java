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
	
	@RequestMapping("/addUserInfo.action")
	@ResponseBody
	public Map<String,Object> addUserInfo(UserInfo user){
		L.info(">>>>>>>>>>>>>>>>>>>addUserInfo");
		return userInfoService.addUserInfo(user);
	}
	
	@RequestMapping("/getUserInfoList.action")
	@ResponseBody
	public Map<String,Object> getUserInfoList(UserInfo user){
		L.info(">>>>>>>>>>>>>>>>>>>getUserInfoList");
		return userInfoService.getUserInfoList(user);
	}
	
	@RequestMapping("/getUserInfo.action")
	@ResponseBody
	public Map<String,Object> getUserInfo(UserInfo user){
		L.info(">>>>>>>>>>>>>>>>>>>getUserInfo");
		return userInfoService.getUserInfo(user);
	}
	
	@RequestMapping("/updateUserInfo.action")
	@ResponseBody
	public Map<String,Object> updateUserInfo(UserInfo user){
		L.info(">>>>>>>>>>>>>>>>>>>modifyUserInfo");
		return userInfoService.updateUserInfo(user);
	}
	
	@RequestMapping("/deleteUserInfo.action")
	@ResponseBody
	public Map<String,Object> deleteUserInfo(UserInfo user){
		L.info(">>>>>>>>>>>>>>>>>>>deleteUserInfo");
		return userInfoService.deleteUserInfo(user);
	}
}
