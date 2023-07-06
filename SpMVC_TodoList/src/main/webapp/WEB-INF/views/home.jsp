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

<link href="${rootPath}/resources/css/main.css?${version}"
	rel="stylesheet" />
</head>
<body>
	<header>
		<h1>TO DO List 2023</h1>
	</header>

	<section class="main">
		<form action="">
			<input value="${DATE}" placeholder="작성일자" /> <input value="${TIME}" placeholder="작성시각" /> <input
				placeholder="할일" class="todo" />
		</form>
		<table>
			<tr>
				<th>NO.</th>
				<th>할 일</th>
				<th>완료여부</th>
			</tr>
			<tr>
				<td>2023-07-06</td>
				<td>14:20:00</td>
				<td>팀프로젝트</td>
			</tr>
			<tr>
				<td>2</td>
				<td></td>
				<td></td>
			</tr>
		</table>
	</section>

</body>
</html>