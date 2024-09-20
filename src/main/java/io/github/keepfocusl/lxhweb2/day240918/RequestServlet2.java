package io.github.keepfocusl.lxhweb2.day240918;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/RequestServlet2")
public class RequestServlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset = utf-8");

        PrintWriter writer = response.getWriter();
        writer.write(request.toString());
        writer.write("<br>");
        writer.write(response.toString());
    }
}

