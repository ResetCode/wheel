/**
 * 
 */
package com.wheel.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * 
 * Created by liumohan 2018-04-04 13:58
 */
@SpringBootApplication
@ComponentScan("com.wheel")
@EntityScan("com.wheel.core.po")
@EnableEurekaClient
public class UserApplication {

	public static void main(String[] args) {

		SpringApplication.run(UserApplication.class, args);
	}
}
