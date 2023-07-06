<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<%@page errorPage="Error_Handal_Page.jsp" %>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error And Exception Handle In JSP</title>
</head>
<body>
	
	<h1>Error Page</h1>
	
	<%! 
	
		int a = 20;
		int b = 0;
		
		public int division()
		{
			return a/b;
		}
	
	
	%>
	
	<h1> Division is : <%= division() %></h1>
		
</body>
</html>