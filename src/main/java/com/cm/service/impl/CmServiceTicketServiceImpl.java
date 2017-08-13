package com.cm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cm.dao.CmServiceTicketDao;
import com.cm.entity.CmServiceTicket;
import com.cm.service.CmServiceTicketService;
import com.cm.vo.CmServiceTicketVo;

@Service
public class CmServiceTicketServiceImpl extends BaseServiceImpl<CmServiceTicket, Long> implements CmServiceTicketService {
	
	@Autowired
	private CmServiceTicketDao cmServiceTicketDao;
	
	@Autowired
	public void setBaseDao(CmServiceTicketDao cmServiceTicketDao) {
		super.setBaseDao(cmServiceTicketDao);
	}

	@Override
	public List<CmServiceTicketVo> getAllServiceTicketOrder() {
		return cmServiceTicketDao.selectAllServiceTicketOrder();
	}
	
	
}
