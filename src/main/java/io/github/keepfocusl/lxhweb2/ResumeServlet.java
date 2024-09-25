package io.github.keepfocusl.lxhweb2;

import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;


@WebServlet("/resume-download")
public class ResumeServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String path = this.getServletContext().getRealPath("/resume-demo.pdf");
        FileInputStream fis = new FileInputStream(path);

        ServletOutputStream sos = response.getOutputStream();

        response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode("我的简历-xxx.pdf", "UTF-8"));

        IOUtils.copy(fis, sos);

        fis.close();
    }
}
