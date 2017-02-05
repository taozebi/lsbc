package com.lsbc.dao;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.lsbc.model.UserInfo;

@Repository
public interface UserInfoMapper {

	List<UserInfo> findUserInfoByPage(UserInfo pageObject);

	int findPageCount(UserInfo UserInfo);

	void addUserInfo(UserInfo UserInfo);

	void updateUserInfo(UserInfo UserInfo);

	void delUserInfo(UserInfo UserInfo);

	UserInfo getUserInfo(UserInfo UserInfo);

}

