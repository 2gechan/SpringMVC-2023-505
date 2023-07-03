<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<c:set value="20230703-001" var="version" />
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>시외버스 - 터미널위치조회</title>
<link rel="stylesheet" href="${rootPath}/static/css/main.css?${version}" />
<link rel="stylesheet"
	href="${rootPath}/static/css/index.css?${version}" />
<link rel="stylesheet"
	href="${rootPath}/static/css/usuallyBus.css?${version}" />
<link rel="stylesheet"
	href="${rootPath}/static/css/searchArea.css?${version}" />
<link rel="preconnect" href="https://fonts.googleapis.com" />
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
<link
	href="https://fonts.googleapis.com/css2?family=Dongle:wght@700&display=swap"
	rel="stylesheet" />
<script src="${rootPath}/static/js/searchArea.js" defer></script>
<script type="text/javascript"
	src="//dapi.kakao.com/v2/maps/sdk.js?appkey=393af6ea3a14898bb3bb27dd83f161cc&libraries=services"></script>
</head>
<body class="slide-in">
	<div id="all">
		<div id="middle">
			<div id="top-title">
				<header>
					<h1>
						<a href="${rootPath}/">시외버스</a>
					</h1>
					<h2>터미널위치조회</h2>
				</header>
			</div>
			<form action="#">
				<label for="guSelect">구 선택</label> <select name="guSelect" id="gu">
					<option value="1">선택</option>
					<!-- <option value="2">북구</option> -->
					<option value="3" selected>광산구</option>
					<!-- <option value="4">동구</option>
            <option value="4">서구</option>
            <option value="4">남구</option> -->
				</select>
			</form>
			<form action="#">
				<label for="busStopSelect">터미널(정류장)</label> <select
					name="busStopSelect" id="busStop"
					onchange="selectOption(this.value);">
					<option value="1" selected>선택</option>
					<option value="광주송정역시외버스정류소">광주송정역시외버스정류소</option>
					<option value="송정리시외버스정류소">송정리버스정류소</option>
					<option value="우산동하남시외버스정류장">우산동(하남)시외버스정류장(승차)</option>
				</select>
			</form>
			<div id="map" style="width: 750px; height: 500px"></div>

		</div>
	</div>
</body>
</html>
