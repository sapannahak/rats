<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	 <%@include file="create_link.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>compose | email</title>
</head>
<body>
	<form action="sendEmails" method="post">
		<pre>
		      
		      to <input type="text" name="to" value="${email }" />
		      subject <input type="text" name="sub" />
		      <textarea name="body" rows="20" cols="50">
              </textarea>
              <input type="submit" value="send email" />

		</pre>
	</form>
	${msg}


</body>
</html>