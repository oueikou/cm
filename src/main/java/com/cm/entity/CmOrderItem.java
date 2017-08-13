package com.cm.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CmOrderItem implements Serializable {

	private static final long serialVersionUID = -2552190740895529827L;

	private Long id;

	private BigDecimal orderItemFoodCost;

	private BigDecimal orderItemFoodPrice;

	private Integer orderItemQuantity;

	private BigDecimal orderItemSubtotal;

	private Long foodId;

	private Long orderId;

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

	public BigDecimal getOrderItemFoodCost() {
		return orderItemFoodCost;
	}

	public void setOrderItemFoodCost(BigDecimal orderItemFoodCost) {
		this.orderItemFoodCost = orderItemFoodCost;
	}

	public BigDecimal getOrderItemFoodPrice() {
		return orderItemFoodPrice;
	}

	public void setOrderItemFoodPrice(BigDecimal orderItemFoodPrice) {
		this.orderItemFoodPrice = orderItemFoodPrice;
	}

	public Integer getOrderItemQuantity() {
		return orderItemQuantity;
	}

	public void setOrderItemQuantity(Integer orderItemQuantity) {
		this.orderItemQuantity = orderItemQuantity;
	}

	public BigDecimal getOrderItemSubtotal() {
		return orderItemSubtotal;
	}

	public void setOrderItemSubtotal(BigDecimal orderItemSubtotal) {
		this.orderItemSubtotal = orderItemSubtotal;
	}

	public Long getFoodId() {
		return foodId;
	}

	public void setFoodId(Long foodId) {
		this.foodId = foodId;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
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
		return "CmOrderItem [id=" + id + ", orderItemFoodCost=" + orderItemFoodCost + ", orderItemFoodPrice="
				+ orderItemFoodPrice + ", orderItemQuantity=" + orderItemQuantity + ", orderItemSubtotal="
				+ orderItemSubtotal + ", foodId=" + foodId + ", orderId=" + orderId + ", createUser=" + createUser
				+ ", createTime=" + createTime + ", modifyUser=" + modifyUser + ", modifyTime=" + modifyTime + "]";
	}

}