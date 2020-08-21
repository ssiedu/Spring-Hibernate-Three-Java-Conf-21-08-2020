<%@page isELIgnored="false" %>
<html>
<body>
	<h3>Course-Details-Stored-Successfully</h3>
	<hr>
		<h4>Following Details Stored : </h4>
		<pre>
			Code		${info.code}
			Title		${info.title}
			Subject		${info.subject}
			Duration	${info.duration}
			Fees		${info.fees}
		</pre>
	<hr>
	<a href="newcourse">Add-Another-Course</a><br>
	<a href="index.jsp">Home</a><br>
</body>
</html>