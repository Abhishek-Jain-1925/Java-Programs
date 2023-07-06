<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@page isErrorPage="true" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error Handle Page</title>
</head>
<body>

	<h1 style="background:red;color:yellow">SomeThing Went Wrong.....!</h1>
	<h1 style="background:red;color:yellow"><%= exception %></h1>
	
	
</body>
</html>