<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Access Denied!</title>

</head>
<body>
	<div align="center">
	<font color="red">
		<h2>Access Denied</h2>
		<p>${err_msg}</p>
	</font>
	</br>
	<a href="${pageContext.request.contextPath}/goBack">Back</a>
	</div>
</body>
</html>