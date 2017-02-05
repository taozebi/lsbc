package com.lsbc.dao;

import java.util.List;
import com.lsbc.model.Goods;

import org.springframework.stereotype.Repository;

@Repository
public interface GoodsMapper {

	List<Goods> findGoodsByPage(Goods pageObject);

	int findPageCount(Goods Goods);

	void addGoods(Goods Goods);

	void updateGoods(Goods Goods);

	void delGoods(Goods Goods);

	Goods getGoods(Goods Goods);

}

