<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><fmt:message key="title" /></title>
</head>
<body>
	Message:
	<h3>${msg}</h3>
	Now:
	<c:out value=" ${now} " />
	<p />
	<c:forEach items="${products} }" var="prods">
		<c:out value="prods.description" />
		<i><c:out value="prods.price" /></i>
	</c:forEach>
</body>
</html>