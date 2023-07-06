<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<c:set value="20230705-003" var="version" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>To Do List</title>

<link href="${rootPath}/static/css/main.css?${version}" rel="stylesheet" />
</head>
<body>
	<header>
		<h1>TO DO List 2023</h1>
	</header>

	<section class="main">
		<form class="main">
			<input type="date" value="${TODO.to_sdate}" placeholder="작성일자"
				name="to_sdate" /> <input type="time" value="${TODO.to_stime}"
				placeholder="작성시각" name="to_stime" /> <input placeholder="할일"
				class="todo" name="to_content" />
		</form>
		<table class="list">
			<c:if test="${empty TODOS}">
				<tr>
					<td>데이터가 없습니다.</td>
				</tr>
			</c:if>
			<c:forEach items="${TODOS}" var="TO">
				<tr>
					<td>${TO.to_sdate}</td>
					<td>${TO.to_stime}</td>
					<td>${TO.to_content}</td>
				</tr>
			</c:forEach>
		</table>
	</section>

</body>
</html>