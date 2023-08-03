<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="updateVen" method="post">
	<pre>
		Id:     <input type="text" name="id" value="${vendor.id}" required="true">
		Code:   <input type="text" name="code" value="${vendor.code}" required="true">
		Name:   <input type="text" name = "name" value="${vendor.name}" required="true"> 
		<label> Type </label>
		<select name="type">
			<option value="Regular" name="type" ${vendor.type=='Regular'?'checked':''}>Regular</option>
			<option value="Contract" name="type" ${vendor.type=='Contract'?'checked':''}>Contract</option>
		</select>
		Email:  <input type="text" name="email" value="${vendor.email}" required="true">
		Phone:  <input type="text" name="phone" value="${vendor.phone}" required="true">
		Address:<textarea  rows="3" cols="20" name="address">${vendor.address}</textarea>
		<input type="submit" value="save"/>
	</pre>
</form>
</body>
</html>