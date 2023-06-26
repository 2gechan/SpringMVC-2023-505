<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ul>
		<li>ID : ${USER.username}</li>
		<li>이름 : ${USER.name}</li>
		<li>전화번호 : ${USER.tel}</li>
		<li>주소 : ${USER.addr}</li>
		<li>나이 : ${USER.age}</li>
	</ul>
</body>
</html>