<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" 	href="/webjars/bootstrap/5.3.2/css/bootstrap.min.css">
</head>
<body>
<div class="container">1</div>
	count : ${count }
	<br />
	<table width="400" cellpadding="0" cellspacing="0" border="1">
		<tr>
			<td>번호</td>
			<td>작성자</td>
			<td>제목</td>
			<td>삭제</td>
		</tr>

		<c:forEach var="dto" items="${list }">
			<tr>
				<td>${dto.id }</td>
				<td>${dto.writer }</td>
				<td><a href="/view?id=${dto.id}">${dto.title }</a></td>
				<td><a href="/delete?id=${dto.id}">삭제</a></td>
			</tr>
		</c:forEach>

	</table>
	<p><a href="/writeForm">글작성</a></p>
	<script src="/webjars/bootstrap/5.3.2/js/bootstrap.bundle.min.js"></script>
</body>
</html>