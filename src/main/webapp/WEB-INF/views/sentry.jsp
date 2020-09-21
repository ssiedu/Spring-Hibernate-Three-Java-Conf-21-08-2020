<%@taglib uri="http://www.springframework.org/tags/form" prefix="fr" %>
<html>
<body>
	<h3>Student-Entry-Form</h3>
	<hr>
	<form action="savestudent" method="post" enctype="multipart/form-data">
	<pre>
		Rno		<input type="text" name="rno"/> 	
		Name		<input type="text" name="name"/>	
		Branch		<input type="text" name="branch"/>	
		Sem		<input type="text" name="sem"/>
		Photo		<input type="file" name="pic"/>	
				<input type="submit" value="Save"/>
	</pre>
	</form>
	<hr>
	<a href="index.jsp">Home</a>
</body>
</html>