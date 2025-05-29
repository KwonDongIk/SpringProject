<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%@include file="/WEB-INF/views/includes/header.jsp"%>

<div class="row">
  <div class="col-lg-12">
    <h1 class="page-header">Tables</h1>
    <button class="btn">
      <a href="register">등록</a>
    </button>
  </div>
</div>

<div class="row">
  <div class="col-lg-12">
    <div class="panel panel-default">
      <div class="panel-heading">Board List Page</div>
      <div class="panel-body">
        <table class="table table-striped table-borderd table-hover">
          <thead>
            <tr>
              <th>#번호</th>
              <th>제목</th>
              <th>작성자</th>
              <th>작성일</th>
              <th>수정일</th>
            </tr>
          </thead>

          <c:forEach items="${list}" var="board">
            <tr>
              <td>
                <c:out value="${board.bno}" />
              </td>
              <td><a href='get?bno=${board.bno}'>${board.title}</a></td>
              <td>
                <c:out value="${board.writer}" />
              </td>
              <td>
                <fmt:formatDate pattern="yyyy-MM-dd" value="${board.regdate}" />
              </td>
              <td>
                <fmt:formatDate pattern="yyyy-MM-dd" value="${board.updateDate}" />
              </td>
            </tr>
          </c:forEach>

        </table>
        <form id="searchForm" action="/board/list" method="get">
          <select name="type">
            <option value="">--</option>
            <option value="T">제목</option>
            <option value="C">내용</option>
            <option value="W">작성자</option>
            <option value="TC">제목 or 내용</option>
            <option value="TW">제목 or 작성자</option>
            <option value="TWC">제목 or 내용 or 작성자</option>
          </select> <input type="text" name="keyword" value="${pageMaker.cri.keyword}" />

          <button class="btn btn-outline-primary">Search</button>

          <input type="hidden" name="pageNum" value="1" />
          <input type="hidden" name="amount" value="10" />
        </form>
        <nav aria-label="Page navigation example">
          <ul class="pagination">
            <c:if test="${pageMaker.prev}">
              <li class="page-item previous">
                <a class="page-link" href="${pageMaker.startPage -1}">Previous</a></li>
            </c:if>

            <c:forEach var="num" begin="${pageMaker.startPage}" end="${pageMaker.endPage}">
              <li class="page-item  ${pageMaker.cri.pageNum == num ? " active":""} ">
								<a class=" page-link" href="${num}">${num}</a>
              </li>
            </c:forEach>

            <c:if test="${pageMaker.next}">
              <li class="page-item next">
                <a class="page-link" href="${pageMaker.endPage +1 }">Next</a></li>
            </c:if>
          </ul>
        </nav>


      </div>
    </div>
  </div>
</div>
<!-- row -->

<!-- Modal  추가 -->
<div class="modal fade" id="myModal" tabindex="-1">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h4 class="modal-title" id="myModalLabel">Modal title</h4>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body">처리가 완료되었습니다.</div>
      <div class="modal-footer">
        <button type="button" id="btnClose" class="btn btn-default" data-dismiss="modal">Close</button>
      </div>
    </div>
    <!-- /.modal-content -->
  </div>
  <!-- /.modal-dialog -->
</div>
<!-- /.modal -->

<script>
  $(document).ready(function () {
	/* $(['name=type']).val('${pageMaker.cri.type}')} */
	let searchForm = $("#searchForm");
	
    /*--------------------
    // 등록 후 모달 열기
    ---------------------*/	  
    var result = "${result}";
    checkModal(result);

    function checkModal(result) {
      if (result === "") {
        return;
      }

      if (parseInt(result) > 0) {
        $(".modal-body").html(
          "게시글 " + parseInt(result) + " 번이 등록되었습니다."
        );
      }

      const options = { backdrop: false, focus: false, keyboard: true };
      const myModal = document.getElementById("myModal");
      const myModalAlternative = new bootstrap.Modal("#myModal", options);
      myModalAlternative.show(myModal);
    }
    
    /*--------------------
    //검색 버튼 핸들러
    ---------------------*/
    $("#searchForm button").on("click", function (e) {
        if (!searchForm.find("option:selected").val()) {
          alert("검색종류를 선택하세요");
          return false;
        }

        if (!searchForm.find("input[name='keyword']").val()) {
          alert("키워드를 입력하세요");
          return false;
        }

        searchForm.find("input[name='pageNum']").val("1");
        e.preventDefault();
        searchForm.submit();
      }); 
    
    $(".pagination a").on("click", function (e) {
        e.preventDefault();
        searchForm.find("input[name='pageNum']").val($(this).attr("href"));
        searchForm.submit();
    });
  });
 </script>
<%@include file="/WEB-INF/views/includes/footer.jsp"%>

</html>
