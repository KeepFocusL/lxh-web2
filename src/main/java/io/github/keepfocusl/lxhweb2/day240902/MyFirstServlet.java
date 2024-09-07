package io.github.keepfocusl.lxhweb2.day240902;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/my-first-servlet")
public class MyFirstServlet implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter writer = response.getWriter();
        writer.write("""
                <html>
                  <head>
                    <title>来自 MyFirstServlet</title>
                  </head>
                  <body>
                    <p>MyFirstServlet 的 service 方法输出的内容</p>
                  </body>
                </html>
                """);
    }

    @Override
    public String getServletInfo() {
        return "";
    }

    @Override
    public void destroy() {

    }
}
