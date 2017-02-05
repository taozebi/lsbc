package com.lsbc.model;

/**
 * 用于处理分页信息
 */
public class Page {

	/**
	 * 页面条数
	 */
	private Integer pageSize;

	/**
	 * 总页面数
	 */
	private Integer countPage;

	/**
	 * 当前页
	 */
	private Integer currentPage;

	/**
	 * 偏移量
	 */
	private Integer offset;

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getCountPage() {
		return countPage;
	}

	public void setCountPage(Integer countPage) {
		this.countPage = countPage;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}
	
}
