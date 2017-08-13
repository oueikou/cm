package com.cm.dao;

import java.util.List;

import com.cm.entity.CmServiceTicket;
import com.cm.vo.CmServiceTicketVo;

public interface CmServiceTicketDao extends BaseDao<CmServiceTicket, Long> {
	
	/**
	 * 查询所有服务票，以及关联的已下单未支付的订单信息
	 */
	List<CmServiceTicketVo> selectAllServiceTicketOrder();
}