/**
 * 
 */
package com.wheel.core.po;

import java.io.Serializable;

/**
 * 
 * Created by liumohan 2018-04-04 14:11
 */
public class User implements Serializable {

	private static final long serialVersionUID = 1828724796172742397L;

	private String id;

	private String userName;

	private String password;

	private String titleId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTitleId() {
		return titleId;
	}

	public void setTitleId(String titleId) {
		this.titleId = titleId;
	}

}
