package com.cm.service;

import com.cm.entity.CmUser;
import com.github.pagehelper.Page;

public interface CmUserService extends BaseService<CmUser, Long> {

	void suUser();

	/**
	 * 分页查询
	 * @param cmUser
	 * @param page
	 * @return
	 */
	Page<CmUser> findPageList(CmUser cmUser, Page<CmUser> page);
	
}
