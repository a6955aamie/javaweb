package com.example.deme_servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/ResultServlet")
public class ResultServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //resp.setContentType("text/html; charset=utf-8");
        String username=(String) req.getAttribute("username");
        //resp.getWriter().println("ResultServlet-用户名：" + req.getAttribute("username"));
        resp.getWriter().println("username:"+username);
    }
}
