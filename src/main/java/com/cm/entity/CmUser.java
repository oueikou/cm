package com.cm.entity;

import java.io.Serializable;

public class CmUser implements Serializable {
	
	private static final long serialVersionUID = 5641032120307716341L;

	private Long id;

	private String loginName;

	private String password;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}