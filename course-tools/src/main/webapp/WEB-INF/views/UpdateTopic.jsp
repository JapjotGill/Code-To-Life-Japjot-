<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Create User</title>
</head>
<body>
        <h2>Update User Information</h2>
        <form id="updateForm" action="service/{id}" >
      
        Topic ID: <input name="id" />
        Name: <input name="name" />
        Description: <input name="description" />
        <input type="submit" value="Submit" />
        </form> 
</body>
</html>