/**
 * 
 */
package com.wheel.monitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * 集成Turbine和hystrixDashboard监控 Created by liumohan 2018-04-12 16:01
 */
@SpringBootApplication
@EnableEurekaClient
@EnableHystrixDashboard
public class MonitorApplication {

	public static void main(String[] args) {

		SpringApplication.run(MonitorApplication.class, args);
	}
}
