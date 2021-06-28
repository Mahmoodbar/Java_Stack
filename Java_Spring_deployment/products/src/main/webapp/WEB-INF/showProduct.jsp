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
<h1> ${product.name}</h1>
<c:forEach items= " ${product.categories }">
<li> ${product.name} </li>
</c:forEach>




<h1> Add Category</h1>
<form method ="post" action="/addCategory/${product.id}">

<select name="category" >
<c:forEach items="${unlisted}" var ="cate" >
<option value="${cate.id }"> ${cate.name } </option>
</c:forEach> 
</select>
<input type="submit" value="add">



</form>

</body>
</html>