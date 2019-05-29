<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<center>
<h1>TT Employees</h1>  
<form action = "updateDelete" method = "get">
<table border="5" cellpadding= '8' >  
<tr>
<th>Select</th>
<th>Id</th>
<th>First name</th>
<th>Last name</th>
<th>Job Role</th>
<th>Salary</th>
</tr>  
   <c:forEach var="emp" items="${list}">   
   <tr> 
    
   
   <td><input type = "radio" name = "key" value = "${emp.id}" ></td>
   <td>${emp.id}</td>  
   <td>${emp.fname}</td>  
   <td>${emp.lname}</td>  
   <td>${emp.role}</td>  
   <td>${emp.sal}</td>
   
   </tr>  
   </c:forEach>  
   </table>
   <br>
   <br>
      <input type = "submit" name = "action" value = "update"> 
      <input type = "submit" name = "action" value = "delete">  
   <br/>  
    
   <a href="regEmployee">Add more Employees</a> 
   
   </center>
</body>
</html>