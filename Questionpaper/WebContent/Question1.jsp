<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%="Welcome "+session.getAttribute("username") %>
Question1: What is the capital of India?</br>
<form action="ans1">
<input type="radio" name="answer1" value="A">A.Mumbai</br>
<input type="radio" name="answer1" value="B">B.Delhi</br>
<input type="radio" name="answer1" value="C">C.Kolkata</br>
<input type="radio" name="answer1" value="D">D.Pune</br>
<input type="submit" value="Next">
</form>
</body>
</html>