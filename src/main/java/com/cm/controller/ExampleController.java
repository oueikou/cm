package com.cm.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cm.entity.CmUser;
import com.cm.service.CmUserService;

@RestController
public class ExampleController {

	Logger logger = LoggerFactory.getLogger(ExampleController.class);

	@Resource(name="cmUserServiceImpl")
	private CmUserService cmUserService;
	
	@RequestMapping("/")
	public String helloWord() {
		logger.debug("测试HelloWorld!!!");
		return "Hello World!!!";
	}

	@RequestMapping("/test")
	public String test() {
		//cmUserService.suUser();
		CmUser u = cmUserService.selectByPrimaryKey(2L);
		logger.debug("----loginName: " + u.getLoginName());
		return u.getLoginName();
		
	}

}
