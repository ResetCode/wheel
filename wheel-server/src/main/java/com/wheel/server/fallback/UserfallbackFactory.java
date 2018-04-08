/**
 * 
 */
package com.wheel.server.fallback;

import com.wheel.core.po.User;
import com.wheel.server.client.UserClient;

import feign.hystrix.FallbackFactory;

/**
 * 
 * Created by liumohan 2018-04-04 20:01
 */
public class UserfallbackFactory extends AbstractBasefallbackFactory implements FallbackFactory<UserClient> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see feign.hystrix.FallbackFactory#create(java.lang.Throwable)
	 */
	@Override
	public UserClient create(Throwable cause) {

		logger.warn("用户微服务出错，降级容错！");
		return new UserClient() {

			@Override
			public User getById(String id) {

				User user = new User();
				user.setId("0000");
				return user;
			}
		};
	}

}
