<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring JSP 연습</title>
</head>
<body>
main입니다.
${sampleDTO}<br>
${param.name}<!-- request.getParameter("") --><br>
${param.age}<br>
${dept}<br>
name : ${param.name}<br>
msg : ${msg}
</body>
</html>