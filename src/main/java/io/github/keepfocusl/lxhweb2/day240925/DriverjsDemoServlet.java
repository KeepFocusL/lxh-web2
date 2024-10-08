package io.github.keepfocusl.lxhweb2.day240925;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/product-tours")
public class DriverjsDemoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        boolean isNewUser = true;

        Cookie[] cookie = req.getCookies();
        for (Cookie cookies : cookie) {
            if ("friend".equals(cookies.getName())) {
                isNewUser = false;
            }
        }
        req.setAttribute("isNewUser", isNewUser);
        req.getRequestDispatcher("day240925/product-tours.jsp").forward(req, resp);
    }
}
