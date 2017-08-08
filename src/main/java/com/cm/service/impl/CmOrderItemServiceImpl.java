package com.cm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cm.dao.CmOrderItemDao;
import com.cm.entity.CmOrderItem;
import com.cm.service.CmOrderItemService;

@Service
public class CmOrderItemServiceImpl extends BaseServiceImpl<CmOrderItem, Long> implements CmOrderItemService {

	@Autowired
	private CmOrderItemDao cmOrderItemDao;

	@Autowired
	public void setBaseDao() {
		super.setBaseDao(cmOrderItemDao);
	}

}
