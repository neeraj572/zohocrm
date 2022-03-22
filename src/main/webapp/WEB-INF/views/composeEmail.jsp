<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="send" method="post">
<pre>
Id<input type="text" name="id" value="${leads.id }"readOnly/>
First Name<input type="text" name="firstName" value="${leads.firstName }"/>
Last Name <input type="text" name="lastName" value="${leads.lastName }"/>
Company<input type="text" name="company" value="${leads.company }"/>
Email<input type="text" name="email" value="${leads.email }"/>
Mobile<input type="text" name="mobile" value="${leads.mobile }"/>
LeadSource<input type="text" name="leadSource" value="${leads.leadSource }"/>
<input type="submit" value="send email"/>
</pre>
</form>
${msg }
</body>
</html>