<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="RegistrationServlet" method="post">
<table>
<tr> <td> employee ID</td>
<td><input type="text" name="userId"></td>
</tr>
<tr>
<td>Password</td>
<td><input type ="password" name="password"></td>
</tr>
<tr>
<td>first name</td>
<td><input type ="text" name="fName"></td>
</tr>

<tr>
<td>Last name</td>
<td><input type ="text" name="lname"></td>
</tr>

<tr>
<td>UserStatus</td>
<td><input type ="text" name="userstatus"></td>
</tr>
<tr>
<td>Usertypey</td>
<td><input type ="number" name="usertype"></td>
</tr>
<tr><td><button type="submit" > register</button></td></tr>
</table>
</form>
</body>
</html>