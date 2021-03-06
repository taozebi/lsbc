package com.lsbc.model;

import java.util.Date;
import java.util.List;

public class Order extends Page{

	/** id */
	private String id;

	/** 订单日期  */
	private Date orderDate;

	/** 客户  */
	private String customer;

	/** 总金额  */
	private Float money;

	/** 支付类型  */
	private Integer payType;

	/** 实际金额  */
	private Float realMoney;

	/** 订单类型  */
	private Integer orderType;

	/** 操作人ID  */
	private Long userId;
	
	/**商品订单详情*/
	private List<OrderList> orderLists;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public Float getMoney() {
		return money;
	}

	public void setMoney(Float money) {
		this.money = money;
	}

	public Integer getPayType() {
		return payType;
	}

	public void setPayType(Integer payType) {
		this.payType = payType;
	}

	public Float getRealMoney() {
		return realMoney;
	}

	public void setRealMoney(Float realMoney) {
		this.realMoney = realMoney;
	}

	public Integer getOrderType() {
		return orderType;
	}

	public void setOrderType(Integer orderType) {
		this.orderType = orderType;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public List<OrderList> getOrderLists() {
		return orderLists;
	}

	public void setOrderLists(List<OrderList> orderLists) {
		this.orderLists = orderLists;
	}
	
}

