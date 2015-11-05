<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Teacher Registration</title>
</head>
<body>
	<h2>Teacher Registration Form</h2>
	<form action="teacher_detail" method="post">
		<table>
			<tr>
				<td>Name: </td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Mobile: </td>
				<td><input type="text" name="mobile"></td>
			</tr>
			<tr>
				<td>Area:</td>
				<td><input type="text" name="area"></td>
			</tr>
			<tr>
				<td>City:</td>
				<td><input type="text" name="city"></td>
			</tr>
			<tr>
				<td>State:</td>
				<td><input type="text" name="state"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit"></td>
			</tr>
		</table>
	</form>
</body>
</html>