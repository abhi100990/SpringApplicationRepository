<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Detail</title>
</head>
<body>

	<h3>Admin details are as below:</h3>
	
	<p>Name: ${admin.username}</p>
	<p>Area: ${admin.address.area}</p>
	<p>City: ${admin.address.city}</p>
	<p>State: ${admin.address.state}</p>
</body>
</html>