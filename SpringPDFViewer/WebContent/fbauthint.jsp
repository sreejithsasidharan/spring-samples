<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.javapapers.java.social.facebook.util.FacebookGraph%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

  String FB_APP_ID = "1091610297517508";
  String FB_APP_SECRET = "bfd976839b10f6e2617ae0d717538e72";
  String REDIRECT_URI = "http://secure.hotcoursesabroad.com:7001/SpringPDFViewer/fbauthreturn.jsp";

	// TODO Auto-generated method stub
	StringBuilder authURL = FacebookGraph.getAccessTokenURL(FB_APP_ID, FB_APP_SECRET, REDIRECT_URI);
	System.out.println( "authUrl 222" + authURL);
	
	
%>

<div
		style="margin: 0 auto; background-image: url(./img/fbloginbckgrnd.jpg); height: 360px; width: 610px;">
		<a href="<%=authURL%>"> <img
			style="margin-top: 138px;" src="./img/facebookloginbutton.png" />
		</a>
	</div>
	111111
</body>
</html>