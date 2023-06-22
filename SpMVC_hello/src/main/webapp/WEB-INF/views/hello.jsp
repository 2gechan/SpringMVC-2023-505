<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello</h1>
	<div>
		<strong>이름 : <span>${ADDR.name}</span></strong>
	</div>
	<div>
		<strong>나이 : <span>${ADDR.age}</span></strong>
	</div>
	<div>
		<strong>전화번호 : <span>${ADDR.tel}</span></strong>
	</div>

	<div>
		<strong>주소 : <span>${ADDR.address}</span></strong>
	</div>
</body>
</html>