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
				map.put(Constant.STATUS, Constant.SUCCESS);
				map.put(Constant.DATA, find);
			}else{
				//查询失败
				map.put(Constant.STATUS, Constant.FAIL);
			}
		}else{
			//输入信息不完整
			map.put(Constant.STATUS, Constant.FAIL);
		}
		return map;
	}

	@Override
	public Map<String, Object> modifyUserInfo(UserInfo user) {
		Map<String,Object> map =new HashMap<String,Object>();
		if(StringUtils.isNotBlank(user.getUsername()) && StringUtils.isNotBlank(user.getPassword())){
			//更新用户信息
			userInfoMapper.updateUserInfo(user);
			map.put(Constant.STATUS, Constant.SUCCESS);
		}else{
			//更新失败,用户名或者密码为空
			map.put(Constant.STATUS, Constant.FAIL);
		}
		return map;
	}

	@Override
	public Map<String, Object> addUserInfo(UserInfo user) {
		Map<String,Object> map =new HashMap<String,Object>();
		UserInfo find = userInfoMapper.getUserInfo(user);
		if(find != null){
			map.put(Constant.STATUS, Constant.FAIL);
		}
		if(StringUtils.isNotBlank(user.getUsername()) && StringUtils.isNotBlank(user.getPassword())){
			//添加用户
			userInfoMapper.addUserInfo(user);
			map.put(Constant.STATUS, Constant.SUCCESS);
		}else{
			//添加失败,用户名或者密码为空
			map.put(Constant.STATUS, Constant.FAIL);
		}
		return map;
	}

	@Override
	public Map<String, Object> getUserInfoList(UserInfo user) {
		Map<String,Object> map =new HashMap<String,Object>();
		//添加用户
		userInfoMapper.findUserInfoByPage(user);
		map.put(Constant.STATUS, Constant.SUCCESS);
		return map;
	}

	@Override
	public Map<String, Object> deleteUserInfo(UserInfo user) {
		Map<String,Object> map =new HashMap<String,Object>();
		if(StringUtils.isNotBlank(user.getUsername()) && StringUtils.isNotBlank(user.getPassword())){
			//删除用户
			userInfoMapper.delUserInfo(user);
			map.put(Constant.STATUS, Constant.SUCCESS);
		}else{
			//删除失败,用户名或者密码为空
			map.put(Constant.STATUS, Constant.FAIL);
		}
		return map;
	}

}
