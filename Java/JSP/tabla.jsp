<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tabla de multiplicar</title>
<link href="estilos.css" rel="stylesheet" type="text/css" />
</head>
<body>
<% int n =Integer.parseInt(request.getParameter("numero")); %>
<% for (int i=0; i<11; i++){
  out.println("<table><tr><td>"+i + " x " + n + " = " + i * n+"</tr></table>");}%>
}
</body>
</html>