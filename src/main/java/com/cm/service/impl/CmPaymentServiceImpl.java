package com.cm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cm.dao.CmPaymentDao;
import com.cm.entity.CmPayment;
import com.cm.service.CmPaymentService;

@Service
public class CmPaymentServiceImpl extends BaseServiceImpl<CmPayment, Long> implements CmPaymentService {

	@Autowired
	private CmPaymentDao cmPaymentDao;

	@Autowired
	public void setBaseDao() {
		super.setBaseDao(cmPaymentDao);
	}

}
