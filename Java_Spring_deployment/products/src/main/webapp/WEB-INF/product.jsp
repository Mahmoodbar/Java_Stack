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
		<form:form action="/product" method="post" modelAttribute="product">
		
		<p>
		 <p>
        <form:label path="name">name</form:label>
        <form:input path="name"/>
        <form:errors path="name"/>
        
    </p>
    <p>
        <form:label path="description">description</form:label>
        <form:input type="description" path="description"/>
        <form:errors path="description"/>
        
    </p>
        <p>
        <form:label path="price">price</form:label>
        <form:input type="price" path="price"/>
        <form:errors path="price"/>
        
    </p>
      	<input type="submit" value="create"/>
		</form:form>
		 </p>
</body>
</html>