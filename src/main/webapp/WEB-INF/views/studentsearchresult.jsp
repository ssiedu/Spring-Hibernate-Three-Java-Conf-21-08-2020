<%@page  isELIgnored="false" %>

<html>
<body>
	<h3>Student-Details</h3>
	<hr>
		
		<pre>
			<img src="loadimage?rno=${student.rno}"/>
			Rno 	${student.rno}
			Name	${student.name}			
			Branch	${student.branch}
			Sem	${student.sem}
				
		</pre>
	<hr>
	<a href="searchform">Search-Another-Student</a><br>
	<a href="index.jsp">Home</a><br>
</body>
</html>