<%-- 
    Document   : newProblema
    Created on : Oct 12, 2013, 8:17:48 PM
    Author     : Deus Ex Machina
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
    
    <title>Off Canvas Template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/offcanvas.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="../../assets/js/html5shiv.js"></script>
      <script src="../../assets/js/respond.min.js"></script>
    <![endif]-->
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
          <a class="navbar-brand" href="#">Bridge</a>
        </div>
        <div class="collapse navbar-collapse">
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
            <h1>Agregar Problema.</h1>
            <p>This is an example to show the potential of an offcanvas layout pattern in Bootstrap. Try some responsive-range viewport sizes to see it in action.</p>
          </div>
          <form class="form-horizontal" role="form" method="GET" action="saveProblema">
                  <div class="form-group">
    <label for="inputNombre" class="col-lg-2 control-label">Nombre del Problema</label>
    <div class="col-lg-10">
      <input  name="nombre" class="form-control" id="inputNombre" placeholder="Nombre del Problema">
    </div>
  </div>
  <div class="form-group">
    <label for="inputArea" class="col-lg-2 control-label">Area de conocimiento</label>
    <div class="col-lg-10">
<select name="area" class="form-control">
  <option>Ciencias de la Computacion</option>
  <option>Biologia</option>
  <option>Matematicas</option>
</select>
    </div>
  </div>

<div class="form-group">
    <label for="inputFL" class="col-lg-2 control-label">Fecha Limite para Aportes</label>
    <div class="col-lg-10">
      <input name ="fechaL"  class="form-control" id="inputFL" placeholder="Fecha Limite">
    </div>
  </div>

  <div class="form-group">
    <label for="inputDetalle" class="col-lg-2 control-label">Detalles Problema</label>
    <div class="col-lg-10">
     <textarea name ="detalle" class="form-control" rows="3"></textarea>
    </div>
  </div>
  <div class="form-group">
    <label for="inputTopico" class="col-lg-2 control-label">Tópicos</label>
    <div class="col-lg-10">
      <input name="topicos" class="form-control" id="inputTopico" placeholder="tópicos">
    </div>
  </div>
  <div class="form-group">
    
  </div>
  <div class="form-group">
    <div class="col-lg-offset-2 col-lg-10">
      <button type="submit" class="btn btn-default">Agregar</button>
    </div>

  </div>

</form>
        </div><!--/span-->

        <div class="col-xs-6 col-sm-3 sidebar-offcanvas" id="sidebar" role="navigation">
          <div class="well sidebar-nav">
            <ul class="nav">
              <li>Usuario</li>
              <li class="active"><a href="#">Modificar Datos</a></li>
              <li><a href="#">Eliminar este usuario</a></li>
              <li>Mis Problemas</li>
              <li><a href="#">Agregar un Problema</a></li>  
              <li><a href="#">Modificar mis problemas</a></li>  
              <li><a href="#">Buscar Problemas</a></li>           
              <li>Aportes</li>
              <li><a href="#">Aportes a mis Problemas</a></li>
            </ul>
          </div><!--/.well -->
        </div><!--/span-->
      </div><!--/row-->

      <hr>

      <footer>
        <p>&copy; Company 2013</p>
      </footer>

    </div><!--/.container-->



    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>
