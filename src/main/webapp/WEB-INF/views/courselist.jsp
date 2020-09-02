<%@page import="java.util.List, com.ssi.entities.Course" isELIgnored="false" %>
<%
	//we are retrieving courselist from request scope
	List<Course> courses=(List<Course>)request.getAttribute("courses");
%>
<html>
<body>
<h3>Courses Offered By Us</h3>
<hr>
<table border="2">
	<tr><th>Code</th><th>Title</th><th>Subject</th><th>Dur</th><th>Fees</th></tr>
<%
	for(Course course : courses){
%>	
<tr>
	<td><%=course.getCode() %></td>
	<td><%=course.getTitle()%></td>
	<td><%=course.getSubject()%></td>
	<td><%=course.getDuration()%></td>
	<td><%=course.getFees()%></td>
</tr>
<%
	}
%>	
	
	
</table>
<hr>
<a href="index.jsp">Home</a>
</body>
</html>