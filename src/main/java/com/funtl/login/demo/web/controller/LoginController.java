package com.funtl.login.demo.web.controller;

import com.funtl.login.demo.entity.User;
import com.funtl.login.demo.service.UserService;
import com.funtl.login.demo.service.impl.UserServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginController extends HttpServlet {

    UserService userService = new UserServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String loginId = request.getParameter("loginId");
        String loginPwd = request.getParameter("loginPwd");

        User user = userService.login(loginId, loginPwd);

        //
        if (user == null) {
            request.getRequestDispatcher("/fail.jsp").forward(request, response);
        }
        //
        else {
            request.getRequestDispatcher("/success.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
