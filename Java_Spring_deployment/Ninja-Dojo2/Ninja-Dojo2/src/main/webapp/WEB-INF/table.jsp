<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2> Burbank Location Ninjas</h2>

<table>

		<thead>
			<tr>

				<th>First Name</th>
				<th> Last Name</th>
				<th>Age</th>
			
			</tr>

		</thead>
		
			<tbody>

			<c:forEach items="${ninjas}" var="ninja">
				<tr>
				
					<td><c:out value="${Ninja.firstName}" /></td>
					<td><c:out value="${Ninja.lastName}" /></td>
					<td><c:out value="${Ninja.age}" /></td>
					
				</tr>
			</c:forEach>

		</tbody>
</table>
</body>
</html>