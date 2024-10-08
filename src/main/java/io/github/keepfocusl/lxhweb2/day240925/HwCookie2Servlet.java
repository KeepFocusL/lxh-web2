package io.github.keepfocusl.lxhweb2.day240925;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/hw-cookie-2")
public class HwCookie2Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String lang = "cn";
        String acceptLanguageHeader = req.getHeader("accept-language");
        if (acceptLanguageHeader != null) {
            lang = acceptLanguageHeader;
            System.out.println("lang from accept-language header = " + lang);
        }
        Cookie[] cookies = req.getCookies();
        for (Cookie cookie : cookies) {
            if ("hw-cookie2__lang".equals(cookie.getName())) {
                lang = cookie.getValue();
                System.out.println("lang from cookie = " + lang);
            }
        }
        req.setAttribute("lang", lang);

        req.getRequestDispatcher("WEB-INF/hw-cookie-2.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String lang = req.getParameter("lang");

        Cookie cookie = new Cookie("hw-cookie2__lang", lang);
        cookie.setMaxAge(60 * 60 * 24 * 365);

        resp.addCookie(cookie);

        resp.sendRedirect(req.getContextPath() + "/hw2-cookie-2");
    }
}
