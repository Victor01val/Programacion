<%-- 
    Document   : Gatos
   
    Author     : Víctor
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="daw.Gato"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Gatos con clase y bocadillos</title>
    <link rel="stylesheet" type="text/css" href="estilos.css" />
</head>
<body>
    <div class="titulo">
        Gatos con clase y bocadillos
    </div>
   <center>
    <% String nombreAnimal1 = request.getParameter("name1");
       String nombreAnimal2 = request.getParameter("name2");
       String nombreAnimal3 = request.getParameter("name3");
       String nombreRespuesta1 = request.getParameter("respuestas1");
       String nombreRespuesta2 = request.getParameter("respuestas2");
       String nombreRespuesta3 = request.getParameter("respuestas3");
       Gato g1 = new Gato(nombreAnimal1, "blanco.jpg", "jamon.jpg");
       Gato g2 = new Gato(nombreAnimal2, "leo.png", "queso.jpg");
       Gato g3 = new Gato(nombreAnimal3, "victor.jpg", "tortilla.jpg");
       out.println(g1.come("bocadillo de jamon"));
    %>
    <div class =" secundario">
    <% out.println(nombreAnimal1 + ": " +nombreRespuesta1); %>
    </div>
    <% out.println(g2.come("bocadillo de queso")); %>
    <div class =" secundario">
    <% out.println("     " + nombreAnimal2 + ": " +nombreRespuesta2); %>
     </div>
    <% out.println(g3.come("bocadillo de tortilla")); %>
      <div class =" secundario">
    <% out.println(nombreAnimal3 + ": " +nombreRespuesta3); %>
     </div>
    </center>
</body>
</html>