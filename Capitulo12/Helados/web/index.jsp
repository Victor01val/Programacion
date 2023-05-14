<%-- 
    Document   : helados
  
    Author     : Víctor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Máquina de Helados</title>
        <style>
            body {
                background-color: #f2f2f2;
                font-family: Arial, sans-serif;
            }

            .container {
                max-width: 600px;
                margin: 0 auto;
                padding: 20px;
                background-color: #ffffff;
                box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
                border-radius: 5px;
            }

            h2 {
                text-align: center;
                margin-bottom: 20px;
            }

            form {
                display: flex;
                flex-direction: column;
                align-items: center;
            }

            label {
                font-weight: bold;
                margin-bottom: 10px;
            }

            input[type="number"] {
                width: 50px;
                padding: 5px;
                border: 1px solid #ccc;
                border-radius: 3px;
            }

            input[type="submit"] {
                padding: 10px 20px;
                margin-top: 20px;
                background-color: #4CAF50;
                color: white;
                border: none;
                border-radius: 5px;
                cursor: pointer;
            }

            input[type="submit"]:hover {
                background-color: #45a049;
            }

            .image-wrapper {
                display: flex;
                justify-content: space-around;
                margin-top: 20px;
            }

            .image {
                display: flex;
                flex-direction: column;
                align-items: center;
            }

            .image img {
                width: 100px;
                height: 100px;
                object-fit: cover;
                border-radius: 50%;
                margin-bottom: 10px;
            }

            .image span {
                font-weight: bold;
            }
        </style>
    </head>
    <body>
        <div class="container">
            <h2>Crear Helado</h2>
            <form method="post" action="helado.jsp">
                <div class="image-wrapper">
                    <div class="image">
                        <img src="chocolate.jpg" alt="Chocolate">
                  
                    </div>
                    <div class="image">
                        <img src="fresa.jpg" alt="Fresa">
                
                    </div>
                    <div class="image">
                        <img src="vainilla.jpg" alt="Vainilla">
                    
                    </div>
                </div>

                <label for="chocolate">Chocolate:</label>
                <input type="number" id="chocolate" name="chocolate" min="0" max="100" required>

                <label for="fresa">Fresa:</label>
                <input type="number" id="fresa" name="fresa" min="0" max="100" required>

                <label for="vainilla">Vainilla:</label>
 <input type="number" id="vainilla" name="vainilla" min="0" max="100" required>
 <input type="submit" value="Crear">
</form>


</div>
</body>
</html>