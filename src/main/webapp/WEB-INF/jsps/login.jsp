<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://unpkg.com/material-components-web@latest/dist/material-components-web.min.css">
<meta charset="ISO-8859-1">
<title>Login </title>
</head>
<body>
<center><font color="red" >${message} </font></center>
<form  action="${pageContext.request.contextPath}/login" method="post">
<table width="10%" align="center">
<tr>
<td colspan=2><center><font size=4><b><u>Login </u></b></font></center></td>
</tr>

<tr>
<td>Username:</td>
<td><input type="text"  placeholder="enter email id" name="email" value="${user.email}"></td>
</tr>

<tr>
<td>Password:</td>
<td><input type="Password" placeholder="enter password" name="pwd" value="${user.password}"></td>
</tr>
<tr>
<td></td><td>
<input type="submit" value="Login"></td>
</tr>
<tr>
</tr>
</table>
</form>
</body>
</html>