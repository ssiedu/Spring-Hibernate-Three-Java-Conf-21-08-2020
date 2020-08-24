<%@page isELIgnored="false" %>
<html>
<body>
	<h3>Course-Details</h3>
	<hr>
		
		<pre>
			Code		${course.code}
			Title		${course.title}
			Subject		${course.subject}
			Duration	${course.duration}
			Fees		${course.fees}
		</pre>
	<hr>
	<a href="search">Search-Another-Course</a><br>
	<a href="index.jsp">Home</a><br>
</body>
</html>