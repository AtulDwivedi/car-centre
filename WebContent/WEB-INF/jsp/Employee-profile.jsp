<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="">
<h1>Employee Profile</h1>
<table border="1">
<tr><th>ID</th><th>Name</th><th>Email</th><th>Phone</th></tr>
<c:forEach items="${emp}" var="c">
<tr>
<td>${c.empId}<br></td>
<td>${c.empName}<br></td>
<td>${c.empEmail}<br></td>
<td>${c.empPhone}<br></td>
</tr>
</c:forEach>
</table>

</form>
</body>
</html>