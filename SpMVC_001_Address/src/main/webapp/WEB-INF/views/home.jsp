<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="${rootPath}/static/css/main.css?20230628-001"
	rel="stylesheet" />
<link href="${rootPath}/static/css/table.css?20230628-001"
	rel="stylesheet" />
<link href="${rootPath}/static/css/button.css?20230628-001"
	rel="stylesheet" />
<link href="${rootPath}/static/css/form.css?20230628-002"
	rel="stylesheet" />

<script>
	// JSP 에서 사용하는 rootPath 변수를
	// JS 코드에서 사용하기 위한 rootPath 변수로 재 설정
	var rootPath = "${rootPath}"
</script>
<!-- vscode에서 작업한 js파일은 sts에서 x표시로 에러가 있다고 나타나지만 무시해도 된다. -->
<script src="${rootPath}/static/js/input.js?20230629-003"></script>
</head>
<body>
	<header>
		<h1>주소록 프로젝트 2023</h1>
		<p>Spring MVC 패턴 기반 주소록 프로젝트
	</header>
	<section class="main">
		<c:if test="${empty BODY}">
			<!-- 다른 JSP 파일을 가져와서 화면에 보여준다 -->
			<!-- 파일경로를 정확히 입력해주어야 한다. -->
			<%@ include file="/WEB-INF/views/addr/list.jsp"%>
		</c:if>
		<c:if test="${BODY == 'INPUT'}">
			<%@ include file="/WEB-INF/views/addr/input.jsp"%>
		</c:if>
	</section>
	<footer>
		<address>Copyright &copy; github.com/2gechan</address>
	</footer>
</body>
</html>