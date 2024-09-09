package io.github.keepfocusl.lxhweb2.day240908;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("request-demo1-servlet")
public class RequestDemo1Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String method = request.getMethod();
        String contextPath = request.getContextPath();
        StringBuffer requestURL = request.getRequestURL();
        String requestURI = request.getRequestURI();
        String queryString = request.getQueryString();

        String responseText = "request.getMethod()  =>  " + method + "<br>" +
                "request.getContextPath()  =>  " + contextPath + "<br>" +
                "request.getRequestURL()  =>  " + requestURL + "<br>" +
                "request.getRequestURI()  =>  " + requestURI + "<br>" +
                "request.getQueryString()  =>  " + queryString;

        response.setContentType("text/html");
        response.getWriter().write(responseText);
    }
}
