/**
 * 
 */
package com.wheel.core.response;

import com.wheel.core.constant.ResponseConstant;

/**
 * 
 * Created by liumohan 2018-04-12 17:18
 */
public class JsonResponse<T> {

	private boolean success;

	private Integer code;

	private String message;

	private T data;

	public JsonResponse(boolean success, Integer code, String message, T data) {

		this.success = success;
		this.code = code;
		this.message = message;
		this.data = data;
	}

	public JsonResponse(ResponseConstant response) {

		this.success = response.isSuccess();
		this.code = response.getCode();
		this.message = response.getMessage();
	}

	public void setSuccessData(T data) {

		this.setCode(ResponseConstant.SUCCESS.getCode());
		this.setMessage(ResponseConstant.SUCCESS.getMessage());
		this.setSuccess(ResponseConstant.SUCCESS.isSuccess());
		this.setData(data);

	}

	public static <T> JsonResponse<T> successData(T data) {

		JsonResponse<T> response = new JsonResponse<>(ResponseConstant.SUCCESS);
		response.setData(data);
		return response;
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

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
