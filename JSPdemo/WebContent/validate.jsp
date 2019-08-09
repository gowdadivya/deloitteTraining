<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String username = request.getParameter("username");
String password = request.getParameter("password");
if(username.equals("Divya")&&(password.equals("Divya")))
{
	%>
	<jsp:forward page="loginSuccess.jsp"></jsp:forward>
	<% 
} 
else 
{
	session.setAttribute("errorMessage","incorrect username or password");
	response.sendRedirect("loginIndex.jsp");
}%>

</body>
</html>