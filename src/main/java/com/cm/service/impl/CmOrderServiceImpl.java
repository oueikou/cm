package com.cm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cm.dao.CmOrderDao;
import com.cm.entity.CmOrder;
import com.cm.service.CmOrderService;

@Service
public class CmOrderServiceImpl extends BaseServiceImpl<CmOrder, Long> implements CmOrderService {

	@Autowired
	private CmOrderDao cmOrderDao;

	@Autowired
	public void setBaseDao(CmOrderDao cmOrderDao) {
		super.setBaseDao(cmOrderDao);
	}

}
