<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="2023-07-11-001" var="version" />
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<link href="${rootPath}/resources/css/main.css?${version}" rel="stylesheet" />
<body>
	<header>
		<h1>이미지 겔러리</h1>
	</header>
	<div>
	<table>
		<tr>
			<th>NO.</th>
			<th>작성일자</th>
			<th>작성시각</th>
			<th>작성자 닉네임</th>
			<th>제목</th>
		</tr>
		<tr>
			<td>1</td>
			<td>2020-11-06</td>
			<td>14:00</td>
			<td></td>
			<td></td>
		</tr>
		<tr>
			<td>2</td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
		</tr>
	</table>
	<button>글쓰기</button>
	</div>
</body>
</html>
