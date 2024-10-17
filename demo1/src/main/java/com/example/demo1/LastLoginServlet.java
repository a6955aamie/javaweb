package com.example.demo1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;


@WebServlet(urlPatterns = "/LastLoginServlet")
public class LastLoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        boolean existsLastLogin=false;
        SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
        String currentTime = sdf.format(new Date());
        Cookie[] cookies = req.getCookies();
        if (cookies != null && cookies.length > 0) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("lastLogin")) {
                    String LastLoginTime = cookie.getValue();
                    existsLastLogin=true;
                    cookie.setValue(URLEncoder.encode(currentTime,"UTF-8"));
                    cookie.setMaxAge(60);
                    resp.addCookie(cookie);
                    resp.getWriter().println("欢迎回来，你上一次的登录时间是" + URLDecoder.decode(LastLoginTime,"UTF-8"));
                    break;
                }
            }
        }if ( !existsLastLogin){
            Cookie cookie=new Cookie("lastLogin",URLEncoder.encode(currentTime,"UTF-8"));
            cookie.setMaxAge(60);
            resp.addCookie(cookie);
            resp.getWriter().println("欢迎登录");
        }

    }
}
