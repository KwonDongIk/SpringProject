<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%@include file="/WEB-INF/views/includes/header.jsp"%>

<!DOCTYPE html>
<html>
<style>
	body{
		background-color : green;
	}
	h2{
		text-align : center;
		font-weight: bold;
	}
</style>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>도서대여관리 프로그램</h2>
	<div class="main_container">
		국제 대여점의 도서등록, 대여정보 데이터베이스를 구축하고, 도서.DVD 대여관리를 위한 프로그램이다.<br>
		프로그램 작성 순서<br>
		<br>
		1. 도서정보 테이블을 생성한다.<br>
		2. 대여정보 테이블을 생성한다.<br>
		3. 도서정보, 대여정보 테이블에 제시된 문제지의 참조데이터를 추가 생성한다.<br>
		4. 도서정보 입력 화면프로그램을 작성한다.<br>
		5. 도서정보 조회 프로그램을 작성한다.<br>
		6. 대여 정보 조회 프로그램을 작성한다.<br>
	</div>
	
</body>
<%@include file="/WEB-INF/views/includes/footer.jsp"%>
</html>
