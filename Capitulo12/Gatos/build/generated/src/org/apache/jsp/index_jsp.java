package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Gatos con clase y bocadillos</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"estilos.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"titulo\">\n");
      out.write("            Gatos con clase y bocadillos\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("\n");
      out.write("        <p style=\"text-align:center;\">  (El CSS lo he copiado de bootstrap)</p> \n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <form method=\"post\" action=\"gatos.jsp\">\n");
      out.write("            Inserta nombre de los gatos\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            Gato 1: <input type=\"text\" name=\"name1\" required />\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            Gato 2: <input type=\"text\" name=\"name2\" required/>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            Gato 3: <input type=\"text\" name=\"name3\" required/>\n");
      out.write("\n");
      out.write("            </br>\n");
      out.write("            <br>\n");
      out.write("            Escoge frases al azar \n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            Gato 1: <select name=\"respuestas1\" required>\n");
      out.write("                <option></option>\n");
      out.write("                <option>Hola qué tal estás, me gustaría hablar contigo</option>\n");
      out.write("                <option>No me caes muy bien</option>\n");
      out.write("                <option>Adiós, no quiero hablar contigo</option>\n");
      out.write("                <option>Vamos al cine?</option>\n");
      out.write("                <option>Te recomiendo leer este libro</option>\n");
      out.write("            </select>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            Gato 2: <select name=\"respuestas2\" required>\n");
      out.write("                <option></option>\n");
      out.write("                <option>Gracias, tú también me caes bien</option>\n");
      out.write("                <option>No quiero hablar contigo tampoco</option>\n");
      out.write("                <option>Me parece buena idea</option>\n");
      out.write("                <option>El cine es muy barato</option>\n");
      out.write("                <option>No suelo leer libros</option>\n");
      out.write("            </select>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            Gato 3: <select name=\"respuestas3\" required>\n");
      out.write("                <option></option>\n");
      out.write("                <option>Puedo apuntarme a vuestro plan?</option>\n");
      out.write("                <option>Sois los mejores</option>\n");
      out.write("                <option>No me caeis nada bien</option>\n");
      out.write("                <option>Pasadlo bien</option>\n");
      out.write("                <option>Los libros son una mierda</option>\n");
      out.write("            </select>\n");
      out.write("            </br>\n");
      out.write("            <br>\n");
      out.write("            <input type=\"submit\">\n");
      out.write("        </form>\n");
      out.write("    </body>");
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
