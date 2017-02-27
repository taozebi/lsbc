package com.lsbc.service;

import java.util.Map;

import com.lsbc.model.WarnLine;

public interface WarnLineService {
	
	/**
	 * 添加警戒线
	 * @param warnLine
	 * @return
	 */
	public Map<String,Object> addWarnLine(WarnLine warnLine);
	
	/**
	 * 修改警戒线信息
	 * @param warnLine
	 * @return
	 */
	public Map<String,Object> updateWarnLine(WarnLine warnLine);
	
	/**
	 * 获取某一个商品警戒线信息
	 * @param warnLine
	 * @return
	 */
	public Map<String,Object> getWarnLine(WarnLine warnLine);
	
	/**
	 * 获取商品警戒线信息列表
	 * @param warnLine
	 * @return
	 */
	public Map<String,Object> getWarnLineList(WarnLine warnLine);
	
	/**
	 * 删除商品警戒线
	 * @param warnLine
	 * @return
	 */
	public Map<String,Object> delWarnLine(WarnLine warnLine);
	
	

}
