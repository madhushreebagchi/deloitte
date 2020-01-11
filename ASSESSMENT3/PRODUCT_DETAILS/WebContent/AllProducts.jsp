<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ page import="java.util.*" %>
  <%@ page import="com.model.Product" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
List<Product> list=(List<Product>)session.getAttribute("allProducts");

for(Product p:list){
	
	out.println(p);
}


%>

</body>
</html>