package com.lsbc.model;

public class WarnLine  extends Page{
	
	/** id */
	private Long id;
	
	/** 商品id */
	private Long goodsId;
	
	/** 警戒线 */
	private Integer warnLine;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}

	public Integer getWarnLine() {
		return warnLine;
	}

	public void setWarnLine(Integer warnLine) {
		this.warnLine = warnLine;
	}

}
