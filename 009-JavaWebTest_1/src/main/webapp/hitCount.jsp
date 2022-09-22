<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<html>
<head>
    <title>Request page</title>
</head>
<body>
<h1>Request变量的使用</h1>
<%
    String Num=(String)request.getAttribute("Num");
    if(Num==null){
        out.println("无法从request对象中取得名为Num的数据");
    }else{
        out.println("Num的值为："+Num);
    }
%>
</body>
</html>
