<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet"></link>
<title>Insert title here</title>
</head>
<body>
<h4>${searchcount}</h4>

<div class="container">
	<table>
	<thead>
		<tr>
			<th>ID</th>
			<th>Title</th>
			<th>URI</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="i" items="${items}">
			<tr>
				<td>${i.matchedObjectDescriptor.positionId}</td>
				<td>${i.matchedObjectDescriptor.positionTitle}</td>
				<td>${i.matchedObjectDescriptor.positionUri}</td>
			</tr>
		</c:forEach>
	</tbody>
	</table>
</div>

</body>
</html>