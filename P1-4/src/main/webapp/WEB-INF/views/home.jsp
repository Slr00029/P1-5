<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring 1.5</title>
</head>
<CENTER>
<img src="https://e-prospera.com/wp-content/uploads/2017/11/curso-gratis-crea-tienda-online.jpg" height="250" width=100%>
<body background="http://blogs.ffyh.unc.edu.ar/escueladeletras/wp-content/blogs.dir/110/files/2016/04/fondos-de-pantalla-azul-infinito.jpg">
<h1></h1>
<h1>Login</h1>
<form action="Servlet1" method=post>
<b>Usuario:</b><br> <input type="text" name="user" required><br>
<b>Clave:</b> <br> <input type="password" name="pass" required><br>
<p><input type=submit value=Continuar></form><form action="registro" method=get><input type=submit value=Registrarse></form></p>
</CENTER>
</body>
</html>