/**
 * 
 */
package com.wheel.user.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 
 * Created by liumohan 2018-04-12 17:04
 */
@Configuration
@EnableTransactionManagement
@MapperScan(basePackages = "com.wheel.**.dao")
public class MybatisConfig {

}
