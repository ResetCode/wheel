/**
 * 
 */
package com.wheel.core.constant;

/**
 * 
 * Created by liumohan 2018-04-12 17:21
 */
public enum ResponseConstant {

	SUCCESS(true, 200, "成功"), ERROR(false, 500, "系统出错，请稍后再试！");

	private boolean success;

	private Integer code;

	private String message;

	/**
	 * 
	 */
	private ResponseConstant(boolean success, Integer code, String message) {
		this.code = code;
		this.message = message;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
