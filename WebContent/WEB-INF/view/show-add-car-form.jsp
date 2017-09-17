<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<form:form action="processAddCarForm" modelAttribute="car">
	<form:input path="carName" />
	<form:input path="carColor" />


	<form:select path="countryOfOrigin">
		<form:option value="India" label="India" />
		<form:option value="US" label="US" />
	</form:select>

	<form:radiobutton path="end" value="High End" />
	<form:radiobutton path="end" value="Low End" />
	<input type="submit" value="Submit" />
</form:form>