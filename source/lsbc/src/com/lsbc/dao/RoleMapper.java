package com.lsbc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lsbc.model.Role;

@Repository
public interface RoleMapper {

	List<Role> findRoleByPage(Role pageObject);

	int findPageCount(Role Role);

	void addRole(Role Role);

	void updateRole(Role Role);

	void delRole(Role Role);

	Role getRole(Role Role);

}

