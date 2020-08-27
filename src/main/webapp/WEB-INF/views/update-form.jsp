<%@page isELIgnored="false" %>
<html>
<body>
	<h3>Course-Update-Form</h3>
	<hr>
	<form action="updatecourse">
	<pre>
		Code		<input type="text" name="code" value="${course.code}"/>
		Title		<input type="text" name="title" value="${course.title}"/>
		Subject		<input type="text" name="subject" value="${course.subject}"/>
		Duration	<input type="text" name="duration" value="${course.duration}"/>
		Fees		<input type="text" name="fees" value="${course.fees}"/>
				<input type="submit" value="UpdateData"/>
	</pre>
	</form>
	<hr>
	<a href="index.jsp">Home</a>
</body>
</html>