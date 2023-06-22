<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- html에서 제공하지 않는 기능들을 가져온다 c:문법 방식으로 사용한다 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
ul {
	display: flex;
	list-style: none;
}

li {
	padding: 5px;
}
</style>
</head>
<body>
	<h1>나의 친구들</h1>
	
	<!-- items는 리스트 var는 dto가 들어간다 -->
	<c:forEach items="${ADDRS}" var="ADDR">
		<ul>
			<li>이름 : ${ADDR.name}</li>
			<li>나이 : ${ADDR.age}</li>
			<li>전화번호 : ${ADDR.tel}</li>
			<li>주소 : ${ADDR.address}</li>
		</ul>
	</c:forEach>

</body>
</html>