<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Log In Page</h2>
<form action="validate.jsp">
Username : <input type="text" name="username"><br/>
Password : <input type="text" name="password"><br/>
<input type="submit" value="Login">
<% 
String errorMessage = (String)session.getAttribute("errorMessage");
%>
<%
if(errorMessage==null)
	errorMessage="";
	
%>


<font color="red"><%= errorMessage %></font>
</form>

</body>
</html>