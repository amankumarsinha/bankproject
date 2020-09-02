<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text.html" charset="ISO-8859-1">
 
<title>user login</title>
 <link rel="stylesheet" href="style.css">
 <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body style="background-color:powderblue;">

<form class="form-horizontal" action="login" method="post">
  <div class="imgcontainer">
    <img src="img\download.jpg" alt="Avatar">
  </div>

  <div class="form-group">
    <label for="uname"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="uname" ><br>
    </div>
<div class="form-group">
    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="pass" ><br></div>

    <button type="submit">Login</button><br>
     
  </div>

  <div class="container" style="background-color:#f1f1f1">
   <a href="registration.jsp"> <button type="button" class="cancelbtn">register now</button></div></a>
    <a href="admin.jsp"> <button type="button" class="cancelbtn">admin login</button></div></a>
    
  </div>

</body>
</html>