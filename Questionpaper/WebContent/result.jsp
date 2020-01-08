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
		String username = (String) session.getAttribute("username");
		String answer1 = (String) session.getAttribute("answer1");
		String answer2 = (String) session.getAttribute("answer2");
        String answer3 = (String) session.getAttribute("answer3");
		int sum=0;
	%>

	<%= username + " , below is your scores " %>
	<table border="1">
		<th>Your Answer</th>
		<th>Correct Answer</th>
		<th>Marks</th>
		<tr>
			<td><%= answer1 %></td>
			<td>B</td>
			<td>
			<% 
				if(answer1.equals("B")) 
				{
					sum += 10;
					out.println("10");
				}
				else
				{
					out.println("0");
				}
				%>
			</td>
		</tr>
		<tr>
			<td><%= answer2 %></td>
			<td>A</td>
			<td>
			<% 
				if(answer2.equals("A")) 
				{
					sum += 10;
					out.println("10");
				}
				else
				{
					out.println("0");
				}
				%>
			</td>
		</tr>
<tr>
			<td><%= answer3 %></td>
			<td>C</td>
			<td>
			<% 
				if(answer3.equals("C")) 
				{
					sum += 10;
					out.println("10");
				}
				else
				{
					out.println("0");
				}
				%>
			</td>
		</tr>
	</table>
	
	<h1>Total marks obtained is : <%= sum %></h1>
</body>
</html>
