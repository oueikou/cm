package com.cm.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cm.dao.CmUserDao;
import com.cm.entity.CmUser;
import com.cm.service.CmUserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

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

	/**
	 * PageHelper注意事项：
	 * 1.只有紧跟在 PageHelper.startPage 方法后的第一个 MyBatis 的查询(select)方法会被分页。
	 * 2.对于带有 for update 的 sql，会抛出运行时异常，对于这样的 sql 建议手动分页，毕竟这样的 sql 需要重视。
	 * 3.由于嵌套结果方式会导致结果集被折叠，因此分页查询的结果在折叠后总数会减少，所以无法保证分页结果数量正确。
	 */
	public Page<CmUser> findPageList(CmUser cmUser, Page<CmUser> page) {
		PageHelper.startPage(page.getPageNum(), page.getPageSize());
		// 紧跟着的第一个select方法会被分页
		List<CmUser> resultList = cmUserDao.selectListByParam(cmUser);
		// 分页时，实际返回的结果list类型是Page<E>，如果想取出分页信息，需要强制转换为Page<E>
		return (Page<CmUser>)resultList;
	}

}
