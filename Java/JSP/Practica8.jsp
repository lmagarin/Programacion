<!-- Realiza una aplicaci�n que pida un n�mero y que luego muestre la tabla de
multiplicar de ese n�mero. El resultado se debe mostrar en una tabla (<table>
en HTML). -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pr�ctica 8 </title>
<link href="estilos.css" rel="stylesheet" type="text/css" />
</head>
<body>
<h1>Tablas de multiplicar</h1>
<form method="post" action="tabla.jsp">
Inserte un n�mero: <input type="number" name="numero">
<input type="submit" value="Aceptar">
</body>
</html>