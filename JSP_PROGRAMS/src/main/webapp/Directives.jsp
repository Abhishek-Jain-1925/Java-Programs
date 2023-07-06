<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="java.util.*" %>  
<%@taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP DIRECTIVE</title>
</head>
<body>

<h1>Page Directive</h1>
	<h1>Today Is: - 
	<%!
		Date date= new Date();
	%>
	<%
		out.print(date.toString());
	%>
	</h1>
	
	<h1>Include Directive</h1>
	<%@include file="header.jsp"%>
	
	Today Is<%= date %>


	<h1>Taglib Directive</h1>
	
	<a:set var="name" value="Aavej"></a:set>
	<a:out value="${name}"></a:out>
	

</body>
</html>
	   
	   