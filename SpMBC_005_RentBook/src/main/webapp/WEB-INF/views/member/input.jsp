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
	<h1>회원정보 추가</h1>
	<c:if test="${not empty MESSAGE && MESSAGE == 'NAME_TEL'}">
		<h2>!! 이름과 전화번호 데이터가 이미 등록되어 있습니다.</h2>
	</c:if>
	<f:form modelAttribute="MEMBER">
		<div>
			<label>회원명</label>
			<f:input path="m_name" />
		</div>
		<div>
			<label>전화번호</label>
			<f:input path="m_tel" />
		</div>
		<div>
			<label>주소</label>
			<f:input path="m_addr" />
		</div>
		<div>
			<label>회원코드</label>
			<f:input path="m_code" />
		</div>
		<div>
			<button type="button">
				<a href="${rootPath}/member">리스트로</a>
			</button>
			<button type="submit">저장하기</button>
			<button type="reset">새로작성</button>
		</div>
	</f:form>
</body>
</html>