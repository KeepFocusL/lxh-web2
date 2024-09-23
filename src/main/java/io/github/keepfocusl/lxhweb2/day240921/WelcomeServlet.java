package io.github.keepfocusl.lxhweb2.day240921;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();
        out.write("<!DOCTYPE html>");
        out.write("<html lang='en'>");
        out.write("<head>");
        out.write(" <meta charset='UTF-8'>");
        out.write("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
        out.write("<title>我的主页</title>");
        out.write("</head>");
        out.write("<body>");
        out.write("<P>欢迎来到我的主页</P>");
        out.write("</body>");
        out.write("</html>");
    }
}
