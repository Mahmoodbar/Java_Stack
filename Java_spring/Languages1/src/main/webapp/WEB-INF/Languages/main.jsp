<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Main</title>
</head>
<body>

	<table>

		<thead>
			<tr>

				<th>Name</th>
				<th>Creator</th>
				<th>Version</th>
				<th>Action</th>
			</tr>

		</thead>

		<tbody>

			<c:forEach items="${languages}" var="language">
				<tr>
					<td><a href="/languages/${language.id}"><c:out value="${language.name}" /></a></td>
					<td><c:out value="${language.creator}" /></td>
					<td><c:out value="${language.version}" /></td>
					
					<td><form:form action="/languages/${language.id}/delete" method="post">
							<input type="hidden" name="_method" value="delete">
							 <input
								type="submit" value="Delete">
								</form:form></td>
								
								<td><form:form action="/languages/${language.id}/edit" method="post">
							<input type="hidden" name="_method" value="edit"> <input
								type="submit" value="edit">
						</form:form></td>
					
				</tr>
			</c:forEach>

		</tbody>

	</table>
	<h1>New Language</h1>
	<form:form action="/test/languages" method="POST"
		modelAttribute="language">
		<p>
			<form:label path="name">Name</form:label>
			<form:errors path="name" />
			<form:input path="name" />
		</p>
		<p>
			<form:label path="creator">Creator</form:label>
			<form:errors path="creator" />
			<form:textarea path="creator" />
		</p>
		<p>
			<form:label path="version">Version</form:label>
			<form:errors path="version" />
			<form:input path="version" />
		</p>
		<input type="submit" value="Submit" />
	</form:form>

</body>
</html>