package com.he.kcgl.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.he.kcgl.service.KcglService;

@Controller
public class KcglController {
	
	@Resource
	private KcglService kcglService;

	@RequestMapping("/test")
	@ResponseBody
	public Map<String,Object> test(){
		return kcglService.test();
	}
	
}
