<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring 1.4</title>
</head>
<body>
<h1>Tienda Online</h1>
<h2>Autenticacion</h2>
<form action="Servlet1" method=post>
Usuario:<br> <input type="text" name="user" required><br>
Clave: <br> <input type="password" name="pass" required><br>
<input type=submit value=Continuar>
</body>
</html>