<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1> Add New Student </h1>
	
	<form action="updatestudent" method="post">
	
		Roll Number : <input type="text" name="rollNumber" value="${ student.rollNumber }">
		<br>
		First Name : <input type="text" name="firstName" value="${ student.firstName }">
		<br>
		Last Name : <input type="text" name="lastName" value="${ student.lastName }">
		<br>
		<input type="submit" value="Update Student">
	
	
	</form>

</body>
</html>