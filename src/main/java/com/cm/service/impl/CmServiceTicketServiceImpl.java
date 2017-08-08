package com.cm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cm.dao.CmServiceTicketDao;
import com.cm.entity.CmServiceTicket;
import com.cm.service.CmServiceTicketService;

@Service
public class CmServiceTicketServiceImpl extends BaseServiceImpl<CmServiceTicket, Long> implements CmServiceTicketService {
	
	@Autowired
	private CmServiceTicketDao cmServiceTicketDao;
	
	@Autowired
	public void setBaseDao() {
		super.setBaseDao(cmServiceTicketDao);
	}
	
	
}
