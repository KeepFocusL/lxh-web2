<%--
  Created by IntelliJ IDEA.
  User: 林星瀚
  Date: 2024/9/25
  Time: 20:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>新手指引</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/driver.js@1.0.1/dist/driver.css"/>
</head>
<body>
<h1 id="h1">新手指引</h1>
<h2 id="step1">第一步</h2>
<p>
    随机文字随机文字随机文字随机文字随机文字随机文字随机文字随机文字随机文字随机文字随机文字随机文字,<br>
    随机文字随机文字随机文字随机文字随机文字随机文字随机文字随机文字随机文字随机文字随机文字随机文字,<br>
    随机文字随机文字随机文字随机文字随机文字随机文字随机文字随机文字随机文字随机文字随机文字随机文字,<br>
    随机文字随机文字随机文字随机文字随机文字随机文字随机文字随机文字随机文字随机文字随机文字随机文字,<br>
    随机文字随机文字随机文字随机文字随机文字随机文字随机文字随机文字随机文字随机文字随机文字随机文字,<br>
    随机文字随机文字随机文字随机文字随机文字随机文字随机文字随机文字随机文字随机文字随机文字随机文字。<br>
</p>
<hr>
<h2 id="step2">第二步</h2>
<p>
    没有文字没有文字没有文字没有文字没有文字没有文字没有文字没有文字没有文字没有文字没有文字没有文字,<br>
    没有文字没有文字没有文字没有文字没有文字没有文字没有文字没有文字没有文字没有文字没有文字没有文字,<br>
    没有文字没有文字没有文字没有文字没有文字没有文字没有文字没有文字没有文字没有文字没有文字没有文字,<br>
    没有文字没有文字没有文字没有文字没有文字没有文字没有文字没有文字没有文字没有文字没有文字没有文字,<br>
    没有文字没有文字没有文字没有文字没有文字没有文字没有文字没有文字没有文字没有文字没有文字没有文字,<br>
    没有文字没有文字没有文字没有文字没有文字没有文字没有文字没有文字没有文字没有文字没有文字没有文字,<br>
</p>
<hr>
<h2 id="step3">第三步</h2>
<p>
    哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈,<br>
    哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈,<br>
    哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈,<br>
    哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈,<br>
    哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈,<br>
    哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈。<br>
</p>

<script src="https://cdn.jsdelivr.net/npm/driver.js@1.0.1/dist/driver.js.iife.js"></script>

<c:if test="${isNewUser}">
    <script>
        const driver = window.driver.js.driver;

        const driverObj = driver({
            showProgress: true,
            allowClose: false,
            steps: [
                {
                    element: '#step1',
                    popover: {
                        title: '万事开头难',
                        description: '大胆迈出第一步',
                        side: "left",
                        align: 'start'
                    }
                },
                {
                    element: '#step2',
                    popover: {
                        title: '这是第二步',
                        description: '有了经验逐渐熟练',
                        side: "top",
                        align: 'start'
                    }
                },
                {
                    element: '#step3',
                    popover: {
                        title: '这是第三步',
                        description: '舒服了',
                        side: "bottom",
                        align: 'start'
                    }
                },
                {
                    popover: {
                        title: '通关了',
                        description: '你无敌了'
                    }
                }
            ],
            onDestroyStarted: () => {
                if (!driverObj.hasNextStep() || confirm("确定退出?")) {
                    driverObj.destroy();
                }
            },
            onDestroyed: () => {
                window.location = "http://localhost:8080/lxh_web2_war/product-add-cookie";
            }
        });

        driverObj.drive();
    </script>
</c:if>
</body>
</html>