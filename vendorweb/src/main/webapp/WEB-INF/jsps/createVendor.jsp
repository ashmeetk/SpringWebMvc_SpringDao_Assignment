<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="saveVen" method="post">
	<pre>
		Id:     <input type="text" name="id" required>
		Code:   <input type="text" name="code" required>
		Name:   <input type="text" name = "name" required> 
		<label> Type </label>
		<select name="type">
			<option value="Regular">Regular</option>
			<option value="Contract">Contract</option>
		</select>
		Email:  <input type="text" name="email" required>
		Phone:  <input type="text" name="phone" required>
		Address:<textarea rows="3" cols="20" name="address" required></textarea>
		<input type="submit" value="save"/>
	</pre>
</form>
${msg}

<a href="displayVendors">View All</a>
</body>
</html> 