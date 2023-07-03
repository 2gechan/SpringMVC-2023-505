<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<c:set value="20230703-001" var="version" />
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>시외버스 - ID/PW 찾기</title>
<link
	href="https://fonts.googleapis.com/css2?family=Dongle:wght@700&display=swap"
	rel="stylesheet" />
<link rel="stylesheet" href="${rootPath}/static/css/findIdPw.css" />
<script src="${rootPath}/static/js/findIdPw.js"></script>
</head>
<body>
	<div class="wrapper">
		<h1>
			<a href="${rootPath}/">시외버스</a>
		</h1>
		<div class="findTitle">시외버스 ID/PW 찾기</div>
		<div class="subTitle">ID 찾기</div>

		<input class="form" placeholder="이름을 입력해 주세요." /> <input class="form"
			placeholder="휴대폰 번호를 입력해 주세요." /> <select class="area" id="area">
			<option value="">지역을 선택하세요</option>
			<option value="1">서울</option>
			<option value="2">경기</option>
			<option value="3">인천</option>
		</select> <select class="gender" id="gender">
			<option value="">성별을 선택하세요</option>
			<option value="1">여성</option>
			<option value="2">남성</option>
		</select>

		<button type="button" class="find_button" id="find_button1">
			아이디 찾기</button>
		<div class="subTitle">PASSWORD 찾기</div>
		<input class="form" placeholder="이메일을 입력해주세요." /> <input class="form"
			placeholder="이름을 입력해주세요." /> <input class="form"
			placeholder="휴대폰 번호를 입력해 주세요." />
		<button type="button" class="find_button" id="find_button2">
			비밀번호 찾기</button>
	</div>
</body>
</html>
