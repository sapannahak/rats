<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@include file="create_link.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>contact | Info	</title>
</head>
<body>
<pre>
First Name:${contact.firstName }
Last Name:${contact.lastName }
Lead Source:${contact.leadSource }
Email:${contact.email }
Mobile:${contact.mobile }
</pre>
<form action="composeEmail" method="post">
<input type="hidden" name="email" value="${contact.email }">
<input type="submit" value="send email"/>
</form>

</body>
</html>