<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="/">홈으로</a>
<c:forEach var="member" items="${members }">
아이디 : ${member.id }<br/>
이름 : ${member.name }<br/>
이메일 : ${member.email }
<hr>
</c:forEach>
</body>
</html>