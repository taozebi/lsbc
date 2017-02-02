package com.he.kcgl.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.he.kcgl.service.KcglService;

@Service
@Transactional
public class KcglServiceImpl implements KcglService{

	@Override
	public Map<String, Object> test() {
		Map<String,Object> map = new HashMap<>();
		map.put("姓名", "何志远");
		return map;
	}
	
}
