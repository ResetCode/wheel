/**
 * 
 */
package com.wheel.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.wheel.config.UserRibbonConfiguration;

/**
 * 
 * Created by liumohan 2018-04-04 19:53
 */
@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker
@EnableEurekaClient
@RibbonClient(name = "SERVICE-USER", configuration = UserRibbonConfiguration.class)
public class ServerApplication {

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	public static void main(String[] args) {

		SpringApplication.run(ServerApplication.class, args);
	}
}
