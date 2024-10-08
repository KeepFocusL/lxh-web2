<%--
  Created by IntelliJ IDEA.
  User: 林星瀚
  Date: 2024/9/21
  Time: 15:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>、
<%@ page import="java.util.List" %>
<%@ page import="io.github.keepfocusl.lxhweb2.day240925.StudentData" %>
<%@ page import="io.github.keepfocusl.lxhweb2.day240925.MyDBUtil" %>
<%@ page import="java.util.ArrayList" %>
<%
    List<StudentData> students = new ArrayList<>();
    students.add(new StudentData( "小红","女"));
    students.add(new StudentData("小黑","男"));
    students.add(new StudentData("老八", "男"));
%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Dashboard</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>
<nav class="navbar navbar-expand-lg bg-body-tertiary">
    <div class="container">
        <a class="navbar-brand" href="#">lxh</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link" href="resume.html">简历</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="login.html">登录</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Code</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">About</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<table>
    <thead>
    <tr>
        <th>No</th>
        <th>Name</th>
        <th>Age</th>
    </tr>
    </thead>
    <tbody>
    <%
        for (int i = 0; i < students.size(); i++) {
            StudentData student = students.get(i);
    %>
    <tr>
        <td><%= i +1 %></td>
        <td><%= student.getName() %></td>
        <td><%= student.getSex() %></td>
    </tr>
    <%
        }
    %>
    </tbody>
</table>


<script src="js/bootstrap.bundle.min.js"></script>
</body>
</html>

