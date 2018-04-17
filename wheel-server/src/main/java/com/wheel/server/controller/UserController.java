/**
 * 
 */
package com.wheel.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wheel.core.po.User;
import com.wheel.core.response.JsonResponse;
import com.wheel.server.client.UserClient;

/**
 * 
 * Created by liumohan 2018-04-04 20:12
 */
@RestController
@RequestMapping(value = "user", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class UserController {

	@Autowired
	private UserClient userClient;

	@GetMapping("/{id}")
	public JsonResponse<User> getUser(@PathVariable("id") String id) {

		User user = userClient.getById(id);
		return JsonResponse.successData(user);
	}
}
