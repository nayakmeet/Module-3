<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="com.cg.bean.StudentBean, java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%ArrayList<StudentBean> myList=(ArrayList<StudentBean>)session.getAttribute("list"); %>

<%for(StudentBean c:myList){
	out.print(c.getStudId()+"<br>");
	out.print("&nbsp;&nbsp;&nbsp;");
out.print(c.getStudName()+"<br>");
out.print("&nbsp;&nbsp;&nbsp;");
out.print(c.getAge()+"<br>");
out.print("&nbsp;&nbsp;&nbsp;");
out.print(c.getState()+"<br>");
out.print("&nbsp;&nbsp;&nbsp;");
out.print(c.getGender()+"<br>");
out.print("&nbsp;&nbsp;&nbsp;");
out.print(c.getCentum()+"<br>");
out.print("&nbsp;&nbsp;&nbsp;");
out.print(c.getAttempts()+"<br>");
out.print("&nbsp;&nbsp;&nbsp;");
out.print(c.getTotal()+"<br>");
out.print("&nbsp;&nbsp;&nbsp;");
out.print("<br/>");
}	
	%>


<a href="add.obj">AddNewStudentScoreDetails</a>

</body>
</html>