<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv='Content-Type' content="text/html"; charset="UTF-8">
    <title>Formulario</title>
</head>
<body>
    <h1>Datos del Usuario</h1>
    <form action="<%=request.getContextPath()%>/SvUsuarios" method="post">
        <p><label>DNI: </label> <input type="text" name="dni"></p>
        <p><label>Nombre: </label> <input type="text" name="nombre"></p>
        <p><label>Apellido: </label> <input type="text" name="apellido"></p>
        <p><label>Teléfono: </label> <input type="text" name="telefono"></p>
        <button type="submit">Enviar</button>
    </form>

    <h1>Ver lista de Usuarios</h1>
    <p>Para ver los datos de los usuarios cargados haga click en el siguiente botón</p>
    <form action="<%=request.getContextPath()%>/SvUsuarios" method="get">
        <button type"submit">Mostrar Usuarios</button>
    </form>
</body>
</html>