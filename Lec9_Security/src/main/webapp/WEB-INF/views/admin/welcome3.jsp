<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome</title>
</head>
<body>



<%-- <c:if test="${not empty pageContext.request.userPrincipal }">
<p> Login</p>
</c:if> --%>

<sec:authorize access="isAuthenticated()">
<p> login</p>
</sec:authorize>

welcome - admin <br/>


 <%-- USER ID : ${pageContext.request.userPrincipal.name}<br/> --%>
 user id : <sec:authentication property="name"/>
<a href="/logout">Log Out</a> <br /> 

</body>
</html>