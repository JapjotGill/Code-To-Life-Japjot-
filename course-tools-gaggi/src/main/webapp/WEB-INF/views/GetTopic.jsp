<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get Topic</title>
</head>
<body>
 <h2>Get Topic</h2>
        <form:form action="/get-topic" modelAttribute="topicForm">
       
       <form:select name="clientSel" path="description">
			<form:options items="${client}" itemValue="description" itemLabel="name"/>      
			
       </form:select> 
       
       <c:forEach  items="${client}" var="cl">
       <br>
       <a href="/topic/${cl.id}">${cl.name}</a>
       <br>
       </c:forEach>
        <input type="submit" value="Submit" />
        </form:form>
        
</body>
</html>

