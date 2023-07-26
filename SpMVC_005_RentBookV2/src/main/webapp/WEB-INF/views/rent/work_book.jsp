<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="${rootPath}/static/css/input.css" rel="stylesheet" />
<script type="text/javascript">
	var rootPath = "${rootPath}"
</script>
<script type="text/javascript" src="${rootPath}/static/js/main.js"></script>
<script type="text/javascript" src="${rootPath}/static/js/book.js"></script>
</head>
<body>
	<%
	/*
	 * 현재 화면에서 도서명, 도서코드, 도서출판사의 데이터를 입력한 후
	 * 다음 버튼을 클릭하면 입력된 데이터를 가지고
	 * localhost:8080/rent/rent/go/member request에게 전달하라
	 * Spring form tag를 사용하는 입력 form은 기본 method가 POST 이다.
	 */
	%>
	<h1>도서검색</h1>
	<f:form action="${rootPath}/rent/go/member" modelAttribute="RENT_WORK">
		<div>
			<label>도서명</label>
			<div class="search container">
				<f:input path="b_name" />
				<div class="search list">Search List</div>
			</div>

		</div>
		<div>
			<label>도서코드</label>
			<f:input path="rent_bcode" />
		</div>
		<div>
			<label>출판사</label>
			<f:input path="b_comp" />
		</div>
		<div>
			<button>다음 >></button>
		</div>
	</f:form>
</body>
</html>