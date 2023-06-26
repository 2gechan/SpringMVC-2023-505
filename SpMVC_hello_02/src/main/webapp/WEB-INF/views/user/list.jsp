<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- html에서 제공하지 않는 기능들을 가져온다 c:문법 방식으로 사용한다 -->

<%
/*
var rootPath = pageContext.request.contextPath
원래는 pageContext.request.contextPath 라는 긴 이름으로 사용해야 했는데
앞으로는 rootPath 라는 변수 이름으로 사용할 수 있게 된다.
core tag 를 사용하여 현재 page 에서 사용할 변수 선언하기
*/
%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
table {
	border: 1px solid green;
}

table th, td {
	border: 1px solid green;
}
</style>
</head>
<body>
	<h1>User List</h1>

	<%
	/*
	UserController 에서 설정한 USERS Attribute 를
	table 을 사용하여 화면에 Rendering 하기
	*/
	%>

	<table>
		<tr>
			<th>ID</th>
			<th>패스워드</th>
			<th>이름</th>
			<th>전화번호</th>
			<th>주소</th>
			<th>나이</th>
		</tr>
		<c:forEach items="${USERS}" var="USER">
			<tr>
				<td>${USER.username}</td>
				<td>${USER.password}</td>
				<td>${USER.name}</td>
				<td>${USER.tel}</td>
				<td>${USER.addr}</td>
				<td>${USER.age}</td>
			</tr>
		</c:forEach>

	</table>
	<a href="${rootPath}/user/input">추가하기</a>
</body>
</html>