package com.funtl.login.demo.dao.impl;

import com.funtl.login.demo.dao.UserDao;
import com.funtl.login.demo.entity.User;

public class UserDaoImpl implements UserDao {
    /**
     *
     * @param loginId
     * @param loginPwd
     * @return String result
     */
    @Override
    public User login(String loginId, String loginPwd) {
        if("admin".equals(loginId) ){
            if("admin".equals(loginPwd)){
                return new User("zzw","admin","admin");
            }
        }
        return null;
    }
}
