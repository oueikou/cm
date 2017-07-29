package com.cm.service.impl;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cm.dao.BaseDao;
import com.cm.service.BaseService;

public class BaseServiceImpl<T, ID extends Serializable> implements BaseService<T, ID> {

	private static final Logger logger = LoggerFactory.getLogger(BaseServiceImpl.class);

	private BaseDao<T, ID> baseDao;

	public void setBaseDao(BaseDao<T, ID> baseDao) {
		logger.info(this.getClass().getName() + ".setBaseDao(BaseDao<T,ID>) - 开始^^^^^^^^^^");

		this.baseDao = baseDao;

		logger.info(this.getClass().getName() + ".setBaseDao(BaseDao<T,ID>) - 结束^^^^^^^^^^");
	}

	public int deleteByPrimaryKey(ID id) {
		logger.info(this.getClass().getName() + ".deleteByPrimaryKey(ID) - 物理删除开始^^^^^^^^^^");
		logger.info("参数：" + id);
		int returnint = baseDao.deleteByPrimaryKey(id);
		logger.info("返回：" + returnint);
		logger.info(this.getClass().getName() + ".deleteByPrimaryKey(ID) - 物理删除结束^^^^^^^^^^");
		return returnint;
	}

	public int insert(T record) {
		logger.info(this.getClass().getName() + ".insert(T) - 插入开始^^^^^^^^^^");
		logger.info("参数：" + record);
		int returnint = baseDao.insert(record);
		logger.info("返回：" + returnint);
		logger.info(this.getClass().getName() + ".insert(T) - 插入结束^^^^^^^^^^");
		return returnint;
	}

	public int insertSelective(T record) {
		logger.info(this.getClass().getName() + ".insertSelective(T) - 插入开始^^^^^^^^^^");
		logger.info("参数：" + record);
		int returnint = baseDao.insertSelective(record);
		logger.info("返回：" + returnint);
		logger.info(this.getClass().getName() + ".insertSelective(T) - 插入结束^^^^^^^^^^");
		return returnint;
	}

	public T selectByPrimaryKey(ID id) {
		logger.info(this.getClass().getName() + ".selectByPrimaryKey(ID) - 查询开始^^^^^^^^^^");
		logger.info("参数：" + id);
		T returnT = baseDao.selectByPrimaryKey(id);
		logger.info("返回：" + returnT);
		logger.info(this.getClass().getName() + ".selectByPrimaryKey(ID) - 查询结束^^^^^^^^^^");
		return returnT;
	}

	public int updateByPrimaryKeySelective(T record) {
		logger.info(this.getClass().getName() + ".updateByPrimaryKeySelective(T) - 更新开始^^^^^^^^^^");
		logger.info("参数：" + record);
		int returnint = baseDao.updateByPrimaryKeySelective(record);
		logger.info("返回：" + returnint);
		logger.info(this.getClass().getName() + ".updateByPrimaryKeySelective(T) - 更新结束^^^^^^^^^^");
		return returnint;
	}

	public int updateByPrimaryKey(T record) {
		logger.info(this.getClass().getName() + ".updateByPrimaryKey(T) - 更新开始^^^^^^^^^^");
		logger.info("参数：" + record);
		int returnint = baseDao.updateByPrimaryKey(record);
		logger.info("返回：" + returnint);
		logger.info(this.getClass().getName() + ".updateByPrimaryKey(T) - 更新结束^^^^^^^^^^");
		return returnint;
	}

}
