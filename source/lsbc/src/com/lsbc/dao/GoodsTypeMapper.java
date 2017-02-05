package com.lsbc.dao;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.lsbc.model.GoodsType;

@Repository
public interface GoodsTypeMapper {

	List<GoodsType> findGoodsTypeByPage(GoodsType pageObject);

	int findPageCount(GoodsType GoodsType);

	void addGoodsType(GoodsType GoodsType);

	void updateGoodsType(GoodsType GoodsType);

	void delGoodsType(GoodsType GoodsType);

	GoodsType getGoodsType(GoodsType GoodsType);

}

