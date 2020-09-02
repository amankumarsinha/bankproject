<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:powderblue;">

<form class="form-horizontal" action="kyc" method="post">
enter aadhar no:<input type="text" name ="aadhar">
enter pan card no:<input type="text" name="pan">
enter passport no:<input type="text" name="passport">
enter driving liecence no:<input type="text" name="dl">

 <button type="submit">submit</button><br>
 
</form>
<%
 out.print("hi");%>
</body>
</html>