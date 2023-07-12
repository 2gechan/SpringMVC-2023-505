<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="2023-07-11-002" var="version" />
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<link href="${rootPath}/resources/css/main.css?${version}"
	rel="stylesheet" />
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
				<th>작성자ID</th>
				<th>제목</th>
				<th>조회수</th>
			</tr>
			<c:forEach items="${BBS_LIST}" var="BBS">
				<tr>
					<td>${BBS.b_seq}</td>
					<td>${BBS.b_date}</td>
					<td>${BBS.b_time}</td>
					<td><a
						href="${rootPath}/search/user?username=${BBS.b_username}">${BBS.nickname}</a></td>
					<td><a
						href="${rootPath}/detail/seq?seq=${BBS.b_seq}">${BBS.b_subject}</a></td>
					<td>${BBS.b_count}</td>
				</tr>
			</c:forEach>

		</table>
		<button>글쓰기</button>
	</div>
</body>
</html>
