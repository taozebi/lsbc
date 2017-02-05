package com.lsbc.model;


public class Role{

	/** id */
	private Long id;

	/** 角色名  */
	private String roleName;

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleName() {
		return roleName;
	}

}

