<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Topic</title>
</head>
<body>
 <h2>Create Topic</h2>
        <form action="/service" method="POST" action="save">
        Topic ID: <input name="id" />
        Name: <input name="name" />
        Description: <input name="description" />
        <input type="submit" value="Submit" />
        </form>
</body>
</html>

