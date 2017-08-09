package com.cm.vo;

import java.io.Serializable;
import java.math.BigDecimal;

public class CmServiceTicketVo implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private String serviceTicketNo;

	private Integer serviceTicketStatus;

	private Long orderId;

	private String orderSn;

	private Byte orderStatus;

	private BigDecimal orderAmount;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getServiceTicketNo() {
		return serviceTicketNo;
	}

	public void setServiceTicketNo(String serviceTicketNo) {
		this.serviceTicketNo = serviceTicketNo;
	}

	public Integer getServiceTicketStatus() {
		return serviceTicketStatus;
	}

	public void setServiceTicketStatus(Integer serviceTicketStatus) {
		this.serviceTicketStatus = serviceTicketStatus;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getOrderSn() {
		return orderSn;
	}

	public void setOrderSn(String orderSn) {
		this.orderSn = orderSn;
	}

	public Byte getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Byte orderStatus) {
		this.orderStatus = orderStatus;
	}

	public BigDecimal getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(BigDecimal orderAmount) {
		this.orderAmount = orderAmount;
	}

	@Override
	public String toString() {
		return "CmServiceTicketVo [id=" + id + ", serviceTicketNo=" + serviceTicketNo + ", serviceTicketStatus="
				+ serviceTicketStatus + ", orderId=" + orderId + ", orderSn=" + orderSn + ", orderStatus=" + orderStatus
				+ ", orderAmount=" + orderAmount + "]";
	}

}