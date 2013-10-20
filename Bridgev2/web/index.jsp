<%-- 
    Document   : index
    Created on : Oct 15, 2013, 8:47:35 PM
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

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="../../assets/js/html5shiv.js"></script>
      <script src="../../assets/js/respond.min.js"></script>
    <![endif]-->
    <style type="text/css">
    body {
  padding-top: 50px;
  padding-bottom: 20px;
}
  .jumbotron{
    background-image:url('img/banner2.png');
    color: #ecf0f1;
  }
    </style>
  </head>

  <body>

    <div class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">Bridge</a>
        </div>
        <div class="navbar-collapse collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="#">Home</a></li>                      
          </ul>
          <form class="navbar-form navbar-right">
            <div class="form-group">
              <input type="text" placeholder="Email" class="form-control">
            </div>
            <div class="form-group">
              <input type="password" placeholder="Password" class="form-control">
            </div>
            <button type="submit" class="btn btn-success">Sign in</button>
          </form>
        </div><!--/.navbar-collapse -->
      </div>
    </div>

    <!-- Main jumbotron for a primary marketing message or call to action -->
    <div class="jumbotron">
      <div class="container">
        <h1>Creativos vs Problematicos!</h1>
        <p> Work in progress.Tener Conocimiento es tener la respuesta correcta, Tener Inteligencia es hacer la pregunta correcta . Go ahead and sign up with the button just below, all the cool kids are doing it.</p>
        <p><a data-toggle="modal" href="#modalCreativo" class="btn btn-primary btn-lg">Registro Creativo &raquo;</a><a data-toggle="modal" href="#modalProblematico" class="btn btn-primary btn-lg"style="margin-left: 20px;">Registro Problematico &raquo;</a></p>
      </div>
    </div>

    <div class="container">
      <!-- Example row of columns -->
      <div class="row">
        <div class="col-lg-4">
          <img src="imgI/PNG/Tools.png" alt="..." class="img-rounded" id = "i1">
          <h2>Problematico</h2>
          <p>Donec rtyjs. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>
          <p><a class="btn btn-default" href="#">View details &raquo;</a></p>
        </div>
        <div class="col-lg-4">
          <img src="imgI/PNG/Search.png" alt="..." class="img-rounded" id = "i2">
          <h2>Creativo</h2>
          <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>
          <p><a class="btn btn-default" href="#">View details &raquo;</a></p>
       </div>
        <div class="col-lg-4">
          <img src="imgI/PNG/Trophy.png" alt="..." class="img-rounded" id = "i3">
          <h2>Brave New World</h2>
          <p>Donec sed odio dui. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Vestibulum id ligula porta felis euismod semper. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.</p>
          <p><a class="btn btn-default" href="#">View details &raquo;</a></p>
        </div>
      </div>

      <hr>

      <footer>
        <p>&copy; Nodo Software 2013</p>
      </footer>
    </div> <!-- /container -->
     <!-- Button trigger modal -->
 

  <!-- Modal Creativo -->
  <div class="modal fade" id="modalCreativo" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
          <h4 class="modal-title">Registro Creativos</h4>
        </div>
        <div class="modal-body" >
          <div class="alert alert-success" style="display:none" id = "succes">Now you are in, please thank the internet</div>
          
                                              <form class="form-horizontal" role="form">
                                                <div class="form-group" id = "gname">
                                        <label for="name" class="col-lg-2 control-label">Name</label>
                                        <div class="col-lg-10">
                                          <input type="text" class="form-control" id="name" placeholder="or Steam Name ">
                                        </div>
                                      </div>
                                      <div class="form-group" id = "gemail">
                                        
                                        <label for="email" class="col-lg-2 control-label">Email</label>
                                        <div class="col-lg-10">
                                          <input type="email" class="form-control" id="email1" placeholder="Email">
                                        </div>
                                      </div>
                                      <div class="form-group" id = "gpassword">
                                       
                                        <label for="password" class="col-lg-2 control-label">Password</label>
                                        <div class="col-lg-10">
                                          <input type="password" class="form-control" id="password" placeholder="Password">
                                        </div>
                                      </div>
                                      <div class="form-group">
                                        <label for="password2" class="col-lg-2 control-label">Password, again</label>
                                        <div class="col-lg-10">
                                          <input type="password" class="form-control" id="password2" placeholder="you know, just to be sure">
                                        </div>
                                      </div>
                                      <div class="form-group">
                                        <div class="col-lg-offset-2 col-lg-10">
                                          <button type="submit" class="btn btn-success" >All set, GO!</button>
                                        </div>
                                      </div>
                                    </form>
        </div>
        
      </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
  </div><!-- /.modal -->

<!-- Modal Problematico -->
  <div class="modal fade" id="modalProblematico" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
          <h4 class="modal-title">Registro Problematicos</h4>
        </div>
        <div class="modal-body" >
          <div class="alert alert-success" style="display:none" id = "succes">Now you are in, please thank the internet</div>
          
                                              <form class="form-horizontal" role="form">
                                                <div class="form-group" id = "gname">
                                        <label for="name" class="col-lg-2 control-label">Name</label>
                                        <div class="col-lg-10">
                                          <input type="text" class="form-control" id="name" placeholder="or Steam Name ">
                                        </div>
                                      </div>
                                      <div class="form-group" id = "gemail">
                                        
                                        <label for="email" class="col-lg-2 control-label">Email</label>
                                        <div class="col-lg-10">
                                          <input type="email" class="form-control" id="email1" placeholder="Email">
                                        </div>
                                      </div>
                                      <div class="form-group" id = "gpassword">
                                       
                                        <label for="password" class="col-lg-2 control-label">Password</label>
                                        <div class="col-lg-10">
                                          <input type="password" class="form-control" id="password" placeholder="Password">
                                        </div>
                                      </div>
                                      <div class="form-group">
                                        <label for="password2" class="col-lg-2 control-label">Password, again</label>
                                        <div class="col-lg-10">
                                          <input type="password" class="form-control" id="password2" placeholder="you know, just to be sure">
                                        </div>
                                      </div>
                                      <div class="form-group">
                                        <div class="col-lg-offset-2 col-lg-10">
                                          <button type="submit" class="btn btn-success" >All set, GO!</button>
                                        </div>
                                      </div>
                                    </form>
        </div>
        
      </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
  </div><!-- /.modal -->
    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->   
    <script src="script/register.js"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    
  </body>
</html>
