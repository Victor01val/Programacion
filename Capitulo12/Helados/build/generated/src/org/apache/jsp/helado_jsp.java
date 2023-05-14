package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class helado_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>Máquina de Helados</title>\n");
      out.write("       <link rel=\"stylesheet\" type=\"text/css\" href=\"estilos.css\" />\n");
      out.write("       <style>\n");
      out.write("        .tarrina {\n");
      out.write("            width: 300px;\n");
      out.write("            height: 100px;\n");
      out.write("            border: 1px solid black;\n");
      out.write("            position: relative;\n");
      out.write("            display: flex;\n");
      out.write("             display: inline-block;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .chocolate {\n");
      out.write("            background-color: brown;\n");
      out.write("             display: inline-block;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .fresa {\n");
      out.write("            background-color: pink;\n");
      out.write("             display: inline-block;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .vainilla {\n");
      out.write("            background-color: yellow;\n");
      out.write("             display: inline-block;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <h1>Máquina de Helados</h1>\n");
      out.write("\n");
      out.write("    ");

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
    
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
