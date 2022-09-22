<%@page import="java.net.InetAddress"%>
<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<html>
<head>
    <title>Request page</title>
</head>
<body>
    <%
	String Protocol=request.getProtocol();
	out.println("请求使用的协议："+Protocol+"<br>");
	String Schema=request.getScheme();
	out.println("请求使用的Schema："+Schema+"<br>");
	String ServerName=request.getServerName();
	out.println("访问服务的名称："+ServerName+"<br>");
	int ServerPort=request.getServerPort();
	out.println("访问端口号："+ServerPort+"<br>");
	String ServletInfo=application.getServerInfo();
	out.println("Servlet容器："+ServletInfo+"<br>");
	String RemoteAddr =request.getRemoteAddr();
	out.println("客户IP地址："+RemoteAddr+"<br>");
	String Method=request.getMethod();
	out.println("请求的类型："+Method+"<br>");
	String getRequestedSessionId=request.getRequestedSessionId();
	out.println("Session ID："+getRequestedSessionId+"<br>");
	String RequestURI=request.getRequestURI();
	out.println("请求的资源定位（Request URL）："+RequestURI+"<br>");
	String ServletPath=request.getServletPath();
	out.println("servlet在相对服务器文件夹的位置："+ServletPath+"<br>");
	String RemoteHost=request.getRemoteHost();
	out.println("Host："+RemoteHost+"<br>");
	Locale  Locale=response.getLocale();
	out.println("AcceptLanguage："+Locale+"<br>");

	long CreationTime=session.getCreationTime();
	out.println("session的相关信息-创建时间："+new Date(CreationTime)+"<br>");
	long LastAccessedTime=session.getLastAccessedTime();
	out.println("session的相关信息-上次访问时间："+new Date(LastAccessedTime)+"<br>");
%>
