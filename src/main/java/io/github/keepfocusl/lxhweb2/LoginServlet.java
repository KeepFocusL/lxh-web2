package io.github.keepfocusl.lxhweb2;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        // 前端可以先用 js 提前验证邮箱和密码是否符合规范，比如：邮箱/密码的长度 ...
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        boolean isAuthenticated = authenticate(email, password);

        if (isAuthenticated) {
            // 登录成功
            //resp.sendRedirect(req.getContextPath() + "/dashboard?email="+email);
            req.getRequestDispatcher("dashboard.jsp").forward(req, resp);
            // 观察地址栏差异。后续可以通过其他的方式解决
        } else {
            // 登录失败
            writer.write("登录失败！");
            writer.write("<br>");
            writer.write("<a href='" + req.getContextPath() + "/login.html'>返回登录页面</a>");
        }
    }

    private static boolean authenticate(String email, String password) {
        boolean isAuthenticated = false;
        Connection connection = MyDBUtil.getConnection();
        try {
            // 重要提醒：以后保存到我们数据库的密码都应该是加密之后的
            // 作为开发工程师，你可以知道很多内部的对象，但是我们不要知道太多。知道越多，活不过两集
            PreparedStatement ps = connection.prepareStatement("select `email`, `password` from user where `email`=?");
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String password1 = rs.getString("password");
                if (password.equals(password1)) {
                    isAuthenticated = true;
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return isAuthenticated;
    }
}
