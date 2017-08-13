package com.cm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cm.dao.CmCategoryDao;
import com.cm.entity.CmCategory;
import com.cm.service.CmCategoryService;

@Service
public class CmCategoryServiceImpl extends BaseServiceImpl<CmCategory, Long> implements CmCategoryService {

	@Autowired
	private CmCategoryDao cmCategoryDao;

	@Autowired
	public void setBaseDao(CmCategoryDao cmCategoryDao) {
		super.setBaseDao(cmCategoryDao);
	}

}
