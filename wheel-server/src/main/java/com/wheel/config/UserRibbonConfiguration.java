/**
 * 
 */
package com.wheel.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

/**
 * 
 * Created by liumohan 2018-04-04 20:23
 */
@Configuration
public class UserRibbonConfiguration {

	@Autowired
	IClientConfig config;

	@Bean
	public IRule userRibbon(IClientConfig config) {

		return new RandomRule();
	}
}
