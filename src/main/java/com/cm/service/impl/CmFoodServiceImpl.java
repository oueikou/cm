package com.cm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cm.dao.CmFoodDao;
import com.cm.entity.CmFood;
import com.cm.service.CmFoodService;

@Service
public class CmFoodServiceImpl extends BaseServiceImpl<CmFood, Long> implements CmFoodService {

	@Autowired
	private CmFoodDao cmFoodDao;

	@Autowired
	public void setBaseDao() {
		super.setBaseDao(cmFoodDao);
	}

}
