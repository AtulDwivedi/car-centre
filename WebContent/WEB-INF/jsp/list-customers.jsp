<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer List</title>
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
	<jsp:include page="top-navbar.jsp" />
	
	<c:url var="sortfn" value="sort">
		<c:param name="sortBy" value="FIRSTNAME" />
	</c:url>
	<c:url var="sortln" value="sort">
		<c:param name="sortBy" value="LASTNAME" />
	</c:url>
	<c:url var="sorta" value="sort">
		<c:param name="sortBy" value="AGE" />
	</c:url>
	

	<div class="row">
		<div class="col-lg-1">&nbsp;</div>
		<div class="col-lg-10">
			<table class="table table-striped">
				<thead>
					<tr>
						<th scope="col">Sl No</th>
						<th scope="col"><a href="${sortfn}">First Name</a></th>
						<th scope="col"><a href="${sortln}">Last Name</a></th>
						<th scope="col"><a href="${sorta}">Age</a></th>
						<th scope="col">Actions</th>
					</tr>
				</thead>
				<tbody>

					<c:forEach items="${customers}" var="customer">
						<c:url var="updateLink" value="/customer/update">
							<c:param name="customerId" value="${customer.customerID}" />
						</c:url>
						<c:url var="deleteLink" value="/customer/delete">
							<c:param name="customerId" value="${customer.customerID}" />
						</c:url>
						<tr>
							<th scope="row"></th>
							<td>${customer.firstName}</td>
							<td>${customer.lastName}</td>
							<td>${customer.age}</td>
							<td><a href="${updateLink}">Update</a> / <a
								href="${deleteLink}">Delete</a></td>
						</tr>
					</c:forEach>

				</tbody>
			</table>
			<a class="btn btn-success" href="add">Add Customer</a>
		</div>
		<div class="col-lg-1">&nbsp;</div>
	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>