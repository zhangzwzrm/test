package com.funtl.login.demo.dao;

import com.funtl.login.demo.entity.User;

/**
 * User Data Access
 */
public interface UserDao {
    public User login(String loginId, String loginPwd);
}
