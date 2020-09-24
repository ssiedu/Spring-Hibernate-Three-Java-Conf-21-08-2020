<%@taglib uri="http://www.springframework.org/tags/form" prefix="fr" %>
<html>
<body>
	<h3>Mailing-Form</h3>
	<hr>
	<form action="sendmail">
	<pre>
		To		<input type="text" name="to"/>
		Subject		<input type="text" name="subject"/>
		Info		<input type="text" name="info"/>
				<input type="submit" value="Send"/>
	</pre>
	</form>
	<hr>
	<a href="index.jsp">Home</a>
</body>
</html>