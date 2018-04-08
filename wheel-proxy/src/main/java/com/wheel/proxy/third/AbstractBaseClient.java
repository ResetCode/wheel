/**
 * 
 */
package com.wheel.proxy.third;

/**
 * 
 * Created by liumohan 2018-04-04 13:18
 */
public class AbstractBaseClient {

	protected String thirdCode;
	protected String charSet;
	protected String contentCharSet;

	protected String host;
	protected Integer port;

	public String getThirdCode() {
		return thirdCode;
	}

	public void setThirdCode(String thirdCode) {
		this.thirdCode = thirdCode;
	}

	public String getCharSet() {
		return charSet;
	}

	public void setCharSet(String charSet) {
		this.charSet = charSet;
	}

	public String getContentCharSet() {
		return contentCharSet;
	}

	public void setContentCharSet(String contentCharSet) {
		this.contentCharSet = contentCharSet;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

}
