package io.github.keepfocusl.lxhweb2.day240925;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/hw-cookie-2")
public class HwCookie2Servlet extends HttpServlet {
    Map<String, String> msgMap;

    @Override
    public void init(ServletConfig config) throws ServletException {
        // 优化提示：这里的内容也可以存在配置文件中，甚至用不同的文件名来区分支持的不同语言
        msgMap = new HashMap<>();
        msgMap.put("hw_description_zh", "需求描述：<br>" +
                "- 网站支持中文和英文，默认按照浏览器语言选项自动判断<br>" +
                "- 也提供单选框 radio（两个选项：中文/英文），用户可以主动勾选，一旦主动勾选，后续都按照主动勾选的语言显示。");
        msgMap.put("hw_description_en", "Requirement description:<br>" +
                "- The website supports both Chinese and English, and automatically judges based on the browser language options by default<br>" +
                "- It also provides a radio button (two options: Chinese/English), which users can actively check. Once checked, it will be displayed in the language of the selected option.");
        msgMap.put("form_legend_zh", "选择页面显示语言：");
        msgMap.put("form_legend_en", "Select page display language:");
        msgMap.put("lang_en_zh", "英文");
        msgMap.put("lang_en_en", "English");
        msgMap.put("lang_zh_zh", "中文");
        msgMap.put("lang_zh_en", "Chinese");
        msgMap.put("submit_zh", "提交");
        msgMap.put("submit_en", "Submit");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 收到的请求有可能不是来自浏览器，没有带 accept-language 请求头，所以设置一个默认值
        String lang = "zh";
        String acceptLanguageHeader = req.getHeader("accept-language");
        if (acceptLanguageHeader != null) {
            // 默认获取浏览器传递过来的 accept-language 请求头的前两个字符。如：en/zh
            lang = acceptLanguageHeader.substring(0, 2);
            System.out.println("lang from accept-language header = " + lang);
        }

        // === 优化提示：这一段重复出现的代码，后续自己可以写一个工具类封装它 ===
        Cookie[] cookies = req.getCookies();
        for (Cookie cookie : cookies) {
            if ("hw-cookie-2__lang".equals(cookie.getName())) {
                lang = cookie.getValue();
                System.out.println("lang from cookie = " + lang);
            }
        }
        // ===

        req.setAttribute("lang", lang);

        req.setAttribute("hwDescription", msgMap.get("hw_description_" + lang));
        req.setAttribute("formLegend", msgMap.get("form_legend_" + lang));
        req.setAttribute("langEnText", msgMap.get("lang_en_" + lang));
        req.setAttribute("langZhText", msgMap.get("lang_zh_" + lang));
        req.setAttribute("submitText", msgMap.get("submit_" + lang));

        req.getRequestDispatcher("/WEB-INF/hw-cookie-2.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String lang = req.getParameter("lang");

        Cookie cookie = new Cookie("hw-cookie-2__lang", lang);
        cookie.setMaxAge(60 * 60 * 24 * 365); // 1 year

        resp.addCookie(cookie);

        resp.sendRedirect(req.getContextPath() + "/hw-cookie-2");
    }
}
