<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="create_link.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead | Info	</title>
</head>
<body>
<pre>
Id:${lead.id }
First Name:${lead.firstName }
Last Name:${lead.lastName }
Lead Source:${lead.leadSource }
Email:${lead.email }
Mobile:${lead.mobile }
</pre>
<form action="composeEmail" method="post">
<input type="hidden" name="email" value="${lead.email }">
<input type="submit" value="send email"/>
</form>

<form action="contactpage" method="post">
<input type="hidden" name="id" value="${lead.id }">
<input type="submit" value="convert"/>
</form>
</body>
</html>