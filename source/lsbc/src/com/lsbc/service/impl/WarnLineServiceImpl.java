package com.lsbc.service.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lsbc.dao.WarnLineMapper;
import com.lsbc.model.WarnLine;
import com.lsbc.service.WarnLineService;
import com.lsbc.util.Constant;

@Service
@Transactional
public class WarnLineServiceImpl implements WarnLineService {
	
	@Resource
	private WarnLineMapper warnLineMapper;

	@Override
	public Map<String, Object> addWarnLine(WarnLine warnLine) {
		Map<String,Object> map =new HashMap<String,Object>();
		warnLineMapper.addWarnLine(warnLine);
		map.put(Constant.STATUS, Constant.SUCCESS);
		return map;
	}

	@Override
	public Map<String, Object> updateWarnLine(WarnLine warnLine) {
		Map<String,Object> map =new HashMap<String,Object>();
		warnLineMapper.updateWarnLine(warnLine);
		map.put(Constant.STATUS, Constant.SUCCESS);
		return map;
	}

	@Override
	public Map<String, Object> getWarnLine(WarnLine warnLine) {
		Map<String,Object> map =new HashMap<String,Object>();
		warnLineMapper.getWarnLine(warnLine);
		map.put(Constant.STATUS, Constant.SUCCESS);
		return map;
	}

	@Override
	public Map<String, Object> getWarnLineList(WarnLine warnLine) {
		Map<String,Object> map =new HashMap<String,Object>();
		warnLineMapper.findWarnLineByPage(warnLine);
		map.put(Constant.STATUS, Constant.SUCCESS);
		return map;
	}

	@Override
	public Map<String, Object> delWarnLine(WarnLine warnLine) {
		Map<String,Object> map =new HashMap<String,Object>();
		warnLineMapper.delWarnLine(warnLine);
		map.put(Constant.STATUS, Constant.SUCCESS);
		return map;
	}

}
