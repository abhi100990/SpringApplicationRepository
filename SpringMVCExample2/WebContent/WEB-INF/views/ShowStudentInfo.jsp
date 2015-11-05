<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Detail</title>
</head>
<body>

	<h3>Student details are as below:</h3>
	
	<p>Name: ${student.name}</p>
	<p>Mobile: ${student.mobile}</p>
	<p>Email: ${student.email}</p>
	<p>Area: ${student.address.area}</p>
	<p>City: ${student.address.city}</p>
	<p>State: ${student.address.state}</p>
</body>
</html>