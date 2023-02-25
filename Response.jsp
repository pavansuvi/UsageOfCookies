<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="green">

	<%!List<Integer> list = new ArrayList<>();%>
	<%
	Cookie[] cookies = request.getCookies();

	String name = "pavan";
	String email = "pavan@gmail.com";
	String dob = "24-08-2000";
	String ph = "7674876727";
	session.setMaxInactiveInterval(45);

	for (Cookie cc : cookies) {
		if (cc.getName().equals("name")) {
			name = cc.getValue();
		} else if (cc.getName().equals("email")) {
			email = cc.getValue();
		} else if (cc.getName().equals("dob")) {
			dob = cc.getValue();
		} else if (cc.getName().equals("ph")) {
			ph = cc.getValue();
		}
	}
	%>

	<%=name%>
	<%=email%>
	<%=dob%>
	<%=ph%>
	this is jsp file
</body>
</html>