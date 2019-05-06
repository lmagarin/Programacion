<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Conversor de pesetas a euros</title>
</head>
<body>
<% Double pesetas= Double.parseDouble(request.getParameter("pesetas")); %>
<% out.println(pesetas);%> pesetas son <% out.println(Math.round(pesetas / 166.386)); %>euros.
</body>
</html>