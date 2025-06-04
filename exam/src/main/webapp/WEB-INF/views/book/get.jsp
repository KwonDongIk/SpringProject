<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<div class="row">
    <div class="col-lg-12">
        <div class="panel panel-default">

            <div class="panel-heading">도서 등록</div>
            <!-- /.panel-heading -->
            <div class="panel-body">

                <div class="form-group">
                    <label>도서번호</label> <input class="form-control" name='book_no' value='<c:out value="${book.book_no }"/>'>
                </div>

                <div class="form-group">
                    <label>도서명</label> <input class="form-control" name='book_name'
                        value='<c:out value="${book.book_name }"/>'>
                </div>
                
                <div class="form-group">
                    <label>도서표지</label> <input class="form-control" name='book_coverimg'
                        value='<c:out value="${book.book_coverimg }"/>'>
                </div>

                <div class="form-group">
                    <label>Text area</label>
                    <textarea class="form-control" rows="3" name='content'
                        readonly="readonly"><c:out value="${board.content}" /></textarea>
                </div>

                <div class="form-group">
                    <label>Writer</label> <input class="form-control" name='writer'
                        value='<c:out value="${board.writer }"/>' readonly="readonly">
                </div>

                <a href="modify?bno=${board.bno}">등록</a>
                <a href="remove?bno=${board.bno}">조회</a>
                <a href="list">목록</a>



            </div>
            <!--  end panel-body -->
        </div>
        <!--  end panel-body -->
    </div>
    <!-- end panel -->
</div>
<!-- /.row -->
