package com.cm.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

	Logger logger = LoggerFactory.getLogger(ExampleController.class);
	
	@RequestMapping("/")
	public String HelloWord() {
		logger.debug("测试HelloWorld!!!");
		return "Hello World!!!";
	}

}
