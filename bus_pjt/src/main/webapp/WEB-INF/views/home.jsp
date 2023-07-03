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
<title>시외버스</title>

<link rel="stylesheet" href="${rootPath}/static/css/main.css?${version}" />
<link rel="stylesheet" href="${rootPath}/static/css/index.css?${version}" />

<link rel="preconnect" href="https://fonts.googleapis.com" />
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />

<link
	href="https://fonts.googleapis.com/css2?family=Dongle:wght@700&display=swap"
	rel="stylesheet" />
<script src="${rootPath}/static/js/index.js" defer></script>
</head>
<body class="slide-in">
	<div id="all">
		<div class="container">
			<div class="circle red" color="red"></div>
			<div class="circle" color="yellow"></div>
			<div class="circle" color="green"></div>
		</div>
		<div id="full">
			<div id="top">
				<div id="title_top">
					<h1>시외버스</h1>
					<h1>
						<a href="${rootPath}/login">로그인</a>
					</h1>
					<h1>
						<a href="${rootPath}/join">회원가입</a>
					</h1>
				</div>
				<section>
					<article>
						<div class="select" onclick="location.href='${rootPath}/searchBus';">
							<img src="etc/Korea Map Transparent.PNG" width="125px"
								height="175px" />
						</div>
						<a href="${rootPath}/searchBus">노선 조회 </a>
					</article>
					<article>
						<div class="select" onclick="location.href='${rootPath}/terminalPosition';">
							<img src="etc/터미널위치.png" width="125px" height="175px" />
						</div>
						<a href="${rootPath}/terminalPosition"> 터미널 위치 조회 </a>
					</article>
					<article>
						<div class="select" onclick="location.href='${rootPath}/usuallyBus';">
							<img src="etc/즐겨찾기.png" width="125px" height="175px" />
						</div>
						<a href="${rootPath}/usuallyBus">즐겨찾기 </a>
					</article>
					<article>
						<div class="select"
							onclick="location.href='https://www.usquare.co.kr/kor/usquare/reservation.do?mode=reservationList&srCategoryId1=9';">
							<img src="etc/bus.png" width="125px" height="175px" />
						</div>
						<a
							href="https://www.usquare.co.kr/kor/usquare/reservation.do?mode=reservationList&srCategoryId1=9">예매
							사이트 이동</a>
					</article>
				</section>
			</div>
			<div class="line"></div>
			<div class="line"></div>
			<div id="light"></div>
		</div>
		<div id="bottom">
			<div id="front"></div>
			<div id="back"></div>
		</div>
	</div>
</body>
</html>
