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
	 * ��ȡ��֤��ӿ�
	 */
	public abstract void doGetCode();

	/**
	 * ��ѯ��Ʊ�ӿ�
	 */
	public abstract void doGetTitkets();

	/**
	 * ��Ʊ�ӿ�
	 */
	public abstract void doOrder();

	/**
	 * ��¼�ӿ�
	 */
	public abstract void doLogin();
}
