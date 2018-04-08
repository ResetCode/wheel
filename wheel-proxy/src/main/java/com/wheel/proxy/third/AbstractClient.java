/**
 * 
 */
package com.wheel.proxy.third;

/**
 * 
 * Created by liumohan 2018-04-04 13:20
 */
public abstract class AbstractClient extends AbstractBaseClient {

	/**
	 * 获取验证码接口
	 */
	public abstract void doGetCode();

	/**
	 * 查询余票接口
	 */
	public abstract void doGetTitkets();

	/**
	 * 订票接口
	 */
	public abstract void doOrder();

	/**
	 * 登录接口
	 */
	public abstract void doLogin();
}
