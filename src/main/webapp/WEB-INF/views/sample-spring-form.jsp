<%@taglib uri="http://www.springframework.org/tags/form" prefix="fr" %>
<%@page isELIgnored="false" %>
<html>
<body>
	<h3>Data-Entry-Spring-Form</h3>
	<hr>
		<fr:form action="savecourse" modelAttribute="info">
			<pre>
			Code		<fr:input path="code"/>
			Title		<fr:input path="title"/>
			Subject		<fr:radiobuttons path="subject" items="${subjects}"/><%--<fr:select path="subject" items="${subjects}"/> --%>
			Duration	<fr:input path="duration"/>
			Fees		<fr:input path="fees"/>
					<input type="submit" value="Save"/>
			</pre>
		</fr:form>
	<hr>
	<a href="index.jsp">Home</a>
</body>
</html>