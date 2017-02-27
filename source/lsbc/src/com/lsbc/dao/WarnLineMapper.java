package com.lsbc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lsbc.model.Goods;
import com.lsbc.model.WarnLine;

@Repository
public interface WarnLineMapper {

	List<Goods> findWarnLineByPage(WarnLine warnLine);

	int findPageCount(WarnLine warnLine);

	void addWarnLine(WarnLine warnLine);

	void updateWarnLine(WarnLine warnLine);

	void delWarnLine(WarnLine warnLine);

	WarnLine getWarnLine(WarnLine warnLine);

}

