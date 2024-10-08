<%--
  Created by IntelliJ IDEA.
  User: 林星瀚
  Date: 2024/10/8
  Time: 9:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>hw-cookie-2<</title>
    <base href="${baseUrl}">
</head>
<body>
<div>
    <h2>hw-cookie-2</h2>
    <p>
        需求描述：<br>
        - 网站支持中文和英文，默认按照浏览器语言选项自动判断<br>
        - 也提供单选框 radio（两个选项：中文/英文），用户可以主动勾选，一旦主动勾选，后续都按照主动勾选的语言显示。
    </p>

    <hr>

    <form method="post" action="hw-cookie-2">
        <fieldset>
            <legend>选择页面显示语言:</legend>
            <div>
                <input type="radio" name="lang" value="zh" id="lang_cn" ${"en".equals(lang) ? "checked" : ""}/>
                <lable for="lang_en">中文</lable>

                <input type="radio" name="lang" value="en" id="lang_en" ${"en".equals(lang) ? "checked" : ""}/>
                <lable for="lang_en">English</lable>
            </div>
            <div>
                <button type="submit">提交</button>
            </div>
        </fieldset>
    </form>
</div>
</body>
</html>
