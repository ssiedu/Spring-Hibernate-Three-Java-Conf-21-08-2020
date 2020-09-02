<%@taglib uri="http://www.springframework.org/tags/form" prefix="fr" %>
<html>
<body>
	<h3>Course-Entry-Form</h3>
	<hr>
	<form action="savecourse">
	<pre>
		Code		<input type="text" name="code"/> 	<i><fr:errors path="info.code"/></i>
		Title		<input type="text" name="title"/>	<i><fr:errors path="info.title"/></i>
		Subject		<input type="text" name="subject"/>	<i><fr:errors path="info.subject"/></i>
		Duration	<input type="text" name="duration"/>	<i><fr:errors path="info.duration"/></i>
		Fees		<input type="text" name="fees"/>	<i><fr:errors path="info.fees"/></i>
				<input type="submit" value="Save"/>
	</pre>
	</form>
	<hr>
	<%-- <fr:errors path="info.*"/> --%>
</body>
</html>