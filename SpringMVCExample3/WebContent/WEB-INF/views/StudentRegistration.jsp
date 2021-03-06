<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="f"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Registration</title>
</head>
<body>
	<h2>Student Registration Form</h2>
	
	<f:errors path="student.*"></f:errors>
	
	<form action="student_detail" method="post">
		<table>
			<tr>
				<td>Name: </td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td></td>
				<td><f:errors path="student.name"></f:errors> </td>
			</tr>
			<tr>
				<td>Mobile: </td>
				<td><input type="text" name="mobile"></td>
			</tr>
			<tr>
				<td>Email: </td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td>Area:</td>
				<td><input type="text" name="address.area"></td>
			</tr>
			<tr>
				<td>City:</td>
				<td><input type="text" name="address.city"></td>
			</tr>
			<tr>
				<td>State:</td>
				<td><input type="text" name="address.state"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit"></td>
			</tr>
		</table>
	</form>
</body>
</html>