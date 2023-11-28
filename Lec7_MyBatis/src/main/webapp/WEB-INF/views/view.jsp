<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
내용보기<br>
<hr>
작성자 : ${dto.writer }<br>
제목 : ${dto.title }<br>
내용 : ${dto.content }<br>

<hr>
<a href="/list">목록</a>
</body>
</html>