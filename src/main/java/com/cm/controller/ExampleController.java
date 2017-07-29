package com.cm.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cm.entity.CmUser;
import com.cm.service.CmUserService;
import com.github.pagehelper.Page;

@RestController
public class ExampleController extends BaseController {

	Logger logger = LoggerFactory.getLogger(ExampleController.class);

	@Resource(name = "cmUserServiceImpl")
	private CmUserService cmUserService;

	@RequestMapping("/")
	public String helloWord() {
		logger.debug("测试HelloWorld!!!");
		return "Hello World!!!";
	}

	@RequestMapping("/test")
	public String test(Page<CmUser> page) {
		// cmUserService.suUser();
		CmUser u = cmUserService.selectByPrimaryKey(2L);
		logger.debug("----loginName: " + u.getLoginName());

		page.setPageSize(2);
		Page<CmUser> l = cmUserService.findPageList(new CmUser(), page);
		logger.debug("-----size:  " + l.size());
		logger.debug("-----total size:  " + l.getTotal());
		logger.debug("-----日期:  " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		return u.getLoginName();

	}
	
	@RequestMapping("/testInser")
	public CmUser testUserInsert(CmUser cmUser){
		cmUserService.insert(cmUser);
		return cmUser;
	}

}
