<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@include file="create_link.jsp" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>get all</title>
</head>
<body>
        <table border="1">
        <tr>
        <th>FirstName</th>
        <th>LastName</th>
        <th>LeadSource</th>
        <th>Email</th>
        <th>Mobile</th>
        <th>Billing</th>
        </tr>
        
        <c:forEach items="${contacts }" var="contact">
                    <tr>
		                    <td><a href="contactInfo?id=${contact.id}">${contact.firstName}</a></td>
		                    <td>${contact.lastName}</td>
		                    <td>${contact.leadSource}</td>
		                    <td>${contact.email}</td>
		                    <td>${contact.mobile}</td>
		                    <td><a href="contactBill?id=${contact.id}">bill</a></td>
                    </tr>
        </c:forEach>
        </table>
        

</body>
</html>