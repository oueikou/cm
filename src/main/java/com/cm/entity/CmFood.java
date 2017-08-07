package com.cm.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CmFood implements Serializable {

	private static final long serialVersionUID = -9030146313061317807L;

	private Long id;

	private String foodName;

	private BigDecimal foodCost;

	private BigDecimal foodPrice;

	private String foodUnit;

	private String foodPhoto;

	private String foodIntroduction;

	private Boolean isMarketable;

	private Long categoryId;

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

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public BigDecimal getFoodCost() {
		return foodCost;
	}

	public void setFoodCost(BigDecimal foodCost) {
		this.foodCost = foodCost;
	}

	public BigDecimal getFoodPrice() {
		return foodPrice;
	}

	public void setFoodPrice(BigDecimal foodPrice) {
		this.foodPrice = foodPrice;
	}

	public String getFoodUnit() {
		return foodUnit;
	}

	public void setFoodUnit(String foodUnit) {
		this.foodUnit = foodUnit;
	}

	public String getFoodPhoto() {
		return foodPhoto;
	}

	public void setFoodPhoto(String foodPhoto) {
		this.foodPhoto = foodPhoto;
	}

	public String getFoodIntroduction() {
		return foodIntroduction;
	}

	public void setFoodIntroduction(String foodIntroduction) {
		this.foodIntroduction = foodIntroduction;
	}

	public Boolean getIsMarketable() {
		return isMarketable;
	}

	public void setIsMarketable(Boolean isMarketable) {
		this.isMarketable = isMarketable;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
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
		return "CmFood [id=" + id + ", foodName=" + foodName + ", foodCost=" + foodCost + ", foodPrice=" + foodPrice
				+ ", foodUnit=" + foodUnit + ", foodPhoto=" + foodPhoto + ", foodIntroduction=" + foodIntroduction
				+ ", isMarketable=" + isMarketable + ", categoryId=" + categoryId + ", createUser=" + createUser
				+ ", createTime=" + createTime + ", modifyUser=" + modifyUser + ", modifyTime=" + modifyTime + "]";
	}

}