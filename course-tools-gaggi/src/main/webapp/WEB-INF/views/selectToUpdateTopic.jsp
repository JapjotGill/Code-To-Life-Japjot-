<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page import="org.japjot.client.model.TopicClient" %>
<html>
<body>
<h1>Retrieve data from database in jsp</h1>

       <form:form action="/update-topic-${id}" modelAttribute="topicClient">
        <form:select name="choosetoupdate" path="id">
			<form:options items="${client}" itemValue="id" itemLabel="id"/> 
			</form:select> 
       <c:forEach  items="${client}"  var="cl">
       <br>
       <a href="/update-topic-${cl.id}">${cl.name} --->  ${cl.id}</a>
       <br>
       </c:forEach>
        <input type="submit" value="Submit" />
       </form:form>

<br>
         <a href="/index1">Home Page</a>


</body>
</html>