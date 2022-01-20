<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>Registration Form</title>
		<link rel="stylesheet" href="form.css" type="text/css">
		<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.0/jquery.min.js"> </script> 
		<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.0/jquery.validate.min.js"> </script>
	</head>

	<body>
		<div class="container">
			<h2>Employee Registration Form</h2>
			<form action="<%=request.getContextPath()%>/register" method="post" name="formregister">
				<table>
					<tr>
						<td><label>First Name:</label></td>
						<td><input type="text" name="firstName" id="firstName" required></td>
					</tr>
					<tr>
						<td><label>Last Name:</label></td>
						<td><input type="text" name="lastName" id="lastName" required></td>
					</tr>
					<tr>
						<td><label>Email:</label></td>
						<td><input type="email" name="userName" id="userName" required maxlength="30" pattern="[^@]+@[^@]+\.[a-zA-Z]{2,6}" title="Email must containd @ and . extension"></td>
					</tr>
					<tr>
						<td><label>Password:</label></td>
						<td><input type="password" name="password" id="password" required maxlength="16" pattern="^(?=.*[A-Za-z])(?=.*\d)(?=.*[@$!%*#?&])[A-Za-z\d@$!%*#?&]{6,16}$" title="Passsword has to be minimum 6 characters and maximum 16 characters with one letter, one number and oner special character"></td>
					</tr>
					<tr>
						<td><label>Address:</label></td>
						<td><input type="text" name="address" id="address" required maxlength="50"></td>
					</tr>
					<tr>
						<td><label>Mobile No:</label></td>
						<td><input type="text" name="contactNo" id="contactNo" required inputmode="numeric" pattern="[6-9]{1}[0-9]{9}" title="Phone number starting with 6 to 9 and remaing 9 digit with 0-9"></td>
					</tr>
				</table>
				<div class="btn-register">
					<button type="submit">Register</button>
				</div>
			</form>
		</div>
	</body>
</html>