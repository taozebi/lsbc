package com.lsbc.service.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lsbc.dao.UserInfoMapper;
import com.lsbc.model.UserInfo;
import com.lsbc.service.UserInfoService;
import com.lsbc.util.Constant;

@Service
@Transactional
public class UserInfoServiceImpl implements UserInfoService{

	@Resource
	private UserInfoMapper userInfoMapper;

	@Override
	public Map<String,Object> login(UserInfo user) {
		Map<String,Object> map =new HashMap<String,Object>();
		if(StringUtils.isNotBlank(user.getUsername()) && StringUtils.isNotBlank(user.getPassword())){
			//查询数据库
			UserInfo find = userInfoMapper.getUserInfo(user);
			if(null != find && user.getPassword().equals(find.getPassword())){
				//登录成功
				map.put(Constant.STATUS, 0);
				map.put(Constant.DATA, find);
			}else{
				//查询失败
				map.put(Constant.STATUS, 1);
			}
		}else{
			//输入信息不完整
			map.put(Constant.STATUS, 1);
		}
		return map;
	}

	@Override
	public Map<String, Object> modify(UserInfo user) {
		Map<String,Object> map =new HashMap<String,Object>();
		
		return map;
	}
	
}