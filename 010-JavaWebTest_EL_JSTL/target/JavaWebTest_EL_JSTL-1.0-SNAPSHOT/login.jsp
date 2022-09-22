<%--
  Created by IntelliJ IDEA.
  User: qiao
  Date: 2022/3/15
  Time: 16:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="http://localhost:8080/JavaWebTest_EL_JSTL_war_exploded/loginServlet" method="get">
        用户名：<input type="text" name="username" value="${cookie.username.value}"><br>
        密码：<input type="password" name="password" value="${cookie.password.value}"> <br>
        <input type="submit" value="登录">
    </form>
</body>
</html>
