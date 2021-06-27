<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> NEW ninja</h1>
<form:form action="/ninja/new/create" method="post" modelAttribute="ninja">

    <p>
        <form:label path="dojo">Dojo</form:label>
        <form:select path="dojo" >
				<c:forEach items="${dojo}" var="dojo">
					<form:option value="${dojo.id}">${dojo.name} </form:option>
				</c:forEach>
			</form:select>
			<form:errors path="dojo"/>
        
    </p>
     <p>
        <form:label path="firstName">First Name</form:label>
        <form:input path="firstName"/>
        <form:errors path="firstName"/>
        
    </p>
    <p>
        <form:label path="lastName">lastName</form:label>
        <form:input type="lastName" path="lastName"/>
        <form:errors path="lastName"/>
        
    </p>
        <p>
        <form:label path="age">Age</form:label>
        <form:input type="age" path="age"/>
        <form:errors path="age"/>
        
    </p>
      
      
    <input type="submit" value="Create"/>
</form:form>    
</body>
</html>