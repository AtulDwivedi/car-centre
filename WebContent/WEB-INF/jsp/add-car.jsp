<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<style type="text/css">
.errorColor {
	color: red;
}
</style>

</head>
<body>

	<form:form action="process-add-car" modelAttribute="car">
	Model: <form:input path="model" />
		<form:errors path="model" cssClass="errorColor" />
		<br>
	Color: <form:input path="color" />
		<br>	

Mileage: <form:input path="mileage" />
		<br>

Max Speed: <form:input path="maxSpeed" />
		<br>
		<input type="submit" value="Submit" />
	</form:form>

</body>
</html>


