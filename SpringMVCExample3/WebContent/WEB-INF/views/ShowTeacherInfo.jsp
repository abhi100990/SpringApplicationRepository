<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Teacher Detail</title>
</head>
<body>

	<h3>Teacher details are as below:</h3>
	
	<p>Name: ${teacher.name}</p>
	<p>Mobile: ${teacher.mobile}</p>
	<p>Area: ${teacher.address.area}</p>
	<p>City: ${teacher.address.city}</p>
	<p>State: ${teacher.address.state}</p>
</body>
</html>