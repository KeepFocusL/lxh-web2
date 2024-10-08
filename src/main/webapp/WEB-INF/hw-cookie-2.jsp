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
        ${hwDescription}
    </p>

    <hr>

    <form method="post" action="hw-cookie-2">
        <fieldset>
            <legend>${formLegend}</legend>
            <div>
                <input type="radio" name="lang" value="zh" id="lang_zh" ${"zh".equals(lang) ? "checked" : ""}/>
                <lable for="lang_zh">${langZhText}</lable>

                <input type="radio" name="lang" value="en" id="lang_en" ${"en".equals(lang) ? "checked" : ""}/>
                <lable for="lang_en">${langEnText}</lable>
            </div>
            <div>
                <button type="submit">${submitText}</button>
            </div>
        </fieldset>
    </form>
</div>
</body>
</html>
