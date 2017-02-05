package com.lsbc.model;


public class OrderType  extends Page{

	/** id */
	private Long id;

	/** 订单类型  */
	private String orderTypeName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrderTypeName() {
		return orderTypeName;
	}

	public void setOrderTypeName(String orderTypeName) {
		this.orderTypeName = orderTypeName;
	}
	
}

