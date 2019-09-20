<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Topic</title>
</head>
<body>
 <h2>Create Topic</h2>
        <form:form action="/create-topic" modelAttribute="topicForm">
        Name: <form:input name="name" path="name"/>
        Description: <form:input name="description" path="description"/>
        <input type="submit" value="Submit" />
        </form:form>
</body>
</html>

