<%-- 
    Document   : detalleAporte
    Created on : Oct 22, 2013, 9:56:49 PM
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
          <a class="navbar-brand" href="problematico.jsp">Bridge</a>
        </div>
        <div class="collapse navbar-collapse">
          
          <ul class="nav navbar-nav">
            <li><a href="listaProblemas.jsp">Mis Problemas</a></li>                      
          </ul>
            <ul class="nav navbar-nav">
            <li ><a href="listaAportes.jsp">Aportes al Problema</a></li>                      
          </ul>
          <ul class="nav navbar-nav">
            <li class="active"><a href="listaProblemas.jsp">Detalles del Aporte</a></li>                      
          </ul>  
          
          <ul class="nav navbar-nav">
            
            <div>
            
          </div>
          </ul>
          <ul class="nav navbar-nav navbar-right navbar-form ">
            
             <button type="submit" class="btn btn-success" >Problematico</button>
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
            <h1>Aporte al Problema: </h1>
            <p > <%= session.getAttribute( "nombreProblema" ) %> </p>
            <p id ="autor">  </p>
          </div>
          <div class="alert alert-danger" style="display:none" id = "success">Error! no se pudo hacer like o elegir el problema</div>
          <div class="alert alert-warning alert-dismissable" style="display:none" id = "elegir">
        <a type="button" class="close" onClick ="$('#elegir').hide()" aria-hidden="true">×</a>
        <h4>¿estás seguro?</h4>
        <p> Esto pondra a este aporte como el Problema que as elejido como el mejor aporte o como el aporte que resuelve tu problema. </p>
        <p>
          <a class="btn btn-success" onClick ="elegirAporte(<%= session.getAttribute( "idAporte" ) %>,<%= session.getAttribute( "idProblema" ) %>)" >Elegir Aporte</a> <a class="btn btn-primary" onClick ="$('#elegir').hide()">Nah mejor no</a>
        </p>
      </div>
          <form class="form-horizontal" role="form" method="POST">
                  <div class="form-group">
    <label for="inputTitulo" class="col-lg-2 control-label">Título</label>
    <div class="col-lg-10">
      <input  name="titulo" class="form-control" id="inputTitulo" placeholder="Nombre del Aporte">
    </div>
  </div>
   <div class="form-group">
    <label for="inputFecha" class="col-lg-2 control-label">Fecha</label>
    <div class="col-lg-10">
      <input  name="fecha" class="form-control" id="inputFecha" placeholder="FechaAporte" readonly="">
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
    <script>         
      cargarDetallesAporte(<%= session.getAttribute( "idAporte" ) %>);      
</script>
  </div>
  <div class="form-group">
    <div class="col-lg-offset-2 col-lg-10">
      <a class="btn btn-primary" onClick ="likeAporte(<%= session.getAttribute( "idAporte" ) %>);" id="like<%= session.getAttribute( "idAporte" ) %>" style="display:none"><span class="glyphicon glyphicon-thumbs-up"></span>Like</a>
      <a type="submit" class="btn btn-primary" onClick ="unlikeAporte(<%= session.getAttribute( "idAporte" ) %>);" id="unlike<%= session.getAttribute( "idAporte" ) %>" style="display:none"><span class="glyphicon glyphicon-thumbs-down"></span>Unlike</a>
      <a class="btn btn-success" onClick ="$('#elegir').show()">Elegir</a>
    </div>

  </div>
              
</form>
        </div><!--/span-->      

        <div class="col-xs-6 col-sm-3 sidebar-offcanvas" id="sidebar" role="navigation">
          <div class="well sidebar-nav">
            <ul class="nav">
              <li>Usuario</li>
              <li class="active"><a href="#"><span class="glyphicon glyphicon-cog"></span>Modificar Datos</a></li>
              <li><a href="#"><span class="glyphicon glyphicon-trash"></span>Eliminar este usuario</a></li>
              <li>Problemas</li>
              <li><a href="newProblema.jsp"><span class="glyphicon glyphicon-plus"></span>Agregar un Problema</a></li>  
              <li><a href="listaProblemas.jsp"><span class="glyphicon glyphicon-list"></span>Mis problemas</a></li>            
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
