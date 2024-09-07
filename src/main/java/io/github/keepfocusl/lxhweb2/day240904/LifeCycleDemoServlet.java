package io.github.keepfocusl.lxhweb2.day240904;

import jakarta.servlet.*;

import java.io.IOException;

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
        System.out.println("LifeCycleDemoServlet.service");
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
