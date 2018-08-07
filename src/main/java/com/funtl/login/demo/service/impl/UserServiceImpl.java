package com.funtl.login.demo.service.impl;

import com.funtl.login.demo.dao.UserDao;
import com.funtl.login.demo.dao.impl.UserDaoImpl;
import com.funtl.login.demo.entity.User;
import com.funtl.login.demo.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoImpl();

    @Override
    public User login(String loginId, String loginPwd) {
        return userDao.login(loginId, loginPwd);
    }
}
