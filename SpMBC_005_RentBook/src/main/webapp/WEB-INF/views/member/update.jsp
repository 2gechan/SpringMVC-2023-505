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
</head>
<body>
	<f:form action="">
		<div>
			<label>회원코드</label><input value="${MEMBER.m_code}" readonly />
		</div>
		<div>
			<label>회원명</label><input value="${MEMBER.m_name}" />
		</div>
		<div>
			<label>전화번호</label><input value="${MEMBER.m_tel}" />
		</div>
		<div>
			<label>주소</label><input value="${MEMBER.m_addr}" />
		</div>
		<div>
			<button type="submit">수정하기</button>
		</div>
	</f:form>
</body>
</html>