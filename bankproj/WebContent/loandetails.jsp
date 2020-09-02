<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="style1.css">
</head>
<body style="background-color:powderblue;">
<%
   response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
  if(session.getAttribute("username")==null)
	  response.sendRedirect("login.jsp");
   
   %>



<form  class="form-horizontal" action="loandetails" method="post">
<div>
<h2> enter bank details </h2>
</div>
               
 <div class="form-group">  
   <label class="control-label col-sm-2" for="gold">gold carrot:</label>
  
<select  name="goldcarrot">
  <option value=8>8</option>
  <option value=16>16</option>
  <option value=24>24</option>
</select><br></div>
<div class="form-group">
<label class="control-label col-sm-2" >weight</label>
<input type="text" name="weight"><br></div>
<label class="control-label col-sm-2" >jwellers</label>
<input type="text" name="jewellers"><br></div>
<div class="form-group">
<label class="control-label col-sm-2" >jwellers_address</label>
<input type="text" name="address"><br></div>

<h2> Enter bank details</h2>
<div class="form-group">
<label class="control-label col-sm-2">account holder</label>
<input type="text" name=" account_holder_name"></div>
<div class="form-group">
<label class="control-label col-sm-2" >account type</label>
<select  name="acctype">
  <option value="saving">saving</option>
  <option value="current">current</option>
 
</select></div><br>
<div class="form-group">
<label class="control-label col-sm-2" >account number</label>
<input type="text" name="account_number"></div>
<div class="form-group">
<label class="control-label col-sm-2" >IFSC code</label>
<input type="text" name="ifsc_code"></div>
<div class="form-group">
<label class="control-label col-sm-2" >bank name</label>
<input type="text" name=" bank_name"></div>
<div class="form-group">
<label class="control-label col-sm-2" >branch name</label>
<input type="text" name="branch_name"></div>

 <button type="submit">submit</button><br></div></div>
</form>      
</body>
</html>