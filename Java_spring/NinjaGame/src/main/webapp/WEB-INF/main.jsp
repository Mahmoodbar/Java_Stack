<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Your Gold : <c:out value="${gold}" /> <br><br><br>
<div style="display: flex; margin-left: 10px"> 

<div value="farm" style="width: 200px;height: 200px; border: 1px solid black; margin-left: 10px" >
<form method="post" action="/farmProcess">
<center> 
Farm <br><br>
(Earns 10-20 gold)<br>

<input type="hidden" name="place" value="farm">
<button> Find Gold </button>
</form>
</center>
</div> 
 
 <div value="cave" style="width: 200px;height: 200px; border: 1px solid black;margin-left: 10px" >
<form method="post" action="/farmProcess">
<center> 
cave <br><br>
(Earns 5-10 gold)<br>

<input type="hidden" name="place" value="cave">
<button> Find Gold </button>
</form>
</center>
</div>

<div value="House" style="width: 200px;height: 200px; border: 1px solid black;margin-left: 10px" >
<form method="post" action="/farmProcess">
<center> 
House <br><br>
(Earns 2-5 gold)<br>

<input type="hidden" name="place" value="House">
<button> Find Gold </button>
</form>
</center>
</div>

<div value="Casino" style="width: 200px;height: 200px; border: 1px solid black;margin-left: 10px" >
<form method="post" action="/farmProcess">
<center> 
casino <br><br>
(Earns -50 - 50  gold)<br>

<input type="hidden" name="place" value="casino">
<button> Find Gold </button>
</form>
</center>
</div>
</div>
<br>

<div class="activity">
 Activities: <c:out value ="${activity}" />
 


</div>

</body>
</html>