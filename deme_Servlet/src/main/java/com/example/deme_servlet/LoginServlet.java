package com.example.deme_servlet;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/LoginServlet")
public class LoginServlet extends HttpServlet {


    private static final String username = "admin";
    private static final String PASSWORD = "password";
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("admin");
        String password = req.getParameter("123");
//        if ("admin".equals(username) && "123".equals(password)) {
//            resp.sendRedirect("welcome.jsp");
//        } else {
//            resp.sendRedirect("login.jsp");
//        }
        // 判断用户名和密码是否正确
        if (username.equals(username) && password.equals(password)) {
            // 如果正确，设置共享参数username
            ServletContext context = getServletContext();
            context.setAttribute("username", username);

            // 获取RequestDispatcher对象并转发请求到WelcomeServlet

            RequestDispatcher dispatcher= req.getRequestDispatcher("/WelcomeServlet");
//            RequestDispatcher dispatcher = request.getRequestDispatcher("/WelcomeServlet");
            dispatcher.forward(req, resp);
        } else {
            // 如果不正确，重定向到login.jsp页面
            resp.sendRedirect("login.jsp?error=true");
        }

    }
}
