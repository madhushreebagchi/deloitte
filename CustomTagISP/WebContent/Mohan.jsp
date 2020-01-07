<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="WEB-INF/tlds/mycust.tld" prefix="p"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:forEach begin="1" end="5" step="1">
<h1>Madhu</h1>
</c:forEach>
<%
for(int i=1;i<=5;i++)
{
	%>
	<h1>Madhushree Bagchi</h1>
<% 	
}
%>
<p:deladd></p:deladd>
<p:myform></p:myform>
</body>
</html>