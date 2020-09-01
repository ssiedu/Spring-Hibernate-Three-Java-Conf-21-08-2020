<%@taglib uri="http://www.springframework.org/tags/form" prefix="fr" %>

<html>
<body>
	<h3>Something Wrong.....................!!</h3>
	<hr>
		Error Messages Will Be Shown Here<br>
		<fr:errors path="info.*"/>
<%-- 
		<fr:errors path="info.code" /><br>
		<fr:errors path="info.duration"/><br>
--%>	<hr>
	<a href="index.jsp">Home</a>
</body>
</html>