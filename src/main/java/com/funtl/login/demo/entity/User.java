package com.funtl.login.demo.entity;

import java.io.Serializable;

public class User implements Serializable {
    private  String username;
    private  String loginId;
    private  String loginPwd;

    public User() {
    }

    public User(String username, String loginId, String loginPwd) {
        this.username = username;
        this.loginId = loginId;
        this.loginPwd = loginPwd;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", loginId='" + loginId + '\'' +
                ", loginPwd='" + loginPwd + '\'' +
                '}';
    }
}
