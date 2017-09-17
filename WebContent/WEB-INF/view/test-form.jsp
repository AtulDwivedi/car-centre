<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<form:form action="processTestForm" modelAttribute="std" >
<form:input path="firstName"/>
<form:select path="country">
<form:option value="IND" label="India" />
</form:select>

<form:radiobutton path="lang" value="Java"/>
<form:radiobutton path="lang" value="Java 2"/>
<input type="submit" />
</form:form>