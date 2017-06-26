package com.cm.dao;

import java.util.List;

import com.cm.entity.CmUser;

public interface CmUserDao extends BaseDao<CmUser, Long>{
	
	List<CmUser> selectListByParam(CmUser cmUser);
}