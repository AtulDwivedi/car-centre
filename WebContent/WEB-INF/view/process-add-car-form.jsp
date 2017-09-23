<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

${car.carName}
<br />
${car.carColor}
<br />
${car.countryOfOrigin}
<br />
${car.end}
<br />
<c:forEach items="${car.addOns }" var="addOn" >
${addOn } <br />
</c:forEach>
<br />
${car.loan}
<br />
${car.comment}