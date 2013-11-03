<%-- 
    Document   : detalleProblemaC
    Created on : 20/10/2013, 05:34:28 PM
    Author     : drosas
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
    <link rel="stylesheet" href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css">
    <!-- Custom styles for this template -->
    <link href="css/offcanvas.css" rel="stylesheet">
    <script src="js/jquery.min.js"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.10.3/jquery-ui.min.js"></script>
    <script src="js/awesome.js"></script>
    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="../../assets/js/html5shiv.js"></script>
      <script src="../../assets/js/respond.min.js"></script>
    <![endif]-->
    <style type="text/css">   
  .jumbotron{
    background-image:url('img/banner1.jpg');
    color: #ecf0f1;  
    background-position:80% 100%; 
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
            <li class="active"><a href="detalleProblemaC.jsp">Detalle Problema</a></li>                      
          </ul>
          <ul class="nav navbar-nav">
            
            <div>
            
          </div>
          </ul>
          <ul class="nav navbar-nav navbar-right navbar-form ">
            
            <button type="submit" class="btn btn-success">Usuario</button>
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
            <h1>Detalles del Problema :</h1>
            <p><%= session.getAttribute( "nombreProblema" ) %></p>
          </div>
          
          <form class="form-horizontal" role="form" method="POST">
                  <div class="form-group">
    <label for="inputNombre" class="col-lg-2 control-label">Nombre del Problema</label>
    <div class="col-lg-10">
        <input  name="nombre" class="form-control" id="inputNombre" placeholder="Nombre del Problema" readonly="">
    </div>
  </div>
<div class="form-group">
    <label for="inputFI" class="col-lg-2 control-label">Fecha de Creacion del Problema</label>
    <div class="col-lg-10">
        <input name ="fechaI"  class="form-control" id="inputFI" placeholder="Fecha" readonly="">
    </div>
  </div>
<div class="form-group">
    <label for="inputFL" class="col-lg-2 control-label">Fecha Limite para Aportes</label>
    <div class="col-lg-10">
        <input name ="fechaL"  class="form-control" id="inputFL" placeholder="Fecha Limite" readonly="">
    </div>
  </div>

  <div class="form-group">
    <label for="inputDetalle" class="col-lg-2 control-label">Detalles Problema</label>
    <div class="col-lg-10">
        <textarea name ="detalle" class="form-control" rows="3" id="inputDetalle" readonly=""></textarea>
    </div>
  </div>
  <div class="form-group">
    <script>         
      cargarDetallesProblema(<%= session.getAttribute( "idProblema" ) %>);      
</script>
  </div>
  <div class="form-group">
    <div class="col-lg-offset-2 col-lg-10">
       <a class="btn btn-success" onClick ="newAporteJSP()">Agergar Aporte</a>
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
    
    <script src="js/bootstrap.min.js"></script>
   <script>
    $(window).load(function () {
      $("#inputFL").datepicker({ dateFormat: 'yy-mm-dd' });
    });
</script>
  </body>
</html>
