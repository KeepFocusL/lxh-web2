package io.github.keepfocusl.lxhweb2.day240908;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = {"/lang","/lan"})
public class LangServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String header = request.getParameter("lan");
        if (header == null) {
            header = request.getHeader("accept-language");
        }
        String responseTest = "Hello World!";
        if (header.startsWith("zh")) {
            response.setContentType("text/html;charset=UTF-8");
            responseTest = "肚子饿了！";
        }
        response.getWriter().write(responseTest);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}