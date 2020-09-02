<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<meta charset="UTF-8">
	<title>registration  Validation</title>
	<link rel="stylesheet" type="text/css" href="style1.css">
	<script src="https://code.jquery.com/jquery-3.2.1.js"></script>
<title>Insert title here</title>
</head>
<body style="background-color:powderblue;">
<div class="container">
		<h1>REGISTER</h1>
		<form action="registration" method="post">
			<div>
				<input type="text"  name="name" >
				
				<label>
					First Name
				</label>	
			</div>
			
			<div>
				<input type="email" name="email" >
				
				<label>Email id</label>	
			</div>
			<div>
				<input type="password"  name="pass" >
				
				<label>Password</label>	
			</div>
			
			<input type="submit" value="Register">
		</form>
	</div>
	

</body>
</html>