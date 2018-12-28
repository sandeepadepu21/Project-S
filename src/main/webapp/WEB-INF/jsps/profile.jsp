<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Profile</title>
</head>
<body>
	<p align="center">
		Welcome <b>${userName}</b>
	</p>
	</br>
	<form action="getAllUsers">
		<div style="text-align: center">
			<p align="center">Get All Record Here!</p>
			<input type="submit" value="Get All Details" />
		</div>
	</form>

</body>
</html>