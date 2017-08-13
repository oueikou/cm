package com.cm.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CmOrder implements Serializable {

	private static final long serialVersionUID = 4764063056401430701L;

	private Long id;

	private String orderSn;

	private Byte orderStatus;

	private BigDecimal orderCost;

	private BigDecimal orderAmount;

	private Long serviceTicketId;

	private Long createUser;

	private Date createTime;

	private Long modifyUser;

	private Date modifyTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public BigDecimal getOrderCost() {
		return orderCost;
	}

	public void setOrderCost(BigDecimal orderCost) {
		this.orderCost = orderCost;
	}

	public BigDecimal getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(BigDecimal orderAmount) {
		this.orderAmount = orderAmount;
	}

	public Long getServiceTicketId() {
		return serviceTicketId;
	}

	public void setServiceTicketId(Long serviceTicketId) {
		this.serviceTicketId = serviceTicketId;
	}

	public Long getCreateUser() {
		return createUser;
	}

	public void setCreateUser(Long createUser) {
		this.createUser = createUser;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Long getModifyUser() {
		return modifyUser;
	}

	public void setModifyUser(Long modifyUser) {
		this.modifyUser = modifyUser;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	@Override
	public String toString() {
		return "CmOrder [id=" + id + ", orderSn=" + orderSn + ", orderStatus=" + orderStatus + ", orderCost="
				+ orderCost + ", orderAmount=" + orderAmount + ", serviceTicketId=" + serviceTicketId + ", createUser="
				+ createUser + ", createTime=" + createTime + ", modifyUser=" + modifyUser + ", modifyTime="
				+ modifyTime + "]";
	}

}