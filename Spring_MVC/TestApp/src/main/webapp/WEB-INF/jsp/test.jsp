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

	<h1> Students List </h1>
	<table border="2" width="70%" cellpadding="2">
		<tr>
			<th>Roll Number</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>View</th>
		</tr>
	<c:forEach var="student" items="${studentsList}">
		<tr>
			<td>${ student.rollNumber }</td>
			<td>${ student.firstName }</td>
			<td>${ student.lastName }</td>
			<td> <a href="profile/${ student.rollNumber }"> View </a> </td>
		</tr>
	</c:forEach>
	</table>


</body>
</html>