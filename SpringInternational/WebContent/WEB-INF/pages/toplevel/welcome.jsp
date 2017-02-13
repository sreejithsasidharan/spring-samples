<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"  %>
<h1>Spring MVC internationalization example</h1>

Language : <a href="?language=en">English</a>|
<a href="?language=zh_CN">Chinese</a>

<h3>
	welcome.springmvc : <spring:message code="welcome.springmvc" text="" />
</h3>


Current Locale set : ${pageContext.response.locale}

