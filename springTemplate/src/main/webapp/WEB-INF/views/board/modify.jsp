<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수정 페이지</title>
<style>
	.panel-heading{
		text-align: center;
		font-size: 50px;
	}
	.main-form{
       	background: white;
        border-radius: 15px;
        box-shadow: 0 10px 30px rgba(0,0,0,0.1);
        padding: 40px;
        width: 100%;
        max-width: 600px;
        margin: 0 auto;
	}
    .form-group {
        margin-bottom: 25px;
        text-align: center;
    }
    
    .form-label {
        font-weight: 600;
        color: #495057;
        margin-bottom: 8px;
        font-size: 1.1rem;
    }
    
    .form-control {
        border: 2px solid #e9ecef;
        border-radius: 8px;
        padding: 12px 15px;
        font-size: 1rem;
        transition: all 0.3s ease;
    }
    
    .btn {
    	width: 100px;
    	height: 100px;
    	background-color: #000;
    	color: #FFF;
    	cursor: pointer;
    }
</style>
</head>
<body>
	<div class="row">
		<div class="col-lg-12">
			<!-- <h1 class="page-header">등록 페이지 ^___^</h1> -->
		</div>
	</div>

	<div class="row">
	  <div class="col-lg-12">
	    <div class="panel panel-default">
	      <div class="panel-heading">수정 Form</div>
	        <div class="panel-body">
	
	          <form role="form" action="modify" method="post" class="main-form">
	          	<input type="hidden" name="bno" value="${board.bno}">
	            <div class="form-group">
	              <label for="">Title</label> <input class="form-control" name="title" value="${board.title}">
	            </div>
	
	            <div class="form-group">
	              <label for="">Text Area</label> <textarea class="form-control"  rows="5" name="content">${board.content}</textarea>
	            </div>
	
	            <div class="form-group">
	              <label for="">Writer</label> <input class="form-control" name="writer" value="${board.writer}">
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