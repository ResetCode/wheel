/**
 * 
 */
package com.wheel.ticket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 
 * Created by liumohan 2018-04-04 13:31
 */
@SpringBootApplication
@EnableEurekaClient
public class TicketApplication {

	public static void main(String[] args) {

		SpringApplication.run(TicketApplication.class, args);
	}
}
