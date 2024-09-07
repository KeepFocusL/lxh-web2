package io.github.keepfocusl.lxhweb2.day240902;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/hello-world-random")
public class HelloWorldRandom implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        response.setContentType("test/html");

        PrintWriter writer = response.getWriter();
        writer.write("""       
                <html>
                 <head>
                  <title>HelloWorldRandom</title>
                 </head>
                 <body>
                     <script>
                     const number = "HelloWorld" + Math.floor(Math.random() * 10);
                     document.write(number)
                     </script>
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
