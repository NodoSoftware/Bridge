<%-- 
    Document   : problematico
    Created on : Oct 15, 2013, 8:48:40 PM
    Author     : Deus Ex Machina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
    background-position:0% 90%; 
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
            
            <div>
            
          </div>
          </ul>
          <ul class="nav navbar-nav navbar-right navbar-form ">
            
            <button type="submit" class="btn btn-success" onClick = "modificarCreativoAux(); return false">Creativo</button>
            <button type="submit" class="btn btn-success" onClick = "logout(); return false">Salir</button>
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
            <h1>¡Creativo!</h1>
            <p>Bienvenido. Podrás ver y dar posibles soluciones a los problemas de otros usuarios.</p>
          </div>
            
          <div class="row">
   <div class="col-lg-4">
          <img src="imgI/PNG/Settings.png" alt="..." class="img-rounded" id = "i1">
          <h2>Configuración</h2>
          <p>Donec rtyjs. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>
         
        </div>
    <div class="col-lg-4">
          <img src="imgI/PNG/Dashboard.png" alt="..." class="img-rounded" id = "i1">
          <h2>Busca Problemas y da Respuestas</h2>
          <p>Donec rtyjs. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>
          
        </div>
    <div class="col-lg-4">
          <img src="imgI/PNG/Folder.png" alt="..." class="img-rounded" id = "i1">
          <h2>Consulta tus aportes</h2>
          <p>Donec rtyjs. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>
          
        </div>
        <div class="col-lg-4">
          <img src="imgI/PNG/Comment.png" alt="..." class="img-rounded" id = "i1">
          <h2>Notificaciones</h2>
          <h5><span class="label label-primary">Muy Pronto</span></h5>
          <p>Donec rtyjs. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>
          
        </div>
        <div class="col-lg-4">
          <img src="imgI/PNG/Search.png" alt="..." class="img-rounded" id = "i1">
          <h2>Busqueda Avanzada</h2>
          <h5><span class="label label-primary">Muy Pronto</span></h5>
          <p>Donec rtyjs. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>
         
        </div>
        <div class="col-lg-4">
          <img src="imgI/PNG/Tag.png" alt="..." class="img-rounded" id = "i1">
          <h2>Busca por Tags</h2>
          <h5><span class="label label-primary">Muy Pronto</span></h5>
          <p>Donec rtyjs. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>
          
        </div>
          </div><!--/row-->
        </div><!--/span-->

        <div class="col-xs-6 col-sm-3 sidebar-offcanvas " id="sidebar" role="navigation">
          <div class="well sidebar-nav">
            <ul class="nav">
              <li>Usuario</li>
              <li class="active"><a href="modificarCreativo.jsp"><span class="glyphicon glyphicon-cog"></span>Modificar Datos</a></li>
              <li>Problemas</li>
              <li><a href="listaProblemasCreativo.jsp" ><span class="glyphicon glyphicon-list"></span>Ver Problemas</a></li>
              <li>Aportes</li>
              <li><a href="listaAportesCreativo.jsp"><span class="glyphicon glyphicon-list"></span>Mis Aportes</a></li>                         
            </ul>
          </div><!--/.well -->
        </div><!--/span-->
      </div><!--/row-->

      <hr>

      <footer>
        <p>&copy; Nodo 2013</p>
      </footer>

    </div><!--/.container-->



    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/awesome.js"></script> 
  </body>
</html>
