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
int QOH=Integer.parseInt(request.getParameter("QOH"));
int price=Integer.parseInt(request.getParameter("price"));

out.println("<h1> product id   "+productId +"</h1>");
out.println("<h1> product id   "+productName +"</h1>");
out.println("<h1> product id   "+QOH +"</h1>");
out.println("<h1> product id   "+price +"</h1>");

%>
<a href="DisplayServlet"></a>



</body>
</html>