<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Euros a pesetas</title>
</head>
<body>
<% Double euros = Double.parseDouble(request.getParameter("euros")); %>
<% out.print(euros); %> euros son <% out.println(Math.round(euros * 166.386)); %> pesetas.
</body>
</html>