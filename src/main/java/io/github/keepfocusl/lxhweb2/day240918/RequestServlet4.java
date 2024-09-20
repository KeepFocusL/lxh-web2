package io.github.keepfocusl.lxhweb2.day240918;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = "/RequestServlet4")
public class RequestServlet4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doGet...");
        System.out.println(request.getParameter("username"));
        System.out.println(request.getParameter("password"));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doPost...");
        System.out.println(request.getParameter("username"));
        System.out.println(request.getParameter("password"));
    }
}
