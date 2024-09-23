<%--
  Created by IntelliJ IDEA.
  User: 林星瀚
  Date: 2024/9/21
  Time: 15:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Dashboard - Yeah</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>
<nav class="navbar navbar-expand-lg bg-body-tertiary">
    <div class="container">
        <a class="navbar-brand" href="#">Yeah</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link" href="resume.html">简历</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">登录</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<main class="container mt-3">
    登录成功之后显示的个人主页
    <p>欢迎回来：<%=request.getParameter("email")%></p>
</main>


<script src="js/bootstrap.bundle.min.js"></script>
</body>
</html>

