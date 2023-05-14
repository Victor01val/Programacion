package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class resultado_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>Juego de dos jugadores</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <h1>Juego de dos jugadores</h1>\n");
      out.write("    \n");
      out.write("    ");
      out.write("\n");
      out.write("    ");

        int jugador1 = 0;
        int jugador2 = 0;
    
      out.write("\n");
      out.write("    \n");
      out.write("    ");
      out.write("\n");
      out.write("    ");

        for (int ronda = 1; ronda <= 5; ronda++) {
    
      out.write("\n");
      out.write("    \n");
      out.write("    <h2>Ronda ");
      out.print( ronda );
      out.write("</h2>\n");
      out.write("    \n");
      out.write("    ");
      out.write("\n");
      out.write("    ");

        int dado1 = (int) (Math.random() * 6) + 1;
        int dado2 = (int) (Math.random() * 6) + 1;
        
        if (dado1 > dado2) {
            jugador1++;
        } else if (dado2 > dado1) {
            jugador2++;
        }
    
      out.write("\n");
      out.write("    \n");
      out.write("    <p>Jugador 1: ");
      out.print( dado1 );
      out.write("</p>\n");
      out.write("    <p>Jugador 2: ");
      out.print( dado2 );
      out.write("</p>\n");
      out.write("    \n");
      out.write("    ");
      out.write("\n");
      out.write("    ");

        String ganador;
        String fotoGanador;
        
        if (dado1 > dado2) {
            ganador = "Jugador 1";
            fotoGanador = "img/jugador1.jpg";
        } else if (dado2 > dado1) {
            ganador = "Jugador 2";
            fotoGanador = "img/jugador2.jpg";
        } else {
            ganador = "Empate";
            fotoGanador = "";
        }
    
      out.write("\n");
      out.write("    \n");
      out.write("    <p>Ganador: ");
      out.print( ganador );
      out.write("</p>\n");
      out.write("    \n");
      out.write("    ");
      out.write("\n");
      out.write("    ");
 if (!fotoGanador.isEmpty()) { 
      out.write("\n");
      out.write("        <img src=\"");
      out.print( fotoGanador );
      out.write("\" alt=\"Foto del ganador\">\n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("    \n");
      out.write("    ");
      out.write("\n");
      out.write("    <hr>\n");
      out.write("    \n");
      out.write("    ");
      out.write("\n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("    \n");
      out.write("    ");
      out.write("\n");
      out.write("    <h2>Resultado final</h2>\n");
      out.write("    <p>Jugador 1: ");
      out.print( jugador1 );
      out.write("</p>\n");
      out.write("    <p>Jugador 2: ");
      out.print( jugador2 );
      out.write("</p>\n");
      out.write("    \n");
      out.write("    ");
      out.write("\n");
      out.write("    ");
 if (jugador1 > jugador2) { 
      out.write("\n");
      out.write("        <p>El ganador del juego es el Jugador 1</p>\n");
      out.write("        <img src=\"img/jugador1.jpg\" alt=\"Foto del ganador\">\n");
      out.write("    ");
 } else if (jugador2 > jugador1) { 
      out.write("\n");
      out.write("        <p>El ganador del juego es el Jugador 2</p>\n");
      out.write("        <img src=\"img/jugador2.jpg\" alt=\"Foto del ganador\">\n");
      out.write("    ");
 } else { 
      out.write("\n");
      out.write("        <p>El juego terminó\n");
      out.write("</p>\n");
      out.write("    ");
      out.write("\n");
      out.write("    ");
 if(ganador == 1) { 
      out.write("\n");
      out.write("        <img src=\"img/jugador1.jpg\" alt=\"Ganador Jugador 1\">\n");
      out.write("    ");
 } else { 
      out.write("\n");
      out.write("        <img src=\"img/jugador2.jpg\" alt=\"Ganador Jugador 2\">\n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("<p>El ganador es el Jugador ");
      out.print( ganador );
      out.write("</p>\n");
      out.write("<p>Puntuación Jugador 1: ");
      out.print( puntuacionJugador1 );
      out.write("</p>\n");
      out.write("<p>Puntuación Jugador 2: ");
      out.print( puntuacionJugador2 );
      out.write("</p>\n");
      out.write("\n");
      out.write("\n");
      out.write("<form action=\"juego.jsp\" method=\"get\">\n");
      out.write("    <input type=\"submit\" value=\"Volver a jugar\">\n");
      out.write("</form>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
