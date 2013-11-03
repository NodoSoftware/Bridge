package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class problematico_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("    <title>Bridge</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    <link href=\"css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom styles for this template -->\n");
      out.write("    <link href=\"css/offcanvas.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("      <script src=\"../../assets/js/html5shiv.js\"></script>\n");
      out.write("      <script src=\"../../assets/js/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("   \n");
      out.write("  .jumbotron{\n");
      out.write("    background-image:url('img/banner1.jpg');\n");
      out.write("    color: #ecf0f1;\n");
      out.write("    background-position:0% 90%; \n");
      out.write("  }\n");
      out.write("    </style>\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("    <div class=\"navbar navbar-fixed-top navbar-inverse\" role=\"navigation\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("          <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("          </button>\n");
      out.write("          <a class=\"navbar-brand\" href=\"problematico.jsp\">Bridge</a>\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("        <div class=\"collapse navbar-collapse\">\n");
      out.write("          <ul class=\"nav navbar-nav\">\n");
      out.write("            \n");
      out.write("            <div>\n");
      out.write("            \n");
      out.write("          </div>\n");
      out.write("          </ul>\n");
      out.write("          <ul class=\"nav navbar-nav navbar-right navbar-form \">\n");
      out.write("            \n");
      out.write("            <button type=\"submit\" class=\"btn btn-success\" onClick = \"modificarProblematicoAux(); return false\" >Usuario</button>\n");
      out.write("            <button type=\"submit\" class=\"btn btn-success\" onClick = \"logout(); return false\">Salir</button>\n");
      out.write("          </div>\n");
      out.write("          </ul>\n");
      out.write("        </div><!-- /.nav-collapse -->\n");
      out.write("      </div><!-- /.container -->\n");
      out.write("    </div><!-- /.navbar -->\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("\n");
      out.write("      <div class=\"row row-offcanvas row-offcanvas-right\">\n");
      out.write("        <div class=\"col-xs-12 col-sm-9\">\n");
      out.write("          <p class=\"pull-right visible-xs\">\n");
      out.write("            <button type=\"button\" class=\"btn btn-primary btn-xs\" data-toggle=\"offcanvas\">Toggle nav</button>\n");
      out.write("          </p>\n");
      out.write("          \n");
      out.write("          <div class=\"jumbotron\">\n");
      out.write("            <h1>¡Problematico!</h1>\n");
      out.write("           <p>¡Bienvenido! Aquí puedes dar a conocer el problema que te haya surgido y tendrás posibles soluciones a él.</p>\n");
      out.write("          </div>\n");
      out.write("            \n");
      out.write("          <div class=\"row\">\n");
      out.write("   <div class=\"col-lg-4\">\n");
      out.write("          <img src=\"imgI/PNG/Settings.png\" alt=\"...\" class=\"img-rounded\" id = \"i1\">\n");
      out.write("          <h2>Configuración</h2>\n");
      out.write("          <p>Donec rtyjs. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>\n");
      out.write("         \n");
      out.write("        </div>\n");
      out.write("    <div class=\"col-lg-4\">\n");
      out.write("          <img src=\"imgI/PNG/Document.png\" alt=\"...\" class=\"img-rounded\" id = \"i1\">\n");
      out.write("          <h2>Crea Problemas</h2>\n");
      out.write("          <p>Donec rtyjs. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("    <div class=\"col-lg-4\">\n");
      out.write("          <img src=\"imgI/PNG/Thumb_Up.png\" alt=\"...\" class=\"img-rounded\" id = \"i1\">\n");
      out.write("          <h2>Elige y Califica</h2>\n");
      out.write("          <p>Donec rtyjs. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-lg-4\">\n");
      out.write("          <img src=\"imgI/PNG/Comment.png\" alt=\"...\" class=\"img-rounded\" id = \"i1\">\n");
      out.write("          <h2>Notificaciones</h2>\n");
      out.write("          <h5><span class=\"label label-primary\">Muy Pronto</span></h5>\n");
      out.write("          <p>Donec rtyjs. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-lg-4\">\n");
      out.write("          <img src=\"imgI/PNG/Search.png\" alt=\"...\" class=\"img-rounded\" id = \"i1\">\n");
      out.write("          <h2>Busqueda Avanzada</h2>\n");
      out.write("          <h5><span class=\"label label-primary\">Muy Pronto</span></h5>\n");
      out.write("          <p>Donec rtyjs. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>\n");
      out.write("         \n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-lg-4\">\n");
      out.write("          <img src=\"imgI/PNG/Tag.png\" alt=\"...\" class=\"img-rounded\" id = \"i1\">\n");
      out.write("          <h2>Tags</h2>\n");
      out.write("          <h5><span class=\"label label-primary\">Muy Pronto</span></h5>\n");
      out.write("          <p>Donec rtyjs. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("          </div><!--/row-->\n");
      out.write("        </div><!--/span-->\n");
      out.write("\n");
      out.write("        <div class=\"col-xs-6 col-sm-3 sidebar-offcanvas \" id=\"sidebar\" role=\"navigation\">\n");
      out.write("          <div class=\"well sidebar-nav\">\n");
      out.write("            <ul class=\"nav\">\n");
      out.write("              <li>Usuario</li>\n");
      out.write("              <li class=\"active\"><a href=\"modificarProblematico.jsp\"><span class=\"glyphicon glyphicon-cog\"></span>Modificar Datos</a></li>\n");
      out.write("              <li>Problemas</li>\n");
      out.write("              <li><a href=\"newProblema.jsp\"><span class=\"glyphicon glyphicon-plus\"></span>Agregar un Problema</a></li>  \n");
      out.write("              <li><a href=\"listaProblemas.jsp\"><span class=\"glyphicon glyphicon-list\"></span>Mis problemas</a></li>                         \n");
      out.write("            </ul>\n");
      out.write("          </div><!--/.well -->\n");
      out.write("        </div><!--/span-->\n");
      out.write("      </div><!--/row-->\n");
      out.write("\n");
      out.write("      <hr>\n");
      out.write("\n");
      out.write("      <footer>\n");
      out.write("        <p>&copy; Nodo 2013</p>\n");
      out.write("      </footer>\n");
      out.write("\n");
      out.write("    </div><!--/.container-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core JavaScript\n");
      out.write("    ================================================== -->\n");
      out.write("    <!-- Placed at the end of the document so the pages load faster -->\n");
      out.write("    <script src=\"js/jquery.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/awesome.js\"></script> \n");
      out.write("  </body>\n");
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
