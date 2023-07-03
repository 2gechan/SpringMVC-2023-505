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
<link rel="preconnect" href="https://fonts.googleapis.com" />
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
<link
	href="https://fonts.googleapis.com/css2?family=Dongle:wght@700&display=swap"
	rel="stylesheet" />
<link rel="stylesheet" type="text/css" href="${rootPath}/static/css/searchBus.css" />

<script src="${rootPath}/static/js/searchBus.js"></script>
<title>노선 조회</title>
</head>
<body class="slide-in">
	<section id="view">
		<section class="topview">
			<div class="toptitle">
				<a href="${rootPath}/">시외버스</a>
			</div>
			<div class="topbody">
				<form action="#">
					<select name="str_bus" id="select1">
						<option value="str_default" selected>출발지를 선택해주세요</option>
						<option value="str0001">광주종합버스터미널</option>
						<option value="str0002">광주송정역시외버스정류소</option>
						<option value="str0003">송정리</option>
						<option value="str0004">우산동(하남)시외버스정류장(승차)</option>
						<option value="str0005">김대중컨벤션센터</option>
						<option value="str0006">문화동시외버스정류소</option>
						<option value="str0007">광주남부시외버스정류소</option>
						<option value="str0008">대광여고</option>
						<option value="str0009">주월주택단지</option>
						<option value="str0010">진월동</option>
						<option value="str0011">소태역</option>
						<option value="str0012">소태터미널</option>
						<option value="str0013">학동시외버스정류소</option>
						<option value="str0014">광주농협용주지점</option>
					</select>
				</form>
				<div>노선 조회</div>
				<form action="#">
					<select name="end_bus" id="select2">
						<option value="end_default">도착지를 선택해주세요</option>
						<option value="end0001">전라북도 순창</option>
						<option value="end0002">서울</option>
						<option value="end0003">하와이</option>
						<option value="end0004">도쿄</option>
						<option value="end0005">시공의폭풍</option>
						<option value="end0006">우리집</option>
						<option value="end0007">아무데나</option>
					</select>
				</form>
			</div>
			<div class="toptail">
				<div class="image-container" id="image_container">
					<img src="./etc/busStop.png" class="stop-image-str"
						id="stop-image-str" alt="Stop Image" /> <img
						src="./etc/busimg.png" class="moving-image" id="moving-image"
						alt="Moving Image" /> <img src="./etc/busStop.png"
						class="stop-image-end" id="stop-image-end" alt="Stop Image" />
				</div>
			</div>
		</section>

		<section class="middleview" id="mainview">
			<section class="top">
				<section class="title">
					<span class="title_left">광주광역시 문화동</span> <span
						class="title_middle">→</span> <span class="title_right">전라북도
						순창</span>
				</section>
			</section>
			<section class="center">
				<section id="list">
					<div class="list_index" id="list_top">
						<span>출발 시간</span> <span>도착 시간</span> <span>버스 등급</span> <span>요
							금</span>
					</div>
					<div class="list_index">
						<span>07:20</span> <span>09:20</span> <span>일 반</span> <span>5400</span>
					</div>
					<div class="list_index">
						<span>08:20</span> <span>10:30</span> <span>일 반</span> <span>5400</span>
					</div>
					<div class="list_index">
						<span>13:30</span> <span>15:30</span> <span>고 급</span> <span>6400</span>
					</div>
					<div class="list_index">
						<span>15:30</span> <span>17:30</span> <span>일 반</span> <span>5400</span>
					</div>
					<div class="list_index">
						<span>16:20</span> <span>18:20</span> <span>고 급</span> <span>6400</span>
					</div>
					<div class="list_index">
						<span>17:00</span> <span>19:00</span> <span>일 반</span> <span>5400</span>
					</div>
				</section>
			</section>
		</section>
	</section>
</body>

</html>
