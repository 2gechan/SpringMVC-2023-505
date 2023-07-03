<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<c:set value="20230703-001" var="version" />
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>시외버스 - 로그인</title>

<script src="${rootPath}/static/js/login.js"></script>
<link rel="stylesheet"
	href="${rootPath}/static/css/login.css?${version}" />
<link rel="preconnect" href="https://fonts.googleapis.com" />
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
<link
	href="https://fonts.googleapis.com/css2?family=Dongle:wght@700&display=swap"
	rel="stylesheet" />
</head>
<body>
	<div class="wrapper">
		<h1>
			<a href="${rootPath}/">시외버스</a>
		</h1>
		<div class="loginTitle">시외버스 로그인</div>
		<input class="form" name="email" placeholder="이메일을 입력해주세요." /> <input
			class="form" name="password" type="password"
			placeholder="비밀번호를 입력해 주세요." />
		<div id="auto_login">
			<input type="checkbox" /><span>자동로그인</span>
		</div>
		<div class="divideLine"></div>
		<button class="login" id="login_button">로그인</button>
		<button class="login">Naver 로그인</button>
		<div class="login_etc">
			<a href="${rootPath}/join">회원가입</a> | <a href="${rootPath}/findIdPw">아이디/비번찾기</a>
		</div>
	</div>
</body>
</html>
