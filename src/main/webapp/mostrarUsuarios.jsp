<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.List" %>
<%@ page import="org.CCristian.apiservlet.webapp.Models.Usuarios" %>

<%
List<Usuarios> listaUsuarios = (List<Usuarios>) request.getSession().getAttribute("listaUsuarios");
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Mostrar Usuarios</title>
</head>
<body>
    <h1>Lista de usuarios Registrados</h1>
    <table border="1">
        <tr>
            <th>DNI</th>
            <th>Nombre</th>
            <th>Apellido</th>
            <th>Teléfono</th>
        </tr>
        <% if (listaUsuarios != null) {
            for (Usuarios u : listaUsuarios) { %>
                <tr>
                    <td><%= u.getDni() %></td>
                    <td><%= u.getNombre() %></td>
                    <td><%= u.getApellido() %></td>
                    <td><%= u.getTelefono() %></td>
                </tr>
        <%    }
           } else { %>
            <tr>
                <td colspan="4">No hay usuarios registrados</td>
            </tr>
        <% } %>
    </table>
</body>
</html>
