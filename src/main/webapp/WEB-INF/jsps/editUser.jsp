<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit User</title>
</head>
<body>
	<form action="updateUser" method="POST">
		<table width="30%" align="center">
			<tr>
				<td colspan=2><center>
						<font size=4><b><u>Update Details</u> </b></font>
					</center></td>
			</tr>

			<tr>
				<td>Full Name:</td>
				<td><input type="text" name="name" value="${usrList.name}"></td>
			</tr>
			<tr>
				<td>Username:</td>
				<td><input type="text" name="email" value="${usrList.email}"
					readonly="readonly"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="Password" name="password"
					value="${usrList.password}"></td>
			</tr>
			<tr>
				<td>Mobile Number:</td>
				<td><input type="text" name="mobile" value="${usrList.mobile}"></td>
			</tr>
			<tr>
				<td align="right"><input type="submit" value="update"></td>
			</tr>
		</table>
</body>
</html>