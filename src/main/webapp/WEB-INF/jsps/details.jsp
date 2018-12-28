<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User's List</title>
</head>
<script type="text/javascript">
	function deleteUser(mail) {
		var r = confirm("Are you sure to delete " + mail + "?");
		if (r == true) {
			document.forms[0].action = "deleteUser?mailId=" + mail;
			document.forms[0].method = "post";
			document.forms[0].submit();
		}

	}
	function updateUser(mail) {
		var r = confirm("Are you sure to update " + mail + "?");
		if (r == true) {
			document.forms[0].action = "editUser?mailId=" + mail;
			document.forms[0].method = "post";
			document.forms[0].submit();
		}

	}
	function goBack() {
		document.forms[0].action = "goBack";
		document.forms[0].method = "post";
		document.forms[0].submit();
	}
</script>
<body>
	<div align="right" style="margin-right: 30px; margin-top: 15px">
		<a id="logout" href='<core:url value="j_spring_security_logout" />'>
			Logout</a>
	</div>
	</br>

	<form action="">
		<table border="2" align="center">
			<h3 align="center">
				<u>User's List</u>
			</h3>
			<tr>
				<th>Name</th>
				<th>Email</th>
				<th>Mobile Number</th>
			</tr>
			<core:forEach var="usr" items="${userList}">
				<tr>
					<td>${usr.name}</td>
					<td>${usr.email}</td>
					<td>${usr.mobile}</td>
					<td><input type="button" onclick="deleteUser('${usr.email}')"
						value="Delete"></td>
					<td><input type="button" onclick="updateUser('${usr.email}')"
						value="Edit"></td>
				</tr>
			</core:forEach>
		</table>
	</form>
	</br>
	<div align="center">
		<input type="button" value="Go Back" onclick="goBack()" />
	</div>
</body>
</html>