<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Selected Topic</title>
</head>
<body>
 <h2>Updating Selected Topic</h2>
        <form:form action="/update-topic-${id}" modelAttribute="topicForm">
        Name: <form:input name="name" path="name"/>
        Description: <form:input name="description" path="description"/>
        <input type="submit" value="Submit" />
        </form:form>
        <br>
         <a href="/index1">Home Page</a>
</body>
</html>