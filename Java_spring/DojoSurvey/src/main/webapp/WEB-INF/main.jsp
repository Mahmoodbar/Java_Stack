<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>main</title>
</head>
<body>
<form method="post" action="/proccess"> 

Your Name: <input type="text" name="name" placeholder="Insert Your Name">
<br><br>
Dojo Location: <select name="location">
<option value= "Jerusalem">Jerusalem </option>
<option value= "Ramallah">Ramallah </option> 
<option value= "YAFA">YAFA </option>
<option value= "Haifa">Haifa </option>
</select>	<br> <br>
Favorite Language: <select name="language">
<option value="Python" >Python</option>
<option value= "JAVA"> JAVA</option>
<option value= "MERN">MERN </option>
</select><br> <br>	

Comment: <input type="text" placeholder="Optional" name="comment"> <br><br>

<button > Submit</button>
</form>
</body>
</html>