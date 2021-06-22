<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h1>Edit Language</h1>

<form:form action="/languages/${language.id}/delete" method="post" >
							<input type="hidden" name="_method" value="delete">
							 <input
								type="submit" value="Delete">
								</form:form>
<a href="/languages">Dashboard</a>
								
<form:form action="/languages/${language.id}/new" method="post" modelAttribute="language">
    <input type="hidden" name="_method" value="put">
    
    
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
    <input type="submit" value="Submit"/>
</form:form>
</body>
</html>