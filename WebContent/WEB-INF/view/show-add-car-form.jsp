<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<style type="text/css">

.errorColor{
color:red;
}

</style>

</head>
<body>

<form:form action="processAddCarForm" modelAttribute="car">
	<form:input path="carName" />
	<form:errors path="carName" cssClass="errorColor" />
	<br><br>
	
	<form:input path="carEmail" />
	<form:errors path="carEmail" cssClass="errorColor" />
	<br><br>
	
	
	<form:input path="number" />
	<form:errors path="number" cssClass="errorColor" />
	<br><br>
	<form:input path="carColor" />
	<form:errors path="carColor" cssClass="errorColor" />

<br><br>

	<form:select path="countryOfOrigin">
		<form:option value="India" label="India" />
		<form:option value="US" label="US" />
	</form:select>
	
	<br><br>

	<form:radiobutton path="end" value="High End" />
	<form:radiobutton path="end" value="Low End" />
	<br><br>
	
	AC: <form:checkbox path="addOns" value="Air Conditioner"  /> &nbsp;
	ABS: <form:checkbox path="addOns" value="Advance Breaking System"  />&nbsp;
	AB: <form:checkbox path="addOns" value="Air Bags"  />
	
	<br><br>
	
	Loan needed?: <form:checkbox path="loan"  /> &nbsp;
	<br><br>
	
	Feedback: <form:textarea path="comment"  /> &nbsp;
	<br><br>
	
	<input type="submit" value="Submit" />
</form:form>

</body>
</html>


