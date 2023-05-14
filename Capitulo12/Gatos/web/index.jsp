<%-- 
    Document   : Gatos
   
    Author     : Víctor
--%>
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
        <br>

        <p style="text-align:center;">  CSS creado con bootstrap</p> 
        <br>
        <br>
        <form method="post" action="gatos.jsp">
            Inserta nombre de los gatos
            <br>
            <br>
            Gato 1: <input type="text" name="name1" required />
            <br>
            <br>
            Gato 2: <input type="text" name="name2" required/>
            <br>
            <br>
            Gato 3: <input type="text" name="name3" required/>

            </br>
            <br>
            Escoge frases al azar 
            <br>
            <br>
            Gato 1: <select name="respuestas1" required>
                <option></option>
                <option>Hola qué tal estás, me gustaría hablar contigo</option>
                <option>No me caes muy bien</option>
                <option>Adiós, no quiero hablar contigo</option>
                <option>Vamos al cine?</option>
                <option>Te recomiendo leer este libro</option>
            </select>
            <br>
            <br>
            Gato 2: <select name="respuestas2" required>
                <option></option>
                <option>Gracias, tú también me caes bien</option>
                <option>No quiero hablar contigo tampoco</option>
                <option>Me parece buena idea</option>
                <option>El cine es muy barato</option>
                <option>No suelo leer libros</option>
            </select>
            <br>
            <br>
            Gato 3: <select name="respuestas3" required>
                <option></option>
                <option>Puedo apuntarme a vuestro plan?</option>
                <option>Sois los mejores</option>
                <option>No me caeis nada bien</option>
                <option>Pasadlo bien</option>
                <option>Los libros son una mierda</option>
            </select>
            </br>
            <br>
            <input type="submit">
        </form>
    </body>