<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<!-- Bootstrap core CSS -->
<link
	href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Custom styles for this template -->
<link
	href="${pageContext.request.contextPath}/resources/css/carousel.css"
	rel="stylesheet">
</head>
<body>

<form:form action="save" modelAttribute="customer">

<div class="row">
		<div class="col-lg-1">&nbsp;</div>
		<div class="col-lg-10">
			<table class="table table-striped">
			<tr><td><th>First Name</th></td><td> <form:input path="firstName"/></td></tr>
			<tr><td><th>Last Name</th></td><td> <form:input path="lastName"/></td></tr>
			<tr><td><th>Age</th></td><td><form:select path="age">
			<option value="0">--select--</option>
			<%for(int i= 15; i<99; i++ ){ %>
			<option value=<%=i %>><%=i %></option>
			<% }%>
			</form:select></td></tr>
			<tr><td><th>Gender</th></td><td> Male <form:radiobutton path="gender" value="M"/>
									Female <form:radiobutton path="gender" value="F"/></td></tr>
			<tr><td><th>Occupation</th></td><td> <form:input path="occupation"/></td></tr>
<form:input path="customerID" type="hidden" />


</table>
<input class="btn btn-success" type="submit" value="save">
		</div>
		<div class="col-lg-1">&nbsp;</div>
	</div>
</form:form>

</body>
</html>