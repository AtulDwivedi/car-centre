<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form:form action="save-customer" modelAttribute="customer">

firstName : <form:input path="firstName"/>
lastName : <form:input path="lastName"/>
age : <form:input path="age"/>
gender : <form:input path="gender"/>
occupation: <form:input path="occupation"/>

<input type="submit" value="save">

</form:form>

</body>
</html>