<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원정보</h1>
	<div>
		<label>회원코드</label><strong>${MEMBER.m_code}</strong>
	</div>
	<div>
		<label>회원명</label><strong>${MEMBER.m_name}</strong>
	</div>
	<div>
		<label>전화번호</label><strong>${MEMBER.m_tel}</strong>
	</div>
	<div>
		<label>주소</label><strong>${MEMBER.m_addr}</strong>
	</div>
	<div><button type="button"><a href="${rootPath}/member/${MEMBER.m_code}/update">수정하기</a></button></div>
</body>
</html>