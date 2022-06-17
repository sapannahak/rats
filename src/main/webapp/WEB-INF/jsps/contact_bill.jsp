<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@include file="create_link.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead | create</title>
</head>
<body>
<h2>lead | create</h2>
<div>
${exception }
</div>
	<form action="listContactBil" method="post">
		<pre>
		
			First Name<input type="text" name="firstName" value="${contacts.firstName }"/>
			Last Name<input type="text" name="lastName" value="${contacts.lastName }"/>
		    Email<input type="email" name="email" value="${contacts.email }"/>
		    Mobile<input type="number" name="mobile" value="${contacts.mobile }"/>
		    product<input type="text" name="product" />
		    amount<input type="text" name="amount" />
		    <input type="submit" value="save"/>
		</pre>
	</form>
</body>
</html>