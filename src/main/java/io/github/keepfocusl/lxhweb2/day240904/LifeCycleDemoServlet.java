package io.github.keepfocusl.lxhweb2.day240904;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;

@WebServlet("/life-cycle")
public class LifeCycleDemoServlet implements Servlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("LifeCycleDemoServlet.init");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        // 在 Java 研究/学习陌生的东西
        // 直接 sout
        // 如果打印出来不是 ***@***
        System.out.println(res);
        res.getWriter().write("LifeCycleDemoServlet.service");
    }

    @Override
    public String getServletInfo() {
        return "";
    }

    @Override
    public void destroy() {
        System.out.println("LifeCycleDemoServlet.destroy");
    }
}
