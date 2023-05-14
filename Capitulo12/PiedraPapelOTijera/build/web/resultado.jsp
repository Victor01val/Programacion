<%-- 
    Document   : Piedra papel o tijeras
   
    Author     : Víctor
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <link rel="stylesheet" type="text/css" href="estilos.css" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Resultados del juego</title>
</head>
<body>
<h1>Resultados del juego de Piedra, Papel o Tijeras</h1>
<%
    // Obtener los nombres de los jugadores
    String jugador1 = request.getParameter("jugador1");
    String jugador2 = request.getParameter("jugador2");
    // Variables para almacenar los puntajes de los jugadores
int puntajeJugador1 = 0;
int puntajeJugador2 = 0;

// Iterar por cada ronda del juego
for (int i = 1; i <= 5; i++) {
    // Obtener las elecciones de los jugadores para esta ronda
    String eleccionJugador1 = request.getParameter("eleccionJugador1_" + i);
    String eleccionJugador2 = request.getParameter("eleccionJugador2_" + i);
    
    // Determinar el ganador de la ronda
    String resultado = "";
    if (eleccionJugador1.equals(eleccionJugador2)) {
        resultado = "Empate";
    } else if ((eleccionJugador1.equals("piedra") && eleccionJugador2.equals("tijeras")) ||
               (eleccionJugador1.equals("papel") && eleccionJugador2.equals("piedra")) ||
               (eleccionJugador1.equals("tijeras") && eleccionJugador2.equals("papel"))) {
        resultado = jugador1 + " gana";
        puntajeJugador1++;
    } else {
        resultado = jugador2 + " gana";
        puntajeJugador2++;
    }
    
    // Mostrar el resultado de la ronda
    out.println("<p><strong>Ronda " + i + "</strong></p>");
    out.println("<p>" + jugador1 + " eligió " + eleccionJugador1 + "</p>");
    out.println("<p>" + jugador2 + " eligió " + eleccionJugador2 + "</p>");
    out.println("<p>" + resultado + "</p>");
    out.println("<hr>");
}

// Determinar el ganador del juego
String ganador = "";
if (puntajeJugador1 > puntajeJugador2) {
    ganador = jugador1;
} else if (puntajeJugador1 < puntajeJugador2) {
    ganador = jugador2;
} else {
    ganador = "Empate";
}

// Mostrar el ganador del juego
out.println("<h2>Ganador del juego: " + ganador + "</h2>");
%>

</body>
</html>