<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
Fill the Employee Details

 <form:form action = "regDone" method="post" modelAttribute="employee">
  <table>  
			 
			<tr>
				<td>Firstname</td>
				<td><form:input path="fname"/></td>
			</tr>
			
			<tr>
				<td>Lastname</td>
				<td><form:input path="lname"/></td>
            </tr>
            <tr>
				<td>Job Role</td>
				<td><form:input path="role"/></td>
            </tr>
            <tr>
				<td>Salary</td>
				<td><form:input path="sal"/></td>
            </tr>


			<tr>
				<td><input type="submit" value="Register"></td>
			</tr>
    </table>
  </form:form>
</center>
</body>
</html>