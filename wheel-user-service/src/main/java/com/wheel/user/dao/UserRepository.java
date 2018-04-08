/**
 * 
 */
package com.wheel.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wheel.core.po.User;

/**
 * 
 * Created by liumohan 2018-04-04 14:19
 */
@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
