<%-- 
    Document   : Helados
   
    Author     : Víctor
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Máquina de Helados</title>
       <link rel="stylesheet" type="text/css" href="estilos.css" />
       <style>
        .tarrina {
            width: 300px;
            height: 100px;
            border: 1px solid black;
            position: relative;
            display: flex;
        }

        .chocolate {
            background-color: brown;
        }

        .fresa {
            background-color: pink;
        }

        .vainilla {
            background-color: yellow;
        }
          body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
        }

        .container {
            max-width: 600px;
            margin: 0 auto;
            padding: 20px;
            background-color: #ffffff;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            border-radius: 5px;
             display: flex;
  justify-content: center;
  align-items: center;
        }

        h1 {
            text-align: center;
        }
         input[type="button"] {
                padding: 10px 20px;
               
                background-color: #4CAF50;
                color: white;
                border: none;
                border-radius: 5px;
                cursor: pointer;
                 position: absolute;
   bottom: 450px;
            }
    </style>
</head>


<body>
    <h1>Máquina de Helados</h1>
    <div class="container">
    

    <%
        int chocolate = Integer.parseInt(request.getParameter("chocolate"));
        int fresa = Integer.parseInt(request.getParameter("fresa"));
        int vainilla = Integer.parseInt(request.getParameter("vainilla"));

        int total = chocolate + fresa + vainilla;

        if (total > 100) {
            out.println("<p>La suma de los porcentajes debe ser menor o igual que 100. Por favor, introduzca de nuevo los porcentajes.</p>");
        } else {
            out.println("<div class=\"tarrina\">");

            if (chocolate > 0) {
                int chocolateWidth = (chocolate * 300) / 100;
                out.println("<div class=\"chocolate\" style=\"width: " + chocolateWidth + "px;\"></div>");
            }

            if (fresa > 0) {
                int fresaWidth = (fresa * 300) / 100;
                out.println("<div class=\"fresa\" style=\"width: " + fresaWidth + "px;\"></div>");
            }

            if (vainilla > 0) {
                int vainillaWidth = (vainilla * 300) / 100;
                out.println("<div class=\"vainilla\" style=\"width: " + vainillaWidth + "px;\"></div>");
            }

            out.println("</div>");
        }
    %>
    
    <input type="button" value="Volver" onclick="history.back()">
    </div>
</body>
</html>
