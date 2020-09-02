<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style3.css">
</head>
<body style="background-color:powderblue;">
<div class="container">
<%
   response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
  if(session.getAttribute("username")==null)
	  response.sendRedirect("login.jsp");
   
   %>
   
    <nav>
      <input type="checkbox" id="check">
      <label for="check" class="checkbtn">
        <i class="fas fa-bars"></i>
      </label>
      <label class="logo">Welcome ${username} </label>
      <ul>
<li><a class="active" href="#">Home</a></li>
<li><a href="#">About</a></li>
<li><a href="kyc.jsp">KYC</a></li>
<li><a href="loandetails.jsp">Loan section</a></li>
<li><a href="#">Feedback</a></li>
<li><form  action="logout">
<input type="submit" class="button" value="logout"></form></li>
</ul>
</nav>
<%
out.print("complete kyc and loan details to get kn no to get kn number\n");
out.println();
out.println();%>
<% if(request.getSession().getAttribute("kn")!=null)
	   {
	   out.print(" ---->Your kn no is:-   "+request.getSession().getAttribute("kn"));
	   }
	   %>
 


</body>
</html>