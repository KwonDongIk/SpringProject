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
	      <div class="panel-heading">등록 Form</div>
	        <div class="panel-body">
	
	          <form role="form" action="register" method="post" class="main-form">
	            <div class="form-group">
	              <label for="">Title</label> <input class="form-control" name="title">
	            </div>
	
	            <div class="form-group">
	              <label for="">Text Area</label> <textarea class="form-control"  rows="5" name="content"></textarea>
	            </div>
	
	            <div class="form-group">
	              <label for="">Writer</label> <input class="form-control" name="writer">
	            </div>
	
	            <button type="submit" class="btn btn-default">Submit Button</button>
	            <button type="reset" class="btn btn-default">Reset Button</button>
	
	          </form>
	        
	        </div>
	    </div>
	  </div>
	</div>
</body>
</html>