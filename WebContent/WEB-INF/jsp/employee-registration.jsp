<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Employee Registration</h1>
<form:form action="employee-save" modelAttribute="emp">
Name: <form:input path="empName"/><br><br>
Email: <form:input path="empEmail"/><br><br>
Phone: <form:input path="empPhone"/><br><br>
<input type="submit">
</form:form> 
<a href="employee-login">Login</a>
</body>
</html>