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
<br><a href="viewCreateLead">new Lead</a><br>
<body>
        <table>
        <tr>
        <th>FirstName</th>
        <th>LastName</th>
        <th>LeadSource</th>
        <th>Email</th>
        <th>Mobile</th>
        </tr>
        
        <c:forEach items="${leads}" var="lead">
                    <tr>
		                    <td><a href="leadInfo?id=${lead.id}">${lead.firstName}</a></td>
		                    <td>${lead.lastName}</td>
		                    <td>${lead.leadSource}</td>
		                    <td>${lead.email}</td>
		                    <td>${lead.mobile}</td>
                    </tr>
        </c:forEach>
        </table>
        

</body>
</html>