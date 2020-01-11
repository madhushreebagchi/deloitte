<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%
int productId=Integer.parseInt(request.getParameter("productId"));
String productName=request.getParameter("productName");
int quantity=Integer.parseInt(request.getParameter("quantity"));
int price=Integer.parseInt(request.getParameter("price"));

out.println("<h1> product id   "+productId +"</h1>");
out.println("<h1> product name   "+productName +"</h1>");
out.println("<h1> quantity   " + quantity +"</h1>");
out.println("<h1> price   "+price +"</h1>");

%>
<a href="DisplayServlet"></a>