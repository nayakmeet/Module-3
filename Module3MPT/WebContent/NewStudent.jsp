<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="insert.obj">

StudentName<input type="text" name="studName">

Age<input type="text" name="age">

State<select id="state" name="state">
<option value="SelectValue">--Select value--</option>
		<option value="TamilNadu">Tamil Nadu</option>
		<option value="Karnataka">Karnataka</option>
		<option value="Pune">Pune</option>
		<option value="Mumbai">Mumbai</option>
		</select>

Gender<input type="text" name="gender">

No of Subjects Scored Centum <input type="text" name="scores">

No Of Attempts<input type="text" name="attempts"> 

Total Subject Scores<input type="text" name="total">

<input type="submit" value="Submit">
</form>

</body>
</html>