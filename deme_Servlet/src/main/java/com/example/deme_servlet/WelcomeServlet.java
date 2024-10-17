package com.example.deme_servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/WelcomeServlet")
public class WelcomeServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取ServletContext对象
        ServletContext context = getServletContext();

        // 从ServletContext中获取共享参数username
        String username = (String) context.getAttribute("username");

        // 打印用户名到IDEA控制台
        System.out.println("Username: " + username);

        // 获取RequestDispatcher对象
        RequestDispatcher dispatcher = request.getRequestDispatcher("/welcome.jsp");

        // 使用RequestDispatcher转发请求到welcome.jsp页面
        dispatcher.forward(request, response);
    }
}
