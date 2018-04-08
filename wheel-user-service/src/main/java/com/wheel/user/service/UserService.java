/**
 * 
 */
package com.wheel.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wheel.core.po.User;
import com.wheel.user.dao.UserRepository;

/**
 * 
 * Created by liumohan 2018-04-04 14:15
 */
@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	/**
	 * @param id
	 * @return
	 */
	public User getById(String id) {
		return this.userRepository.getOne(id);
	}

}
