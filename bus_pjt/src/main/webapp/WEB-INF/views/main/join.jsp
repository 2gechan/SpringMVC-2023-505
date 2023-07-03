<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<c:set value="20230703-001" var="version" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<link href="${rootPath}/static/css/index.css" rel="stylesheet" />
<link href="${rootPath}/static/css/join.css" rel="stylesheet" />
</head>
<body>
	<div class="wrapper">
		<h1>
			<a href="${rootPath}/">시외버스</a>
		</h1>
		<div class="signUpTitle">시외버스 회원가입</div>
		<form action="">
			<div>
				<input class="form" id="email" placeholder="ID를 입력해주세요." />
			</div>
			<div>
				<input class="form" id="pwd1" type="password"
					placeholder="비밀번호를 입력해 주세요." />
			</div>
			<div>
				<input class="form" id="pwd2" type="password"
					placeholder="비밀번호를 다시 입력해 주세요." />
			</div>
			<div>
				<input class="form" id="writer" placeholder="이름을 입력해 주세요." />
			</div>
			<div>
				<input class="form" id="phone" placeholder="휴대폰 번호를 입력하세요" />
			</div>
			<div class="gender" id="gender">
				<input type="radio" name="gender" />여성 <input type="radio"
					name="gender" />남성
			</div>
			<div class="divideLine"></div>
			<button type="submit" id="signUp" class="signUp">가입하기</button>
		</form>
	</div>
</body>

</html>