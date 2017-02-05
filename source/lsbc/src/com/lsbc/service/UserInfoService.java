package com.lsbc.service;

import java.util.Map;

import com.lsbc.model.UserInfo;

public interface UserInfoService {
	
	/**
	 * 登陆
	 * @param UserInfo 用户对象
	 * @return
	 * 	User对象 Json字符串
	 */
	public Map<String,Object> login(UserInfo user);
	
	public Map<String,Object> modify(UserInfo user);

}
