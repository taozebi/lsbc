package com.lsbc.model;

public class OrderList extends Page{

	/** id */
	private Long id;

	/** 订单号  */
	private Long inOrderId;

	/** 商品id  */
	private Long goodsId;

	/** 商品数量  */
	private Integer number;

	/** 商品单价  */
	private Float price;

	/** 实际售价  */
	private Float money;

	/** 退货单中的来自哪个订单号  */
	private Long byOrderId;

	/** 备注  */
	private String remark;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getInOrderId() {
		return inOrderId;
	}

	public void setInOrderId(Long inOrderId) {
		this.inOrderId = inOrderId;
	}

	public Long getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Float getMoney() {
		return money;
	}

	public void setMoney(Float money) {
		this.money = money;
	}

	public Long getByOrderId() {
		return byOrderId;
	}

	public void setByOrderId(Long byOrderId) {
		this.byOrderId = byOrderId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}

