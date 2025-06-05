<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>elobject.jsp</title>
</head>
<body>
<%  // page -> request -> session -> application
	request.setAttribute("username", "홍길동");
	session.setAttribute("username", "김민지");
	request.setAttribute("list", Arrays.asList("월요일", "화요일", "수요일"));
%>
username : ${username}<br>
session username : ${sessionScope.username}<br>
parameter : ${param.age} <%=request.getParameter("age")%><br>
parameter : ${params.age} <%=request.getParameterValues("age") %><br>
header : ${header["user-agent"]} <%=request.getHeader("user-agent") %><br>
ip addr : ${pageContext.request.remoteAddr } <%=request.getRemoteAddr() %><br>
<ul>
	<c:forEach items="${list}" var="week">
		<li>${week}</li>
	</c:forEach>
</ul>
</body>
</html>