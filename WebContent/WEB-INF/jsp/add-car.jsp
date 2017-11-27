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
	Color: <form:select path="color" >
	<form:option value="NOT MENTIONED">Select</form:option>
	<form:option value="RED">Red</form:option>
	<form:option value="BLUE">Blue</form:option>
	<form:option value="BLACK">Black</form:option>
	<form:option value="WHITE">White</form:option>
	<form:option value="SILVER">Silver</form:option>
	</form:select>
		<br>	

Mileage: <form:input path="mileage" />
		<br>

Max Speed: <form:input path="maxSpeed" />
		<br>
		<input type="submit" value="Submit" />
	</form:form>

</body>
</html>


