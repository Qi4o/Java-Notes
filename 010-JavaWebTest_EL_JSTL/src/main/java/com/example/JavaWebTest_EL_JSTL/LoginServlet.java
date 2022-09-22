package com.example.JavaWebTest_EL_JSTL;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author Qiao
 * @Create 2022/3/15 16:07
 */


public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if ("Qiao".equals(username) && "qiao9999".equals(password)){
            Cookie usernameCookie = new Cookie("username", username);
            usernameCookie.setMaxAge(60 * 60 * 24 * 7); //一周有效
            resp.addCookie(usernameCookie);

            Cookie passwordCookie = new Cookie("password", password);
            passwordCookie.setMaxAge(60 * 60 * 24 * 7);
            resp.addCookie(passwordCookie);

            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }
    }
}
