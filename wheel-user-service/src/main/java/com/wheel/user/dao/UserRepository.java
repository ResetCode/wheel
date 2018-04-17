/**
 * 
 */
package com.wheel.user.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.wheel.core.po.User;

/**
 * 
 * Created by liumohan 2018-04-04 14:19
 */
@Repository
public interface UserRepository {

	User getOne(@Param("id") String id);
}
