<%@page  isELIgnored="false" %>

<html>
<body>
	<h3>Course Successfully Updated : </h3>
	<h4>Updated Contents Are As Follows : </h4>
	<hr>
		<pre>
			Code		${course.code}
			Title		${course.title}
			Subject		${course.subject}
			Duration	${course.duration}
			Fees		${course.fees}
		</pre>
	<hr>
	<a href="index.jsp">Home</a><br>
</body>
</html>