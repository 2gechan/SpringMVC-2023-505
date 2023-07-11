<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="2023-07-11-002" var="version" />
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>"${BBS.b_subject}"</title>
<link href="${rootPath}/resources/css/detail.css?${version}" rel="stylesheet">

</head>
<body>
	<div class="container">
		<div>
			<label>작성일자</label> <input value="${BBS.b_date}" />
		</div>
		<div>
			<label>작성시각</label> <input value="${BBS.b_time}" />
		</div>
		<div>
			<label>작성자</label> <input value="${BBS.nickname}" />
		</div>
		<div>
			<label>제목</label> <input value="${BBS.b_subject}" />
		</div>
		<div>
			<label>내용</label> <input value="${BBS.b_content}" />
		</div>
	</div>
</body>
</html>