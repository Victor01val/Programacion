<%-- 
    Document   : Piedra Papel o Tijeras

    Author     : Víctor
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <link rel="stylesheet" type="text/css" href="estilos.css" />
<!DOCTYPE html>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Juego de Piedra, Papel o Tijeras</title>

</head>
<body>
<h1>Bienvenido al juego de Piedra, Papel o Tijeras</h1>
 
<form method="post" action="resultado.jsp">
		<label for="jugador1">Jugador 1:</label>
		<input type="text" name="jugador1" id="jugador1" required><br><br>
		<label for="jugador2">Jugador 2:</label>
		<input type="text" name="jugador2" id="jugador2" required><br><br>
    <% for (int i = 1; i <= 5; i++) { %>
		<p><strong>Ronda <%=i%></strong></p>
        <label for="eleccionJugador1_<%=i%>">Elección Jugador 1:</label>
        <select name="eleccionJugador1_<%=i%>">
            <option value="piedra">Piedra</option>
            <option value="papel">Papel</option>
            <option value="tijeras">Tijeras</option>
        </select>
        <br><br>
        <label for="eleccionJugador2_<%=i%>">Elección Jugador 2:</label>
        <select name="eleccionJugador2_<%=i%>">
            <option value="piedra">Piedra</option>
            <option value="papel">Papel</option>
            <option value="tijeras">Tijeras</option>
        </select>
        <br><br>
    <% } %>
		<input type="submit" value="Jugar">
	</form>
</body>
</html>
