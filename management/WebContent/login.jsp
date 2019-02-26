<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<div style="text-align: center;"><h2>Registration Page</h2></div>
</head>
<body style="background-color: aquamarine;">
    <div style="margin-left: 525px; ">
<form  action="LoginServlet" method="post" name="form1">
<table  border="0" cellspacing="20">
<tr>
<td>User Id</td>
<td><input style="border-radius: 10;" type="text" name="userId" />

</tr>
<tr >
<td>Password</td>
<td><input style="border-radius: 10;" name="passsword" type="password" required >
</tr>
<tr>
<td> <button type="submit" >submit</button></td>
</tr>

</table>

</form>
<a href="registerUser.html">click here to register</a>
</div>
</body>
</html>