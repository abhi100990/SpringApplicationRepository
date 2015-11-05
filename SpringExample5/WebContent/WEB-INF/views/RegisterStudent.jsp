<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h3>This is Student Registration Form</h3>

	<form action="storeStudentInfo" method="post">
		<table>
			<tr>
				<td>Name: </td>
				<td><input type="text" name="name" value=""></td>
			</tr>
			
			<tr>
				<td>Address: </td>
				<td><input type="text" name="address" value=""></td>
			</tr>
			
			<tr>
				<td>City: </td>
				<td><input type="text" name="city" value=""></td>
			</tr>
			
			<tr>
				<td>State: </td>
				<td><input type="text" name="state" value=""></td>
			</tr>
			
			<tr>
				<td></td>
				<td><button type="submit" value="Submit">Submit</button></td>
			</tr>
		</table>
	</form>
</body>
</html>