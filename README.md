<h1 align="center"><% y %></h1>

En un archivo JSP (JavaServer Pages), los símbolos `<%` y `%>` se utilizan para delimitar bloques de código Java que se incrustan en el HTML. Estas delimitaciones permiten insertar y ejecutar código Java dentro de la página JSP. Aquí tienes una breve explicación de los distintos tipos de etiquetas JSP que usan estos delimitadores:

- <b>Scriptlets</b> (`<%`... `%>`): Permiten insertar código Java directamente en la página JSP. El código dentro de estas etiquetas se ejecuta cuando la página es procesada en el servidor.
```jsp
<% 
    int count = 10;
    out.println("The count is: " + count);
%>
```
- <b>Declaraciones</b> (`<%!` ... `%>`): Permiten declarar variables y métodos que se pueden utilizar en toda la página JSP. Estas declaraciones se colocan fuera del método `_jspService()` que es generado automáticamente por el contenedor JSP.
```jsp
<%! 
    private int myMethod() {
        return 42;
    }
%>
```
- <b>Expresiones</b> (`<%=` ... `%>`): Evaluan y muestran el resultado de una expresión Java. El resultado de la expresión se envía directamente al cliente.
```jsp
<%= new java.util.Date() %>
```
- <b>Comentarios JSP</b> (`<%--` ... `--%>`): Son comentarios que no se envían al cliente y no se procesan en el servidor.
```jsp
<%-- Este es un comentario en JSP que no aparecerá en el HTML generado --%>
```
- <b>Directiva de página</b> (`<%@ page` ... `%>`): Configura diversas propiedades de la página JSP, como el tipo de contenido, el juego de caracteres, la clase de supertipo, etc. Algunas de las opciones más comunes son:
    ```jsp
    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    ```
    - language: Especifica el lenguaje de programación utilizado en la página JSP (generalmente "java").
    - contentType: Establece el tipo de contenido MIME de la respuesta.
    - pageEncoding: Define la codificación de caracteres utilizada para la página JSP.
    - import: Permite importar clases Java en la JSP
