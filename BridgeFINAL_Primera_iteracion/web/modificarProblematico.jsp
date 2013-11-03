<%-- 
    Document   : modificarProblematico
    Created on : Oct 16, 2013, 11:20:02 PM
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
                    <a class="navbar-brand" href="problematico.jsp">Bridge</a>
                </div>
                <div class="collapse navbar-collapse">

                    <ul class="nav navbar-nav">

            <li class="active"><a href="modificarProblematico.jsp">Mis datos</a></li>                      

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
                    <h1>Mis Datos.</h1>
                    <p>Aquí puedes modificar tus datos, si es que te equivocaste en el registro o no te gusta algún dato.</p>
                </div>
                <div class="alert alert-success" style="display:none" id = "succes">Genial! tu aporte se ha guardado correctamente!</div>
          <div class="alert alert-danger alert-dismissable" style="display:none" id = "borrar">
        <a type="button" class="close" onClick ="$('#borrar').hide()" aria-hidden="true">×</a>
        <h4>¿Estás seguro?</h4>
        <p> Tus datos no podrán ser recuperados </p>
        <p>
          <a class="btn btn-danger" onClick ="eliminarProblematico(<%= session.getAttribute( "idProblematico" ) %>)" >Eliminar Problemático</a> <a class="btn btn-primary" onClick ="$('#borrar').hide()">Nah mejor no</a>
        </p>
      </div>
                <form class="form-horizontal" role="form" method="POST">
                    <div class="form-group" >
                        <label for="name" class="col-lg-2 control-label">Nombre</label>
                        <div class="col-lg-10">
                            <input type="text" class="form-control" id="nombreP" placeholder = "Ej. Juan Pérez">
                        </div>
                    </div>


                    <div class="form-group">                                        
                        <label for="empresa" class="col-lg-2 control-label">Empresa</label>
                        <div class="col-lg-10">
                            <input type="text" class="form-control" id="empresa" placeholder = "Ej. Microsoft">
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="email" class="col-lg-2 control-label">Correo</label>
                        <div class="col-lg-10">
                            <input type="email" class="form-control" id="correoP" placeholder = "Ej. lalolanda@outlok.com">
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="telefono" class="col-lg-2 control-label">Teléfono</label>
                        <div class="col-lg-10">
                            <input type="text" class="form-control" id="telefonoP" placeholder = "Ej. 2918 1092">
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="fechaP" class="col-lg-2 control-label">Fecha de Naciemiento</label>
                        <div class="col-lg-10">
                            <input type="text" class="form-control" id="fechaP">
                        </div>
                    </div>

                    <div class="form-group">

                        <label for="password" class="col-lg-2 control-label">Contraseña</label>
                        <div class="col-lg-10">
                            <input type="password" class="form-control" id="passwordP" placeholder = "Contraseña">
                        </div>
                    </div>
                    <div class="form-group">
    <script>         
      cargarDetallesProblematico(<%= session.getAttribute( "idProblematico" ) %>);      
</script>
  </div>
                    <div class="form-group">
                        <div class="col-lg-offset-2 col-lg-10">
                            <button type="submit" class="btn btn-success" onClick ="valProblematicoUpdate($(&#34;#nombreP&#34;).val(), $(&#34;#empresa&#34;).val(), $(&#34;#correoP&#34;).val(), $(&#34;#telefonoP&#34;).val(),  $(&#34;#fechaP&#34;).val(), $(&#34;#passwordP&#34;).val(),<%= session.getAttribute("idProblematico")%>); return false;">Actualizar</button>
                            <a class="btn btn-danger" onClick ="$('#borrar').show()">Eliminar</a>
                        </div>

                    </div>

                </form>
            </div><!--/span-->

            <div class="col-xs-6 col-sm-3 sidebar-offcanvas" id="sidebar" role="navigation">
                <div class="well sidebar-nav">
                    <ul class="nav">
                        <li>Usuario</li>
                        <li class="active"><a href="#"><span class="glyphicon glyphicon-cog"></span>Modificar Datos</a></li>
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
           $(window).load(function() {
               $("#fechaP").datepicker({dateFormat: 'yy-mm-dd'});
           });
    </script>
</body>
</html>


