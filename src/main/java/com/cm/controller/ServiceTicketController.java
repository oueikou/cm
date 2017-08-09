package com.cm.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cm.service.CmServiceTicketService;
import com.cm.vo.CmServiceTicketVo;

@RestController
@RequestMapping("/st")
public class ServiceTicketController extends BaseController {

	@Resource(name = "cmServiceTicketServiceImpl")
	private CmServiceTicketService cmServiceTicketService;

	@RequestMapping(value = "/list", method=RequestMethod.GET)
	public List<CmServiceTicketVo> list() {
		return cmServiceTicketService.getAllServiceTicketOrder();
	}

}
