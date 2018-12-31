<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Login Page</title>
</head>
<script type="text/javascript">
	function goToLogin() {
		document.forms[0].action = "loginUser";
		document.forms[0].method = "post";
		document.forms[0].submit();
	}
</script>
<body>
	<form action="${pageContext.request.contextPath}/register" method="POST">
		<table width="30%" align="center">
			<
			<p align="center">
				<font color="red">${message}</font>
			</p>
			<tr>
				<td colspan=2><center>
						<font size=4><b><u>Registration</u> </b></font>
					</center></td>
			</tr>

			<tr>
				<td>Full Name:</td>
				<td><input type="text" name="name" value="${user.name}"
					required="required"></td>
			</tr>
			<tr>
				<td>Username:</td>
				<td><input type="text" name="email" value="${user.email}"
					required="required"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="Password" name="password"
					value="${emp.password}" required="required"></td>
			</tr>
			<tr>
				<td>Mobile Number:</td>
				<td><input type="text" name="mobile" pattern="[0-9]{10}"
					title="mobile number should contain ten digits"
					value="${emp.mobile}" required="required"></td>
			</tr>
		</table>
		<div align="center">
			</br> <input type="submit" value="Register"></br> </br> Already Registered?
			Click here to <input type="button" onclick="goToLogin()"
				value="Login" />
		</div>
	</form>
</body>
</html>