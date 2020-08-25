<%@page import="java.util.List, com.ssi.Course" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl" %>

<html>
<body>
<h3>Courses Offered By Us :</h3>
<hr>
<table border="2">
	<tr><th>Code</th><th>Title</th><th>Subject</th><th>Dur</th><th>Fees</th></tr>
<jstl:forEach items="${courses}" var="course">
<tr>
	<td>${course.code}</td>
	<td>${course.title}</td>
	<td>${course.subject}</td>
	<td>${course.duration}</td>
	<td>${course.fees }</td>
</tr>
</jstl:forEach>
</table>
<hr>
<a href="index.jsp">Home</a>
</body>
</html>