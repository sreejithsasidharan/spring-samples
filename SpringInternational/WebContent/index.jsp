<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index JSP</title>
</head>
<body>
<h1> Spring sample with JSTL and Internationalisation</h1>
<p>Sample Spring application with applicationContext.xml, the configuration in web.xml made this file mandatory</p>
<p> Used WebApplicationInitializer</p>
<br/>
<a href="home.html"> Home</a>
<br/>
<br/>
<a href="welcome.html"> Home</a>
<c:set var="currency" value="USD" scope="page" /> Currency: <c:out value="${currency}"/>
<br/>
https://github.com/balabanmario/ear-with-spring-shared-context

</body>
</html>