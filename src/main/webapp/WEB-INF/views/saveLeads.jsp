<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>save leads</title>
</head>
<body >
<div align="center">
<h2>enter lead details...</h2>
<form action="save" method="post">
<pre>

First Name<input type="text" name="firstName"/>
Last Name <input type="text" name="lastName"/>
Company<input type="text" name="company"/>
Email<input type="text" name="email"/>
Mobile<input type="text" name="mobile"/>
LeadSource
radio<input type="radio" name="leadSource" value="radio"/>
tv<input type="radio" name="leadSource" value="tv"/>
news paper<input type="radio" name="leadSource" value="news paper"/>
online<input type="radio" name="leadSource" value="online"/>
<input type="submit" value="save"/>
</pre>
</form></br>

${msg }
</div>
</body>
</html>