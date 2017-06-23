package com.cm.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cm.dao.CmUserDao;
import com.cm.entity.CmUser;
import com.cm.service.CmUserService;

@Service
public class CmUserServiceImpl extends BaseServiceImpl<CmUser, Long> implements CmUserService {

	Logger logger = LoggerFactory.getLogger(CmUserServiceImpl.class);

	@Autowired
	private CmUserDao cmUserDao;
	
	@Autowired
	public void setBaseDao() {
		super.setBaseDao(cmUserDao);
	}

	@Transactional
	public void suUser() {
		CmUser cmu = new CmUser();
		cmu = cmUserDao.selectByPrimaryKey(1L);
		cmu.setPassword("789789");
		cmUserDao.updateByPrimaryKeySelective(cmu);
		
		CmUser cmUser = new CmUser();
		cmUser.setLoginName("zhao");
		cmUser.setPassword("667677");
		cmUserDao.insert(cmUser);
		logger.debug("------" + cmUser.getId());
		
	}

}
