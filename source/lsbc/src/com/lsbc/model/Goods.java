package com.lsbc.model;

public class Goods extends Page{

	/** id */
	private Long id;

	/** 商品名  */
	private String goodsName;

	/** 进价  */
	private Float inPrice;

	/** 出货价  */
	private Float outPrice;

	/** 产地  */
	private String address;

	/** 厂家  */
	private String factory;

	/** 数量  */
	private Integer number;

	/** 单位  */
	private String unit;

	/** 商品类别id  */
	private Long goodsTypeId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public Float getInPrice() {
		return inPrice;
	}

	public void setInPrice(Float inPrice) {
		this.inPrice = inPrice;
	}

	public Float getOutPrice() {
		return outPrice;
	}

	public void setOutPrice(Float outPrice) {
		this.outPrice = outPrice;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFactory() {
		return factory;
	}

	public void setFactory(String factory) {
		this.factory = factory;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Long getGoodsTypeId() {
		return goodsTypeId;
	}

	public void setGoodsTypeId(Long goodsTypeId) {
		this.goodsTypeId = goodsTypeId;
	}
	
}

