<%@page isELIgnored="false" %>
<html>
<body>
	<h3>Student-Details-Stored-Successfully</h3>
	<hr>
		<h4>Following Details Stored : </h4>
		<pre>
			Rno		${student.rno}
			Name		${student.name}
			Branch		${student.branch}
			Sem		${student.sem}
			Photo		####			
		</pre>
	<hr>
	<a href="newstudent">Add-Another-Student</a><br>
	<a href="index.jsp">Home</a><br>
</body>
</html>