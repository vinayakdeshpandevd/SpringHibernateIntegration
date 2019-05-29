<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
Update the Employee Details

 <form:form action = "updateEmployee" method="post" modelAttribute="employee">
  <table>  
			 <input type = "hidden" name = "id" value = "${employee.id}"/>
			<tr>
				<td>Firstname</td>
				<td><form:input path="fname" value="${employee.fname}"/></td>
			</tr>
			
			<tr>
				<td>Lastname</td>
				<td><form:input path="lname" value="${employee.lname}"/></td>
            </tr>
            <tr>
				<td>Job Role</td>
				<td><form:input path="role" value="${employee.role}"/></td>
            </tr>
            <tr>
				<td>Salary</td>
				<td><form:input path="sal" value="${employee.sal}"/></td>
            </tr>


			<tr>
				<td><input type="submit" value="Update"></td>
			</tr>
    </table>
  </form:form>
</center>
</body>
</html>