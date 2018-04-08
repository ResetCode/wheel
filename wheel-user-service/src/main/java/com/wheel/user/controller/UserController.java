/**
 * 
 */
package com.wheel.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wheel.core.po.User;
import com.wheel.user.service.UserService;

/**
 * 
 * Created by liumohan 2018-04-04 14:14
 */
@RestController
@RequestMapping(value = "user", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class UserController {

	@Autowired
	private UserService userService;

	/**
	 * 查询用户详情
	 * 
	 * @param id
	 *            用户编号
	 * @return
	 */
	@GetMapping("/{id}")
	public User getById(@PathVariable("id") String id) {

		User user = userService.getById(id);
		return user;
	}
}
