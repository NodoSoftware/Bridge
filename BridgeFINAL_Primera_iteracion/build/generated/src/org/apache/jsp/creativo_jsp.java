package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class creativo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("    <title>Bridge</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap core CSS -->\r\n");
      out.write("    <link href=\"css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom styles for this template -->\r\n");
      out.write("    <link href=\"css/offcanvas.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"../../assets/js/html5shiv.js\"></script>\r\n");
      out.write("      <script src=\"../../assets/js/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("   \r\n");
      out.write("  .jumbotron{\r\n");
      out.write("    background-image:url('img/banner1.jpg');\r\n");
      out.write("    color: #ecf0f1;\r\n");
      out.write("    background-position:0% 90%; \r\n");
      out.write("  }\r\n");
      out.write("    </style>\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write("    <div class=\"navbar navbar-fixed-top navbar-inverse\" role=\"navigation\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <div class=\"navbar-header\">\r\n");
      out.write("          <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("          </button>\r\n");
      out.write("          <a class=\"navbar-brand\" href=\"creativo.jsp\">Bridge</a>\r\n");
      out.write("          \r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"collapse navbar-collapse\">\r\n");
      out.write("          <ul class=\"nav navbar-nav\">\r\n");
      out.write("            \r\n");
      out.write("            <div>\r\n");
      out.write("            \r\n");
      out.write("          </div>\r\n");
      out.write("          </ul>\r\n");
      out.write("          <ul class=\"nav navbar-nav navbar-right navbar-form \">\r\n");
      out.write("            \r\n");
      out.write("            <button type=\"submit\" class=\"btn btn-success\" onClick = \"modificarCreativoAux(); return false\">Creativo</button>\r\n");
      out.write("            <button type=\"submit\" class=\"btn btn-success\" onClick = \"logout(); return false\">Salir</button>\r\n");
      out.write("          </div>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div><!-- /.nav-collapse -->\r\n");
      out.write("      </div><!-- /.container -->\r\n");
      out.write("    </div><!-- /.navbar -->\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("      <div class=\"row row-offcanvas row-offcanvas-right\">\r\n");
      out.write("        <div class=\"col-xs-12 col-sm-9\">\r\n");
      out.write("          <p class=\"pull-right visible-xs\">\r\n");
      out.write("            <button type=\"button\" class=\"btn btn-primary btn-xs\" data-toggle=\"offcanvas\">Toggle nav</button>\r\n");
      out.write("          </p>\r\n");
      out.write("          \r\n");
      out.write("          <div class=\"jumbotron\">\r\n");
      out.write("            <h1>¡Creativo!</h1>\r\n");
      out.write("            <p>Bienvenido. Podrás ver y dar posibles soluciones a los problemas de otros usuarios.</p>\r\n");
      out.write("          </div>\r\n");
      out.write("            \r\n");
      out.write("          <div class=\"row\">\r\n");
      out.write("   <div class=\"col-lg-4\">\r\n");
      out.write("          <img src=\"imgI/PNG/Settings.png\" alt=\"...\" class=\"img-rounded\" id = \"i1\">\r\n");
      out.write("          <h2>Configuración</h2>\r\n");
      out.write("          <p>Donec rtyjs. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>\r\n");
      out.write("         \r\n");
      out.write("        </div>\r\n");
      out.write("    <div class=\"col-lg-4\">\r\n");
      out.write("          <img src=\"imgI/PNG/Dashboard.png\" alt=\"...\" class=\"img-rounded\" id = \"i1\">\r\n");
      out.write("          <h2>Busca Problemas y da Respuestas</h2>\r\n");
      out.write("          <p>Donec rtyjs. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>\r\n");
      out.write("          \r\n");
      out.write("        </div>\r\n");
      out.write("    <div class=\"col-lg-4\">\r\n");
      out.write("          <img src=\"imgI/PNG/Folder.png\" alt=\"...\" class=\"img-rounded\" id = \"i1\">\r\n");
      out.write("          <h2>Consulta tus aportes</h2>\r\n");
      out.write("          <p>Donec rtyjs. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>\r\n");
      out.write("          \r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-lg-4\">\r\n");
      out.write("          <img src=\"imgI/PNG/Comment.png\" alt=\"...\" class=\"img-rounded\" id = \"i1\">\r\n");
      out.write("          <h2>Notificaciones</h2>\r\n");
      out.write("          <h5><span class=\"label label-primary\">Muy Pronto</span></h5>\r\n");
      out.write("          <p>Donec rtyjs. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>\r\n");
      out.write("          \r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-lg-4\">\r\n");
      out.write("          <img src=\"imgI/PNG/Search.png\" alt=\"...\" class=\"img-rounded\" id = \"i1\">\r\n");
      out.write("          <h2>Busqueda Avanzada</h2>\r\n");
      out.write("          <h5><span class=\"label label-primary\">Muy Pronto</span></h5>\r\n");
      out.write("          <p>Donec rtyjs. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>\r\n");
      out.write("         \r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-lg-4\">\r\n");
      out.write("          <img src=\"imgI/PNG/Tag.png\" alt=\"...\" class=\"img-rounded\" id = \"i1\">\r\n");
      out.write("          <h2>Busca por Tags</h2>\r\n");
      out.write("          <h5><span class=\"label label-primary\">Muy Pronto</span></h5>\r\n");
      out.write("          <p>Donec rtyjs. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>\r\n");
      out.write("          \r\n");
      out.write("        </div>\r\n");
      out.write("          </div><!--/row-->\r\n");
      out.write("        </div><!--/span-->\r\n");
      out.write("\r\n");
      out.write("        <div class=\"col-xs-6 col-sm-3 sidebar-offcanvas \" id=\"sidebar\" role=\"navigation\">\r\n");
      out.write("          <div class=\"well sidebar-nav\">\r\n");
      out.write("            <ul class=\"nav\">\r\n");
      out.write("              <li>Usuario</li>\r\n");
      out.write("              <li class=\"active\"><a href=\"modificarCreativo.jsp\"><span class=\"glyphicon glyphicon-cog\"></span>Modificar Datos</a></li>\r\n");
      out.write("              <li>Problemas</li>\r\n");
      out.write("              <li><a href=\"listaProblemasCreativo.jsp\" ><span class=\"glyphicon glyphicon-list\"></span>Ver Problemas</a></li>\r\n");
      out.write("              <li>Aportes</li>\r\n");
      out.write("              <li><a href=\"listaAportesCreativo.jsp\"><span class=\"glyphicon glyphicon-list\"></span>Mis Aportes</a></li>                         \r\n");
      out.write("            </ul>\r\n");
      out.write("          </div><!--/.well -->\r\n");
      out.write("        </div><!--/span-->\r\n");
      out.write("      </div><!--/row-->\r\n");
      out.write("\r\n");
      out.write("      <hr>\r\n");
      out.write("\r\n");
      out.write("      <footer>\r\n");
      out.write("        <p>&copy; Nodo 2013</p>\r\n");
      out.write("      </footer>\r\n");
      out.write("\r\n");
      out.write("    </div><!--/.container-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap core JavaScript\r\n");
      out.write("    ================================================== -->\r\n");
      out.write("    <!-- Placed at the end of the document so the pages load faster -->\r\n");
      out.write("    <script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"js/awesome.js\"></script> \r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
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
