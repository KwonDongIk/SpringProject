<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%@include file="/WEB-INF/views/includes/header.jsp"%>

<div class="row">
  <div class="col-lg-12">
    <div class="panel panel-default">
      <div class="panel-heading">도서 조회/수정</div>
      <div class="panel-body">
        <table class="table table-striped table-borderd table-hover">
          <thead>
            <tr>
              <th>도서번호</th>
              <th>도서명</th>
              <th>표지</th>
              <th>출판일자</th>
              <th>금액</th>
              <th>출판사</th>
              <th>도서소개</th>
            </tr>
          </thead>
		  <tbody>
          <c:forEach items="${list}" var="book">
            <tr>
              <td>
                <c:out value="${book.book_no}" />
              </td>
              <td>
                <c:out value="${book.book_name}" />
              </td>
              <td>
              	<img src="/exam/image/${book.book_coverimg}" style="width : 100px">
              </td>
              <td>
                <fmt:formatDate pattern="yyyy/MM/dd" value="${book.book_date}" />
              </td>
              <td>
              	<c:out value="${book.book_price}" />
              </td>
              <td>
                <c:out value="${book.book_publisher}" />
              <td>
               <c:out value="${book.book_info}" />
              </td>
            </tr>
          </c:forEach>
		</tbody>
        </table>

      </div>
    </div>
  </div>
</div>
<!-- row -->


<%@include file="/WEB-INF/views/includes/footer.jsp"%>

</html>
