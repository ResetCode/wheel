/**
 * 
 */
package com.wheel.server.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.wheel.core.po.User;
import com.wheel.server.fallback.UserfallbackFactory;

/**
 * 
 * Created by liumohan 2018-04-04 19:55
 */
@FeignClient(name = "SERVICE-USER", fallbackFactory = UserfallbackFactory.class)
public interface UserClient {

	@GetMapping("/user/{id}")
	public User getById(@PathVariable("id") String id);
}
