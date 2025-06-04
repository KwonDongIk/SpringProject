<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>등록 페이지</title>
</head>
<%@include file="/WEB-INF/views/includes/header.jsp" %>
<body>
	<div class="row">
		<div class="col-lg-12">
			<!-- <h1 class="page-header">등록 페이지 ^___^</h1> -->
		</div>
	</div>

	<div class="row">
	  <div class="col-lg-12">
	    <div class="panel panel-default">
	      <div class="panel-heading">도서 등록</div>
	        <div class="panel-body">
	
	          <form role="form" action="register" method="post" class="main-form">
	            <!-- <div class="form-group">
	              <label for="">도서번호</label> <input class="form-control" name="book_no">
	            </div> -->
	            
	            <div class="form-group">
	              <label for="">도서명</label> <input class="form-control" name="book_name">
	            </div>
	            
	            <div class="form-group">
	              <label for="">도서표지</label> <input class="form-control" name="book_coverimg">
	            </div>
	            
	            <div class="form-group">
	              <label for="">출판일자</label> <input class="form-control" name="book_date">
	            </div>
	            
	            <div class="form-group">
	              <label for="">금액</label> <input class="form-control" name="book_price">
	            </div>
	            
	            <div class="form-group">
	              <label for="">출판사</label> <input class="form-control" name="book_publisher">
	            </div>
	
	            <div class="form-group">
	              <label for="">도서소개</label> <textarea class="form-control"  rows="5" name="book_info"></textarea>
	            </div>
	
	            <button type="submit" class="btn btn-default">등록</button>
	            <button type="reset" class="btn btn-default">조회</button>
	
	          </form>
	        
	        </div>
	    </div>
	  </div>
	</div>
</body>
</html>