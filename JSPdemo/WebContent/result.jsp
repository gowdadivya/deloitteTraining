<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="quote.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Your result is here!</title>
</head>
<body>
<h1>The result is : </h1>
<%=
session.getAttribute("total")
%>
<a href="result2.jsp">go to result 2</a>

<jsp:include page="quote2.jsp"></jsp:include>
</body>
</html>