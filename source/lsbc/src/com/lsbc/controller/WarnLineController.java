package com.lsbc.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lsbc.model.WarnLine;
import com.lsbc.service.WarnLineService;

@Controller
@RequestMapping("/warnline")
public class WarnLineController {
	
	private static final Logger L = LoggerFactory.getLogger(WarnLineController.class);
	@Resource
	private WarnLineService warnLineService;
	
	@RequestMapping("/addWarnLine.action")
	@ResponseBody
	public Map<String,Object> addWarnLine(WarnLine warnLine){
		L.info(">>>>>>>>>>>>>>>>>>>addWarnLine");
		return warnLineService.addWarnLine(warnLine);
	}
	
	@RequestMapping("/delWarnLine.action")
	@ResponseBody
	public Map<String,Object> delWarnLine(WarnLine warnLine){
		L.info(">>>>>>>>>>>>>>>>>>>delWarnLine");
		return warnLineService.delWarnLine(warnLine);
	}
	
	@RequestMapping("/updateWarnLine.action")
	@ResponseBody
	public Map<String,Object> updateWarnLine(WarnLine warnLine){
		L.info(">>>>>>>>>>>>>>>>>>>updateWarnLine");
		return warnLineService.updateWarnLine(warnLine);
	}
	
	@RequestMapping("/getWarnLine.action")
	@ResponseBody
	public Map<String,Object> getWarnLine(WarnLine warnLine){
		L.info(">>>>>>>>>>>>>>>>>>>getWarnLine");
		return warnLineService.getWarnLine(warnLine);
	}
	
	@RequestMapping("/getWarnLineList.action")
	@ResponseBody
	public Map<String,Object> getWarnLineList(WarnLine warnLine){
		L.info(">>>>>>>>>>>>>>>>>>>getWarnLineList");
		return warnLineService.getWarnLineList(warnLine);
	}
	
}
