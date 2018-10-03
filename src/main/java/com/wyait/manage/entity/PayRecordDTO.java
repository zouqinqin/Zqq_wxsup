package com.wyait.manage.entity;


public class PayRecordDTO {
	private String recordNO;

	private String userId;

	private String phone;

	private String name;

	private Integer payNum;

	private String remark;

	private String createUser;

	private String createTime;

	private String updateUser;

	private String updateTime;

	public String getRecordNO() {
		return recordNO;
	}

	public void setRecordNO(String recordNO) {
		this.recordNO = recordNO;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPayNum() {
		return payNum;
	}

	public void setPayNum(Integer payNum) {
		this.payNum = payNum;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "PayRecord [recordNO=" + recordNO + ", userId=" + userId + ", phone="
				+ phone + ", name=" + name + ", payNum=" + payNum
				+ ", remark=" + remark + ", createUser=" + createUser
				+ ", createTime=" + createTime + ", updateUser=" + updateUser
				+ ", updateTime=" + updateTime +  "]";
	}

}