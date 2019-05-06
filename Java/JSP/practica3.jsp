<!-- 3. Escribe una aplicaci�n que pida tu nombre. A continuaci�n mostrar� "Hola"
seguido del nombre introducido. El nombre se deber� recoger mediante un
formulario.
-->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Práctica 3</title>
</head>
<body>
<form method="post" action="saludo.jsp">
¿Cómo te llamas? 
<input type="text" name="nombre">
<input type="submit" value="OK">
    </form>
</body>
</html>