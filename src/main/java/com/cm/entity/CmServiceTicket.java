package com.cm.entity;

import java.io.Serializable;
import java.util.Date;

public class CmServiceTicket implements Serializable {

	private static final long serialVersionUID = -3160217049682176209L;

	private Long id;

	private String serviceTicketNo;

	private Integer serviceTicketStatus;

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
		return "CmServiceTicket [id=" + id + ", serviceTicketNo=" + serviceTicketNo + ", serviceTicketStatus="
				+ serviceTicketStatus + ", createUser=" + createUser + ", createTime=" + createTime + ", modifyUser="
				+ modifyUser + ", modifyTime=" + modifyTime + "]";
	}

}