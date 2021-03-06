<%-- 
    Document   : detalleProblema
    Created on : Oct 16, 2013, 11:20:02 PM
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
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js"></script>
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
            <li class="active"><a href="detalleProblema.jsp">Detalle Problema</a></li>                      
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
            <h1>Detalles del Problema.</h1>
            <p> Problema: <%= session.getAttribute( "nombreProblema" ) %>. This is an example to show the potential of an offcanvas layout pattern in Bootstrap. Try some responsive-range viewport sizes to see it in action.</p>
          </div>
          <div class="alert alert-success" style="display:none" id = "succes">Genial! tu problema se a guardado correctamente!</div>
          <div class="alert alert-danger alert-dismissable" style="display:none" id = "borrar">
        <a type="button" class="close" onClick ="$('#borrar').hide()" aria-hidden="true">×</a>
        <h4>Oh snap! You got an error!</h4>
        <p>Change this and that and try again. Duis mollis, est non commodo luctus, nisi erat porttitor ligula, eget lacinia odio sem nec elit. Cras mattis consectetur purus sit amet fermentum.</p>
        <p>
          <a class="btn btn-danger" onClick ="eliminarProblema(<%= session.getAttribute( "idProblema" ) %>)" >Eliminar Problema</a> <a class="btn btn-primary" onClick ="$('#borrar').hide()">Nah mejor no</a>
        </p>
      </div>
          <form class="form-horizontal" role="form" method="POST">
                  <div class="form-group">
    <label for="inputNombre" class="col-lg-2 control-label">Nombre del Problema</label>
    <div class="col-lg-10">
      <input  name="nombre" class="form-control" id="inputNombre" placeholder="Nombre del Problema">
    </div>
  </div>
<div class="form-group">
    <label for="inputFI" class="col-lg-2 control-label">Fecha de Creacion del Problema</label>
    <div class="col-lg-10">
      <input name ="fechaI"  class="form-control" id="inputFI" placeholder="Fecha">
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
     <textarea name ="detalle" class="form-control" rows="3" id="inputDetalle"></textarea>
    </div>
  </div>
  <div class="form-group">
    <script>         
      cargarDetallesProblema(<%= session.getAttribute( "idProblema" ) %>);      
</script>
  </div>
  <div class="form-group">
    <div class="col-lg-offset-2 col-lg-10">
      <button type="submit" class="btn btn-success" onClick ="valProblemaUpdate($(&#34;#inputNombre&#34;).val(), $(&#34;#inputFL&#34;).val(), $(&#34;#inputDetalle&#34;).val(),<%= session.getAttribute( "idProblema" ) %>); return false;">Actualizar</button>
      <a class="btn btn-danger" onClick ="$('#borrar').show()">Elimiar</a>
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
