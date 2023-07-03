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
<title>시외버스 - 즐겨찾기</title>
<link rel="stylesheet" href="${rootPath}/static/css/main.css" />
<link rel="stylesheet" href="${rootPath}/static/css/index.css" />
<link rel="stylesheet" href="${rootPath}/static/css/usuallyBus.css" />
<link rel="preconnect" href="https://fonts.googleapis.com" />
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
<link
	href="https://fonts.googleapis.com/css2?family=Dongle:wght@700&display=swap"
	rel="stylesheet" />
<script src="${rootPath}/static/js/usuallyBus.js"></script>
</head>
<body class="slide-in">
	<div id="all">
		<div id="middle">
			<div id="top-title">
				<header>
					<h1>
						<a href="${rootPath}/">시외버스</a>
					</h1>
					<h2>즐겨찾기</h2>
				</header>
			</div>
			<table>
				<tr>
					<!-- <th>No.</th> -->
					<th>출발지</th>
					<th>목적지</th>
					<th>선택</th>
				</tr>
				<tr class="table1">
					<!-- <td>1</td> -->
					<td>문화동 시외버스 정류장</td>
					<td>순창</td>
					<td><input type="checkbox" name="check"
						onclick="checkOnlyOne(this)" /></td>
				</tr>
				<tr class="table1">
					<!-- <td>2</td> -->
					<td>광주종합버스터미널(유스퀘어)</td>
					<td>서울</td>
					<td><input type="checkbox" name="check"
						onclick="checkOnlyOne(this)" /></td>
				</tr>
			</table>
			<div class="btnList">
				<button id="select_btn">삭제</button>
				<button id="select_btn">빠른 조회</button>
			</div>
		</div>
	</div>
</body>
</html>
