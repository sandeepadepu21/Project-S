<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<center>
		<font color="red">${err_msg} </font>
	</center>
	<form
		action="${pageContext.request.contextPath}/<core:url value='j_spring_security_check'/>"
		method="post">
		<table width="10%" align="center">
			<tr>
				<td colspan=2><center>
						<font size=4><b><u>Login </u></b></font>
					</center></td>
			</tr>

			<tr>
				<td>Username:</td>
				<td><input type="text" placeholder="enter email id"
					name="email" value="${u.email}" required="required"></td>
			</tr>

			<tr>
				<td>Password:</td>
				<td><input type="Password" placeholder="enter password"
					name="pwd" value="${u.password}" required="required"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Login"></td>
			</tr>
			<tr>
			</tr>
		</table>
	</form>
</body>
</html>