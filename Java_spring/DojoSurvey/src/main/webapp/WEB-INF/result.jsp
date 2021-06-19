<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>result</title>
</head>
<body>

<h3> Submitted INFO</h3>
Name : <c:out value = "${name }"/> <br><br>
Dojo Location : <c:out value = "${location}"/><br><br>
Fav Language:  <c:out value = "${language }"/><br><br>
Comment:  <c:out value = "${comment }"/>

</body>
</html>