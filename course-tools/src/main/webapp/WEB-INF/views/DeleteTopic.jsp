<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Delete Topic</title>
</head>
<body>
        <h2>Delete Topic</h2>
        <form:form action="/delete-topic-${id}" modelAttribute="topicForm">
        Topic ID: <form:input name="id"  path="id"/>
        <input type="submit" value="Submit" />
        </form:form>
        <br>
         <a href="/index1">Home Page</a>
</body>
</html>
       


