<h1 align="center"><% y %></h1>

En un archivo JSP (JavaServer Pages), los símbolos `<%` y `%>` se utilizan para delimitar bloques de código Java que se incrustan en el HTML. Estas delimitaciones permiten insertar y ejecutar código Java dentro de la página JSP. Aquí tienes una breve explicación de los distintos tipos de etiquetas JSP que usan estos delimitadores:

- Scriptlets (<% ... %>): Permiten insertar código Java directamente en la página JSP. El código dentro de estas etiquetas se ejecuta cuando la página es procesada en el servidor.
- Declaraciones (<%! ... %>): Permiten declarar variables y métodos que se pueden utilizar en toda la página JSP. Estas declaraciones se colocan fuera del método _jspService() que es generado automáticamente por el contenedor JSP.
- Expresiones (<%= ... %>): Evaluan y muestran el resultado de una expresión Java. El resultado de la expresión se envía directamente al cliente.
- Comentarios JSP (<%-- ... --%>): Son comentarios que no se envían al cliente y no se procesan en el servidor.
- Directiva de página (<%@ page ... %>): Configura diversas propiedades de la página JSP, como el tipo de contenido, el juego de caracteres, la clase de supertipo, etc. Algunas de las opciones más comunes son:
