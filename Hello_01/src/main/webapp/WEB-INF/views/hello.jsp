<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>안녕!!</h1>
<!-- HomeConroller의 dispatcher method를 통해 랜더링한 후
request.setAttribute에서 세팅한 값을 얻어온다 -->
<h2> <%= request.getAttribute("name") %>님 안녕하세요</h2>
</body>
</html>