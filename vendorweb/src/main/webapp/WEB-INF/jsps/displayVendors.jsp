<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>Id</th>
			<th>Code</th>
			<th>Name</th>
			<th>Type</th>
			<th>Email</th>
			<th>Phone</th>
			<th>Address</th>
		</tr>
		<c:forEach items="${vendors}" var="vendor">
			<tr>
				<td>${vendor.id}</td>
				<td>${vendor.code}</td>
				<td>${vendor.name}</td>
				<td>${vendor.type}</td>
				<td>${vendor.email}</td>
				<td>${vendor.phone}</td>
				<td>${vendor.address}</td>
				<td><a href="deleteVendor?id=${vendor.id}">Delete</a></td>
				<td><a href="showUpdate?id=${vendor.id}"">Edit</a></td>
			</tr>
		</c:forEach>	
	</table>
<a href="showCreate">Add Vendors</a>
</body>
</html>