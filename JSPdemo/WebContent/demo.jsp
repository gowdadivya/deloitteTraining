<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Demo</title>
</head>
<body>
<% for(int i =0;i<3;i++){
%>
<h2>Divya</h2>
<%} %>
<% out.println("You used out.println"); %>
<%
int marks = 90;
if(marks>90)
{
	out.println(" marks>90");
} else {
	out.println(" marks<90");
}
%>

</body>
</html>