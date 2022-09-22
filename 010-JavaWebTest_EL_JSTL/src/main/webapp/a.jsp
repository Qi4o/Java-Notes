<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: qiao
  Date: 2022/3/9
  Time: 13:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        request.setAttribute("key", "值");
    %>
    表达式输出的值是: <%= request.getAttribute("key1")%> <br>
    EL表达式输出的是：${key1}
    ${pageContext.request.serverName}


    <c:if test="${13 == 12}">
        <h1>12于12</h1>
    </c:if>
</body>
</html>
