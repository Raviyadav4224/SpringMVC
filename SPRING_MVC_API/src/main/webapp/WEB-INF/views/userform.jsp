<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP FILE</title>
</head>
<body>
	Data added successfully

	<%
String id = request.getParameter("id");
String name = request.getParameter("name");
String age = request.getParameter("age");
String city = request.getParameter("city");

out.println(id + name + age + city);
%>

	<h1><%=id%></h1>
	<h1><%=name%></h1>
	<h1><%=age%></h1>
	<h1><%=city%></h1>
	Heyyyyyyy
</body>
</html>