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
		String name = request.getParameter("username");
		session.setAttribute("name", name);
	%>
<form action="Question1.jsp">
Read the following instructions</br>
1.The question paper has 3 questions
2.Each question has 4 options
3.Only one option is correct
4.You will be awarded 10 marks for every correct answer
</form>
</body>
</html>