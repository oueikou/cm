package com.cm.service;

import java.util.List;

import com.cm.entity.CmServiceTicket;
import com.cm.vo.CmServiceTicketVo;

public interface CmServiceTicketService extends BaseService<CmServiceTicket, Long> {

	/**
	 * 查询所有服务票，以及关联的已下单未支付的订单信息
	 * @return
	 */
	List<CmServiceTicketVo> getAllServiceTicketOrder();
}
