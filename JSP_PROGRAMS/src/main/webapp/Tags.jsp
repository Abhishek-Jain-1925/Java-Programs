<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP TAGS</title>
</head>
<body>

	<div>
		<h1>Declaration Tag</h1><br>
		
		<%!
			int a=10;	
			int b=20;
			
			public int dosum()
			{
				return a+b;
			}

		%>
		
		
		<h1> Scriplet Tag</h1><br>
		<%
		
			out.println(a);
			out.println(b);
			
			out.println(dosum());
		
		%>
		
		
		<h1>Expression Tag</h1>
		<h2>Sum Is : <%= dosum() %></h2>
		
	</div>

</body>
</html>