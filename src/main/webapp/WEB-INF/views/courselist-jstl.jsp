<%@page import="java.util.List, com.ssi.entities.Course" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl" %>

<html>
<body>
<h3>Courses Offered By Us :</h3>
<hr>
<table border="2">
	<tr><th>Code</th><th>Title</th><th>Subject</th><th>Dur</th><th>Fees</th><th>Del</th></tr>
<jstl:forEach items="${courses}" var="course">
<tr>
	<td>${course.code}</td>
	<td>${course.title}</td>
	<td>${course.subject}</td>
	<td>${course.duration}</td>
	<td>${course.fees }</td>
	<td><a href="deletecourse?code=${course.code}">[X]</a></td>
	<td><a href="update?code=${course.code}">change</a></td>
</tr>
</jstl:forEach>
</table>
<hr>
<a href="index.jsp">Home</a>
</body>
</html>