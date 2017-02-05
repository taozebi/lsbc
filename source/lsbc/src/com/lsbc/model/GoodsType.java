package com.lsbc.model;

public class GoodsType extends Page{

	/** id */
	private Long id;

	/** 商品类型  */
	private String goodsTypeName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGoodsTypeName() {
		return goodsTypeName;
	}

	public void setGoodsTypeName(String goodsTypeName) {
		this.goodsTypeName = goodsTypeName;
	}

}

