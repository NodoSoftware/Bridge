<%-- 
    Document   : newAporte
    Created on : 20/10/2013, 06:09:19 PM
    Author     : drosas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.Date"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    
    <title>Bridge</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.css" rel="stylesheet">
    <link rel="stylesheet" href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css">
    <!-- Custom styles for this template -->
    <link href="css/offcanvas.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="../../assets/js/html5shiv.js"></script>
      <script src="../../assets/js/respond.min.js"></script>
    <![endif]-->
    <style type="text/css">
   
  .jumbotron{
    background-image:url('img/banner1.jpg');
    color: #ecf0f1;  
    background-position:60% 50%; 
  }
    </style>
  </head>

  <body>
    <div class="navbar navbar-fixed-top navbar-inverse" role="navigation">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="creativo.jsp">Bridge</a>
        </div>
        <div class="collapse navbar-collapse">
          
          <ul class="nav navbar-nav">
            <li><a href="listaProblemasCreativo.jsp">Problemas</a></li>                      
          </ul>
          <ul class="nav navbar-nav">
            <li><a href="detalleProblemaC.jsp">Detalle Problema</a></li>                      
          </ul>
          <ul class="nav navbar-nav">
            <li class="active"><a href="newAporte.jsp">Agregar Aporte</a></li>                      
          </ul>

          <ul class="nav navbar-nav">
            
            <div>
            
          </div>
          </ul>
          <ul class="nav navbar-nav navbar-right navbar-form ">
            
            <button type="submit" class="btn btn-success" onClick = "modificarCreativoAux(); return false">Creativo</button>
            <button type="submit" class="btn btn-success">Salir</button>
          </div>
          </ul>
        </div><!-- /.nav-collapse -->
      </div><!-- /.container -->
    </div><!-- /.navbar -->

    <div class="container">

      <div class="row row-offcanvas row-offcanvas-right">
        <div class="col-xs-12 col-sm-9">
          <p class="pull-right visible-xs">
            <button type="button" class="btn btn-primary btn-xs" data-toggle="offcanvas">Toggle nav</button>
          </p>

          <div class="jumbotron">
            <h1>Agregar Aporte</h1>
            <p></p>
          </div>
          
          <div class="alert alert-success" style="display:none" id = "succes">Genial! tu aporte se a guardado correctamente!</div>
          <form class="form-horizontal" role="form" method="POST">
                  <div class="form-group">
    <label for="inputTitulo" class="col-lg-2 control-label">Título</label>
    <div class="col-lg-10">
      <input  name="titulo" class="form-control" id="inputTitulo" placeholder="Nombre del Aporte">
    </div>
  </div>

  <div class="form-group">
    <label for="inputDescripcion" class="col-lg-2 control-label">Descripción</label>
    <div class="col-lg-10">
     <textarea name ="descripcion" class="form-control" rows="3" id="inputDescripcion" placeholder ="Describe tu solución al problema"></textarea>
    </div>
  </div>
  <div class="form-group">
    <label for="inputCosto" class="col-lg-2 control-label">Costo</label>
    <div class="col-lg-10">
      <input  name="costo" class="form-control" id="inputCosto" placeholder="Costo aproximado de tu solución">
    </div>
  </div>
              
  <div class="form-group">
    <div class="col-lg-offset-2 col-lg-10">
      <button type="submit" class="btn btn-success" onClick ="valAporte($(&#34;#inputTitulo&#34;).val(),$(&#34;#inputDescripcion&#34;).val(),$(&#34;#inputCosto&#34;).val(),<%= session.getAttribute( "idProblema" ) %>,<%= session.getAttribute( "idCreativo" ) %>); return false;">Agregar!</button>
    </div>
  </div>

</form>
         </div><!--/span-->

        <div class="col-xs-6 col-sm-3 sidebar-offcanvas" id="sidebar" role="navigation">
          <div class="well sidebar-nav">
            <ul class="nav">
              <li>Usuario</li>
              <li class="active"><a href="modificarCreativo.jsp"><span class="glyphicon glyphicon-cog"></span>Modificar Datos</a></li>
              <li>Problemas</li>
              <li><a href="listaProblemasCreativo.jsp" ><span class="glyphicon glyphicon-list"></span>Ver Problemas</a></li>
              <li>Aportes</li>
              <li><a href="listaAportesCreativo.jsp"><span class="glyphicon glyphicon-list"></span>Mis Aportes</a>          
            </ul>
          </div><!--/.well -->
        </div><!--/span-->
      </div><!--/row-->

      <hr>

      <footer>
        <p>&copy; Nodo Software 2013</p>
      </footer>

    </div><!--/.container-->



    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="js/jquery.min.js"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.10.3/jquery-ui.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/awesome.js"></script>
    <script>
    $(window).load(function () {
      $("#inputFL").datepicker({ dateFormat: 'yy-mm-dd' });
    });
</script>
  </body>
</html>
