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
	<br>
	<form action="write" method="post">
		<table width="400" cellpadding="0" cellspacing="0" border="1">
			<tr>
				<td>�ۼ���</td>
				<td><input type="text" name="writer" /></td>
			</tr>
			<tr>
				<td>����</td>
				<td><input type="text" name="title" /></td>
			</tr>
			<tr>
				<td>����</td>
				<td><input type="text" name="content" /></td>
			</tr>


		</table>
		<input type="submit" value="�Է�"/>
		<a href="/list">���</a>
	</form>
</body>
</html>