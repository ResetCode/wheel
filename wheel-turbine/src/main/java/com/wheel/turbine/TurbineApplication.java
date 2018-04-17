/**
 * 
 */
package com.wheel.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * 
 * Created by liumohan 2018-04-12 17:40
 */
@SpringBootApplication
@EnableTurbine
@EnableEurekaClient
public class TurbineApplication {

	public static void main(String[] args) {

		SpringApplication.run(TurbineApplication.class, args);
	}
}
