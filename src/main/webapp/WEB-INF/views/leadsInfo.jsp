<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>lead info</title>
</head>
<body>
<div align="center">
<h2>lead info.....</h2>

Id: ${lead.id }</br>
First Name:${lead.firstName }</br>
Last Name :${lead.lastName }</br>
Company: ${lead.company }</br>
Email: ${lead.email }</br>
Mobile: ${lead.mobile }</br>
LeadSource: ${lead.leadSource }</br>

<form action="compose" method="post">
<pre>

<input type="hidden" name="firstName" value="${lead.firstName }"/>
 <input type="hidden" name="lastName" value="${lead.lastName }"/>
<input type="hidden" name="company" value="${lead.company }"/>
<input type="hidden" name="email" value="${lead.email }"/>
<input type="hidden" name="mobile" value="${lead.mobile }"/>
<input type="hidden" name="leadSource" value="${lead.leadSource }"/>

<input type="submit" value="send Email"/>

</pre>

</form>
</div>
</body>
</html>