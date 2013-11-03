function valProblema(name,area,fechaL,detalle,topicos,id){
  $("#succes").attr("style","display:none");
  var n = 0;
  if(topicos == "" || topicos == null){
       $("#inputTopico").val("");
       $("#succes").text("Un topicos por favor, separalos por un #, como en twitta!");
       $("#succes").attr("style","");
       $("#succes").attr("class","alert alert-danger"); 
       n = 1; 
  }
  if(detalle == "" || detalle == null){
       $("#inputDetalle").val("");
       $("#succes").text("Uuuhhmm... este... Detalle del problema por favor");
       $("#succes").attr("style","");
       $("#succes").attr("class","alert alert-danger");  
       n = 1;
  }
  if(fechaL == "" || fechaL == null){
       $("#inputFL").val("");
       $("#succes").text("Uuuhhmm... este... Fecha Limite por favor");
       $("#succes").attr("style","");
       $("#succes").attr("class","alert alert-danger");  
       n = 1;
  }
  if(area == "" || area == null){
       $("#inputArea").val("");
       $("#succes").text("Uuuhhmm... este... Area por favor");
       $("#succes").attr("style","");
       $("#succes").attr("class","alert alert-danger"); 
       n = 1; 
  }
  if(name == "" || name == null){
       $("#inputNombre").val("");
       $("#succes").text("Uuuhhmm... este... Titulo por favor");
       $("#succes").attr("style","");
       $("#succes").attr("class","alert alert-danger");  
       n = 1;
  }
  if(n==0){
    newProblema(name,area,fechaL,detalle,topicos,id);
  }
}

function valAporte(titulo,descripcion,costo,id,idc){
  $("#succes").attr("style","display:none");
  var n = 0;
  if(costo == "" || costo == null){
       $("#inputCosto").val("");
       $("#succes").text("Uuuhhmm... este... costo por favor");
       $("#succes").attr("style","");
       $("#succes").attr("class","alert alert-danger"); 
       n = 1; 
  }
  if(descripcion == "" || descripcion == null){
       $("#inputDetalle").val("");
       $("#succes").text("Uuuhhmm... este... descripcion del aporte por favor");
       $("#succes").attr("style","");
       $("#succes").attr("class","alert alert-danger");  
       n = 1;
  }
  if(titulo == "" || titulo == null){
       $("#inputTitulo").val("");
       $("#succes").text("Uuuhhmm... este... titulo por favor");
       $("#succes").attr("style","");
       $("#succes").attr("class","alert alert-danger"); 
       n = 1; 
  }
  
  if(n==0){
    newAporte(titulo,descripcion,costo,id,idc);
  }
}

function newAporte(titulo,descripcion,costo,id,idc){
    $.ajax({
  url: "saveAporte",
  type: "POST",
  data: {titulo:titulo,descripcion:descripcion,costo:costo,idProblema:id,idCreativo:idc},
  success:  function(response) { 
    //$("#success").text(""); 
    console.log(response);   
    console.log(typeof response);   
    console.log(response === "success");   
    console.log(response == "success");   
    if(response === "success"){
    //$("#success").text("Persona agregada Exitosamente!");
    $("#inputTitulo").val("");
    $("#inputDescripcion").val("");
    $("#inputCosto").val("");   
    $("#succes").attr("style","");
    $("#succes").attr("class","alert alert-success");
    $("#succes").text("Yay! el aporte se guardo exitosamente!");

  }else{
   $("#inputTitulo").val("");
    $("#inputDescripcion").val("");
    $("#inputCosto").val("");   
    $("#succes").attr("style","");
    $("#succes").attr("class","alert alert-danger");
    $("#succes").text("Nope! aquí hay un error");
  } 
}
});
}

function newProblema(name,area,fechaL,detalle,topicos,id){
    $.ajax({
  url: "saveProblema",
  type: "POST",
  data: {nombre:name,area:area,fechaL:fechaL,detalle:detalle,topicos:topicos,idProblematico:id},
  success:  function(response) { 
    //$("#success").text(""); 
    console.log(response);   
    console.log(typeof response);   
    console.log(response === "success");   
    console.log(response == "success");   
    if(response === "success"){
    //$("#success").text("Persona agregada Exitosamente!");
     $("#inputTopico").val("");
   $("#inputNombre").val("");
   $("#inputArea").val("");
    $("#inputFL").val("");
     $("#inputDetalle").val("");   
    $("#succes").attr("style","");
    $("#succes").attr("class","alert alert-success");
    $("#succes").text("Yay! el problema se guardo exitosamente!");

  }else{
   $("#inputTopico").val("");
   $("#inputNombre").val("");
   $("#inputArea").val("");
    $("#inputFL").val("");
     $("#inputDetalle").val("");   
    $("#succes").attr("style","");
    $("#succes").attr("class","alert alert-danger");
    $("#succes").text("Nope!");
  } 
}
});
}

function listaProblemas(id){
    $.ajax({
  url: "listaProblemas",
  type: "POST",
  data: {idP:id},
  success:  function(response) { 
  var p = new Array();
  p = response.split("\n"); 
  console.log(p.length);
  for (i=0;i<p.length-1;i++){
    var obj = jQuery.parseJSON(p[i]);
    console.log(obj.titulo);
    var desc = obj.descripcion;
    if(desc.length>230){
      desc = desc.substr(0,230) + " [...]"
    }

    $("#listaP").after('<div class=\"col-6 col-sm-6 col-lg-4\"><h2 id=\"t'+obj.idProblema+'\">'+obj.titulo+'</h2><p>'+desc+'</p><p><button class=\"btn btn-default\" onClick=\"detalleProblema('+obj.idProblema+')\">Detalles &raquo;</button><button class=\"dos btn btn-default\" onClick=\"aportesProblema('+obj.idProblema+')\">Aportes &raquo;</button></p></div><!--/span-->' );
  }
}
});
}

function listaProblemasCreativo(){
    $.ajax({
  url: "listaProblemasCreativo",
  type: "POST",
  data: {},
  success:  function(response) { 
  var p = new Array();
  p = response.split("\n"); 
  console.log(p.length);
  for (i=0;i<p.length-1;i++){
    var obj = jQuery.parseJSON(p[i]);
    console.log(obj.titulo);
    var desc = obj.descripcion;
    if(desc.length>230){
      desc = desc.substr(0,230) + " [...]"
    }
    $("#listaPC").after('<div class=\"col-6 col-sm-6 col-lg-4\"><h2 id=\"t'+obj.idProblema+'\">'+obj.titulo+'</h2><p>'+desc+'</p><p><button class=\"btn btn-default\" onClick=\"detalleProblemaC('+obj.idProblema+')\">Detalles &raquo;</button></p></div><!--/span-->' );
  }
}
});
}

function listaAportesCreativo(idC){
    $.ajax({
  url: "listaAportesCreativo",
  type: "POST",
  data: {idC:idC},
  success:  function(response) { 
  var p = new Array();
  p = response.split("\n"); 
  console.log(p.length);
  for (i=0;i<p.length-1;i++){
    var obj = jQuery.parseJSON(p[i]);
    console.log(obj.titulo);
    var desc = obj.descripcion;
    if(desc.length>230){
      desc = desc.substr(0,230) + " [...]"
    }
    $("#listaAC").after('<div class=\"col-6 col-sm-6 col-lg-4\"><h2 id=\"t'+obj.idAporte+'\">'+obj.titulo+'</h2><p>'+desc+'</p><p><button class=\"btn btn-default\" onClick=\"detalleAporte('+obj.idAporte+')\">Detalles &raquo;</button></p></div><!--/span-->' );
  }
}
});
}

function detalleAporte(id){
     $.ajax({
  url: "saveAporte.jsp",
  type: "POST",
  data: {idAporte:id},
  success:  function(response) { 
    detalleAporteAux();
}
});
}
function detalleAporteAux(){
  window.location.href="detalleAporteCreativo.jsp";
}

function detalleAporteProblematico(id){
     $.ajax({
  url: "saveAporte.jsp",
  type: "POST",
  data: {idAporte:id},
  success:  function(response) { 
    detalleAporteProblematicoAux();
}
});
}
function detalleAporteProblematicoAux(){
  window.location.href="detalleAporte.jsp";
}

function cargarDetallesAporteC(id){
$.ajax({
  url: "detallesAporte",
  type: "POST",
  data: {idAporte:id},
  success:  function(response) { 
            console.log(response);
    var obj = jQuery.parseJSON(response);
    console.log(obj);
    $("#inputTitulo").val(""+obj.titulo);   
    $("#inputFecha").val(""+obj.fecha);
    $("#inputDescripcion").val(""+obj.descripcion);
    $("#inputCosto").val(""+obj.costo);
    $("#inputProblema").text(""+obj.problema);
    $("#inputFI").prop('disabled', true);
    
}
});
}

function cargarDetallesAporte(id){
$.ajax({
  url: "detallesAporteProblematico",
  type: "POST",
  data: {idAporte:id},
  success:  function(response) { 
            console.log(response);
    var obj = jQuery.parseJSON(response);
    console.log(obj);
    $("#inputTitulo").val(""+obj.titulo);   
    $("#inputFecha").val(""+obj.fecha);
    $("#inputDescripcion").val(""+obj.descripcion);
    $("#inputCosto").val(""+obj.costo);
    $("#autor").text("Aporte hecho por: "+obj.autor);
    $("#inputFI").prop('disabled', true);
    if(obj.calificacion == 0){
     $("#like"+id).attr("style","");
    }else{
      $("#unlike"+id).attr("style","");
    }
}
});
}

function detalleProblema(id){
var name = $("#t"+id).text();
     $.ajax({
  url: "saveProblema.jsp",
  type: "POST",
  data: {idProblema:id,nombreProblema:name},
  success:  function(response) { 
    detalleProblemaAux()
}
});
}

function detalleProblemaAux(){
  window.location.href="detalleProblema.jsp";
}

function detalleProblemaC(id){
var name = $("#t"+id).text();
     $.ajax({
  url: "saveProblema.jsp",
  type: "POST",
  data: {idProblema:id,nombreProblema:name},
  success:  function(response) { 
    detalleProblemaCAux()
}
});
}


function detalleProblemaCAux(){
  window.location.href="detalleProblemaC.jsp";
}

function cargarDetallesProblema(id){
$.ajax({
  url: "detallesProblema",
  type: "POST",
  data: {idProblema:id},
  success:  function(response) { 
    var obj = jQuery.parseJSON(response);
    console.log(obj);
    $("#inputNombre").val(""+obj.titulo);   
    $("#inputDetalle").val(""+obj.descripcion);  
    $("#inputFI").val(""+obj.fI);
    $("#inputFL").val(""+obj.fL); 
    $("#inputFI").prop('disabled', true);
    
    
}
});
}


function valProblemaUpdate(name,fechaL,detalle,id){
  $("#succes").attr("style","display:none");
  var n = 0;
  if(detalle == "" || detalle == null){
       $("#inputDetalle").val("");
       $("#succes").text("Uuuhhmm... este... Detalle del problema por favor");
       $("#succes").attr("style","");
       $("#succes").attr("class","alert alert-danger");  
       n = 1;
  }
  if(fechaL == "" || fechaL == null){
       $("#inputFL").val("");
       $("#succes").text("Uuuhhmm... este... Fecha Limite por favor");
       $("#succes").attr("style","");
       $("#succes").attr("class","alert alert-danger");  
       n = 1;
  }
  if(name == "" || name == null){
       $("#inputNombre").val("");
       $("#succes").text("Uuuhhmm... este... Titulo por favor");
       $("#succes").attr("style","");
       $("#succes").attr("class","alert alert-danger");  
       n = 1;
  }

  if(n==0){
    updateProblema(name,fechaL,detalle,id);
  }
}


function updateProblema(name,fechaL,detalle,id){
$.ajax({
  url: "actualizarProblema",
  type: "POST",
  data: {nombre:name,fechaL:fechaL,detalle:detalle,idProblema:id},
  success:  function(response) { 
    if(response === "success"){
    //$("#success").text("Persona agregada Exitosamente!");     
    $("#succes").attr("style","");
    $("#succes").attr("class","alert alert-success");
    $("#succes").text("Yay! el problema se actualizo exitosamente!");

  }else{
   $("#inputTopico").val("");
   $("#inputNombre").val("");
   $("#inputArea").val("");
    $("#inputFL").val("");
     $("#inputDetalle").val("");   
    $("#succes").attr("style","");
    $("#succes").attr("class","alert alert-danger");
    $("#succes").text("Nope!");
  } 
}
});
}


function valAporteUpdate(titulo,descripcion,costo,id){
  $("#succes").attr("style","display:none");
  var n = 0;
  if(costo == "" || costo == null){
       $("#inputCosto").val("");
       $("#succes").text("Uuuhhmm... este... costo por favor");
       $("#succes").attr("style","");
       $("#succes").attr("class","alert alert-danger"); 
       n = 1; 
  }
  if(descripcion == "" || descripcion == null){
       $("#inputDetalle").val("");
       $("#succes").text("Uuuhhmm... este... descripcion del aporte por favor");
       $("#succes").attr("style","");
       $("#succes").attr("class","alert alert-danger");  
       n = 1;
  }
  if(titulo == "" || titulo == null){
       $("#inputTitulo").val("");
       $("#succes").text("Uuuhhmm... este... titulo por favor");
       $("#succes").attr("style","");
       $("#succes").attr("class","alert alert-danger"); 
       n = 1; 
  }
  
  if(n==0){
    updateAporte(titulo,descripcion,costo,id);
  }
}

function updateAporte(titulo,descripcion,costo,id){
    $.ajax({
  url: "actualizarAporte",
  type: "POST",
  data: {titulo:titulo,descripcion:descripcion,costo:costo,idAporte:id},
  success:  function(response) { 
    //$("#success").text(""); 
    console.log(response);   
    console.log(typeof response);   
    console.log(response === "success");   
    console.log(response == "success");   
    if(response === "success"){
    //$("#success").text("Persona agregada Exitosamente!"); 
    $("#succes").attr("style","");
    $("#succes").attr("class","alert alert-success");
    $("#succes").text("Yay! el aporte se actualizó exitosamente!");

  }else{
   $("#inputTitulo").val("");
    $("#inputDescripcion").val("");
    $("#inputCosto").val("");   
    $("#succes").attr("style","");
    $("#succes").attr("class","alert alert-danger");
    $("#succes").text("Nope! aquí hay un error");
  } 
}
});
}

function showElimiar(){
  $('#borrar').show(); // shows alert with Bootstrap CSS3 implem
}

function hideElimiar(){
  $('#borrar').hide();
}

function eliminarProblema(id){
$.ajax({
  url: "eliminarProblema",
  type: "POST",
  data: {idProblema:id},
  success:  function(response) { 
    if(response === "success"){
     
    $("#succes").attr("style","");
    $("#succes").attr("class","alert alert-success");
    $("#succes").text("Yay! el problema se elimino exitosamente!");
    window.location.href="listaProblemas.jsp";
  }else{
   $("#inputTopico").val("");
   $("#inputNombre").val("");
   $("#inputArea").val("");
    $("#inputFL").val("");
     $("#inputDetalle").val("");   
    $("#succes").attr("style","");
    $("#succes").attr("class","alert alert-danger");
    $("#succes").text("Nope!");
  } 
}
});
}

function eliminarAporte(id){
$.ajax({
  url: "eliminarAporte",
  type: "POST",
  data: {idAporte:id},
  success:  function(response) { 
    if(response === "success"){
    
    $("#succes").attr("style","");
    $("#succes").attr("class","alert alert-success");
    $("#succes").text("Yay! el aporte se elimino exitosamente!");
    window.location.href="listaAportesCreativo.jsp";
  }else{
 
    $("#succes").attr("style","");
    $("#succes").attr("class","alert alert-danger");
    $("#succes").text("Nope!");
  } 
}
});
}

function aportesProblema(id){
  var name = $("#t"+id).text();
  $.ajax({
  url: "saveProblema.jsp",
  type: "POST",
  data: {idProblema:id,nombreProblema:name},
  success:  function(response) {   
    window.location.href="listaAportes.jsp"; 
}
});
 
}

function showListaAportes(id){
   $.ajax({
  url: "listaAportes",
  type: "POST",
  data: {idProblema:id},
  success:  function(response) { 
  if(response =="" || response == null){
    $("#succes").attr("style","");
  }
  console.log(response);
  var p = new Array();
  p = response.split("\n"); 
  console.log(p.length);
  for (i=0;i<p.length-1;i++){
    var obj = jQuery.parseJSON(p[i]);
    console.log(obj.titulo);
    
    var desc = obj.descripcion;
    if(desc.length>230){
      desc = desc.substr(0,230) + " [...]"
    }
    if(obj.idAporteElegido == obj.idAporte){
      if(obj.calificacion == 0){
        $("#listaA").after('<div class=\"col-6 col-sm-6 col-lg-4\"><h2 id=\"t'+obj.idAporte+'\">'+obj.titulo+'</h2><h5><span class=\"label label-primary\">Este es el mero mero</span></h5><p>'+desc+'</p><p><button class=\"btn btn-default\" onClick=\"detalleAporteProblematico('+obj.idAporte+')\">Detalles &raquo;</button><a class=\"btn btn-primary\" onClick =\"likeAporte('+obj.idAporte+') ;\" id=\"like'+obj.idAporte+'\" style=\"\"><span class=\"glyphicon glyphicon-thumbs-up\"></span>Like</a><a type=\"submit\" class=\"btn btn-primary\" onClick =\"unlikeAporte('+obj.idAporte+');\" id=\"unlike'+obj.idAporte+'\" style=\"display:none\"><span class=\"glyphicon glyphicon-thumbs-down\"></span>Unlike</a></p></div><!--/span-->' );
      }else{
        $("#listaA").after('<div class=\"col-6 col-sm-6 col-lg-4\"><h2 id=\"t'+obj.idAporte+'\">'+obj.titulo+'</h2><h5><span class=\"label label-primary\">Este es el mero mero</span></h5><p>'+desc+'</p><p><button class=\"btn btn-default\" onClick=\"detalleAporteProblematico('+obj.idAporte+')\">Detalles &raquo;</button><a class=\"btn btn-primary\" onClick =\"likeAporte('+obj.idAporte+') ;\" id=\"like'+obj.idAporte+'\" style=\"display:none\"><span class=\"glyphicon glyphicon-thumbs-up\"></span>Like</a><a type=\"submit\" class=\"btn btn-primary\" onClick =\"unlikeAporte('+obj.idAporte+');\" id=\"unlike'+obj.idAporte+'\" style=\"\"><span class=\"glyphicon glyphicon-thumbs-down\"></span>Unlike</a></p></div><!--/span-->' );
      }
      
    }else{
      if(obj.calificacion == 0){
      $("#listaA").after('<div class=\"col-6 col-sm-6 col-lg-4\"><h2 id=\"t'+obj.idAporte+'\">'+obj.titulo+'</h2><p>'+desc+'</p><p><button class=\"btn btn-default\" onClick=\"detalleAporteProblematico('+obj.idAporte+')\">Detalles &raquo;</button><a class=\"btn btn-primary\" onClick =\"likeAporte('+obj.idAporte+') ;\" id=\"like'+obj.idAporte+'\" style=\"\"><span class=\"glyphicon glyphicon-thumbs-up\"></span>Like</a><a type=\"submit\" class=\"btn btn-primary\" onClick =\"unlikeAporte('+obj.idAporte+');\" id=\"unlike'+obj.idAporte+'\" style=\"display:none\"><span class=\"glyphicon glyphicon-thumbs-down\"></span>Unlike</a></p></div><!--/span-->' );
      }else{
      $("#listaA").after('<div class=\"col-6 col-sm-6 col-lg-4\"><h2 id=\"t'+obj.idAporte+'\">'+obj.titulo+'</h2><p>'+desc+'</p><p><button class=\"btn btn-default\" onClick=\"detalleAporteProblematico('+obj.idAporte+')\">Detalles &raquo;</button><a class=\"btn btn-primary\" onClick =\"likeAporte('+obj.idAporte+') ;\" id=\"like'+obj.idAporte+'\" style=\"display:none\"><span class=\"glyphicon glyphicon-thumbs-up\"></span>Like</a><a type=\"submit\" class=\"btn btn-primary\" onClick =\"unlikeAporte('+obj.idAporte+');\" id=\"unlike'+obj.idAporte+'\" style=\"\"><span class=\"glyphicon glyphicon-thumbs-down\"></span>Unlike</a></p></div><!--/span-->' );
      }
    }
    
  }
}
});
}

function newAporteJSP(){
  window.location.href="newAporte.jsp";
}

function likeAporte(id){
  $.ajax({
  url: "likeAporte",
  type: "POST",
  data: {idAporte:id},
  success:  function(response) {   
    if(response == "success"){
       $("#like"+id).attr("style","display:none");
       $("#unlike"+id).attr("style","");
    }else{
      $("#success").attr("style","");
    }
}
});
}
function unlikeAporte(id){
  $.ajax({
  url: "unlikeAporte",
  type: "POST",
  data: {idAporte:id},
  success:  function(response) {   
    if(response == "success"){
       $("#unlike"+id).attr("style","display:none");
       $("#like"+id).attr("style","");
    }else{
      $("#success").attr("style","");
    }
}
});
}

function elegirAporte(idA,idP){
  $.ajax({
  url: "elegirAporte",
  type: "POST",
  data: {idAporte:idA,idProblema:idP},
  success:  function(response) {   
    if(response == "success"){
       $("#success").text("El aporte se elegio de forma correcta");
       $("#success").attr("style","");
       $("#success").attr("class","alert alert-success");
       $('#elegir').hide();
    }else{
       $("#success").text("El aporte NO se elegio de forma correcta");
       $("#success").attr("style","");
       $("#success").attr("class","alert alert-danger");
       $('#elegir').hide();
    }
}
});
}

// Javier (Problemático y creativo)

function valProblematico(nombre, empresa, correo, telefono, fechaNac, contrasenia, contrasenia2) {
    $("#succes2").attr("style", "display:none");
    var n = 0;

    if (contrasenia2 != contrasenia) {
        $("#password2P").val("");
        $("#succes2").text("Las contraseñas no coinciden");
        $("#succes2").attr("style", "");
        $("#succes2").attr("class", "alert alert-danger");
        n = 1;
    }

    if (contrasenia2 == "" || contrasenia2 == null) {
        $("#password2P").val("");
        $("#succes2").text("Mmm... necesitamos que confirmes tu contraseña");
        $("#succes2").attr("style", "");
        $("#succes2").attr("class", "alert alert-danger");
        n = 1;
    }

    if (contrasenia == "" || contrasenia == null) {
        $("#passwordP").val("");
        $("#succes2").text("Ahora tu contraseña por favor...");
        $("#succes2").attr("style", "");
        $("#succes2").attr("class", "alert alert-danger");
        n = 1;
    }

    if (fechaNac == "" || fechaNac == null) {
        $("#fechaP").val("");
        $("#succes2").text("Sólo por curiosidad, ¿cuándo naciste?");
        $("#succes2").attr("style", "");
        $("#succes2").attr("class", "alert alert-danger");
        n = 1;
    }

    if (telefono == "" || telefono == null) {
        $("#telefonoP").val("");
        $("#succes2").text("¿Cómo te podremos contactar?");
        $("#succes2").attr("style", "");
        $("#succes2").attr("class", "alert alert-danger");
        n = 1;
    }

    if (correo == "" || correo == null || !validateEmail(correo)) {
        $("#correoP").val("");
        $("#succes2").text("Necesitas un correo válido");
        $("#succes2").attr("style", "");
        $("#succes2").attr("class", "alert alert-danger");
        n = 1;
    }

    if (empresa == "" || empresa == null) {
        $("#empresa").val("");
        $("#succes2").text("Necesito el nombre de tu empresa");
        $("#succes2").attr("style", "");
        $("#succes2").attr("class", "alert alert-danger");
        n = 1;
    }

    if (nombre == "" || nombre == null) {
        $("#nombreP").val("");
        $("#succes2").text("Debes elegir un buen nombre!");
        $("#succes2").attr("style", "");
        $("#succes2").attr("class", "alert alert-danger");
        n = 1;
    }

    if (n == 0) {
        newProblematico(nombre, empresa, correo, telefono, fechaNac, contrasenia);
    }
}

function newProblematico(nombre, empresa, correo, telefono, fechaNac, contrasenia) {
    $.ajax({
        url: "saveProblematico",
        type: "POST",
        data: {nombre: nombre, empresa: empresa, correo: correo, telefono: telefono, fechaNac: fechaNac, contrasenia: contrasenia},
        success: function(response) {
            //$("#success").text(""); 
            console.log(response);
            console.log(typeof response);
            console.log(response === "success");
            console.log(response == "success");
            if (response === "success") {
                //$("#success").text("Persona agregada Exitosamente!");
                $("#nombreP").val("");
                $("#empresa").val("");
                $("#correoP").val("");
                $("#fechaP").val("");
                $("#telefonoP").val("");
                $("#passwordP").val("");
                $("#password2P").val("");
                $("#succes2").attr("style", "");
                $("#succes2").attr("class", "alert alert-success");
                $("#succes2").text("Yay! el problematico fue registrado exitosamente!");

            } else {
                $("#nombreP").val("");
                $("#empresa").val("");
                $("#correoP").val("");
                $("#fechaP").val("");
                $("#telefonoP").val("");
                $("#passwordP").val("");
                $("#password2P").val("");
                $("#succes2").attr("style", "");
                $("#succes2").attr("class", "alert alert-danger");
                $("#succes2").text("Correo duplicado o ya registrado como creativo");
            }
        }
    });
}

function valProblematicoUpdate(nombre, empresa, correo, telefono, fechaNac, contrasenia,id) {
    $("#succes").attr("style", "display:none");
    var n = 0;

    if (contrasenia == "" || contrasenia == null) {
        $("#passwordP").val("");
        $("#succes").text("Ahora tu contraseña por favor...");
        $("#succes").attr("style", "");
        $("#succes").attr("class", "alert alert-danger");
        n = 1;
    }

    if (fechaNac == "" || fechaNac == null) {
        $("#fechaP").val("");
        $("#succes").text("Sólo por curiosidad, ¿cuándo naciste?");
        $("#succes").attr("style", "");
        $("#succes").attr("class", "alert alert-danger");
        n = 1;
    }

    if (telefono == "" || telefono == null) {
        $("#telefonoP").val("");
        $("#succes").text("¿Cómo te podremos contactar?");
        $("#succes").attr("style", "");
        $("#succes").attr("class", "alert alert-danger");
        n = 1;
    }

    if (correo == "" || correo == null || !validateEmail(correo)) {
        $("#correoP").val("");
        $("#succes").text("Necesitas un correo válido");
        $("#succes").attr("style", "");
        $("#succes").attr("class", "alert alert-danger");
        n = 1;
    }

    if (empresa == "" || empresa == null) {
        $("#empresa").val("");
        $("#succes").text("Necesito el nombre de tu empresa");
        $("#succes").attr("style", "");
        $("#succes").attr("class", "alert alert-danger");
        n = 1;
    }

    if (nombre == "" || nombre == null) {
        $("#nombreP").val("");
        $("#succes").text("Debes elegir un buen nombre!");
        $("#succes").attr("style", "");
        $("#succes").attr("class", "alert alert-danger");
        n = 1;
    }

    if (n == 0) {
        updateProblematico(nombre, empresa, correo, telefono, fechaNac, contrasenia,id);
    }
}

function updateProblematico(nombre, empresa, correo, telefono, fechaNac, contrasenia,id) {
    $.ajax({
        url: "updateProblematico",
        type: "POST",
        data: {nombre: nombre, empresa: empresa, correo: correo, telefono: telefono, fechaNac: fechaNac, contrasenia: contrasenia, idProblematico:id},
        success: function(response) {
            //$("#success").text(""); 
            console.log(response);
            console.log(typeof response);
            console.log(response === "success");
            console.log(response == "success");
            if (response === "success") {
                //$("#success").text("Persona agregada Exitosamente!");
                $("#succes").attr("style", "");
                $("#succes").attr("class", "alert alert-success");
                $("#succes").text("Genial! tus datos se han guardado correctamente!");

            } else {
                $("#succes").attr("style", "");
                $("#succes").attr("class", "alert alert-danger");
                $("#succes").text("Nope!");
            }
        }
    });
}

function valCreativoUpdate(nombre, carrera, correo, telefono, fechaNac, id) {
    $("#succes").attr("style", "display:none");
    var n = 0;

    if (fechaNac == "" || fechaNac == null) {
        $("#fechaC").val("");
        $("#succes").text("Sólo por curiosidad, ¿cuándo naciste?");
        $("#succes").attr("style", "");
        $("#succes").attr("class", "alert alert-danger");
        n = 1;
    }

    if (telefono == "" || telefono == null) {
        $("#telefonoC").val("");
        $("#succes").text("¿Cómo te podremos contactar?");
        $("#succes").attr("style", "");
        $("#succes").attr("class", "alert alert-danger");
        n = 1;
    }

    if (correo == "" || correo == null || !validateEmail(correo)) {
        $("#correoP").val("");
        $("#succes").text("Necesitas un correo válido");
        $("#succes").attr("style", "");
        $("#succes").attr("class", "alert alert-danger");
        n = 1;
    }

    if (carrera == "" || carrera == null) {
        $("#carrera").val("");
        $("#succes").text("¿De qué carrera eres?");
        $("#succes").attr("style", "");
        $("#succes").attr("class", "alert alert-danger");
        n = 1;
    }

    if (nombre == "" || nombre == null) {
        $("#nombreP").val("");
        $("#succes").text("Debes elegir un buen nombre!");
        $("#succes").attr("style", "");
        $("#succes").attr("class", "alert alert-danger");
        n = 1;
    }
    

    if (n == 0) {
        updateCreativo(nombre, carrera, correo, telefono, fechaNac,id);
    }
}

function updateCreativo(nombre, carrera, correo, telefono, fechaNac,id) {
    $.ajax({
        url: "updateCreativo",
        type: "POST",
        data: {nombre: nombre, carrera:carrera, correo: correo, telefono: telefono, fechaNac: fechaNac,idC:id},
        success: function(response) {
            //$("#success").text(""); 
            console.log(response);
            console.log(typeof response);
            console.log(response === "success");
            console.log(response == "success");
            if (response === "success") {
                //$("#success").text("Persona agregada Exitosamente!");
                $("#succes").attr("style", "");
                $("#succes").attr("class", "alert alert-success");
                $("#succes").text("Genial! tus datos se han guardado correctamente!");

            } else {
                $("#succes").attr("style", "");
                $("#succes").attr("class", "alert alert-danger");
                $("#succes").text("Nope!");
            }
        }
    });
}

function modificarProblematicoAux() {
    window.location.href = "modificarProblematico.jsp";
}

function modificarCreativoAux() {
    window.location.href = "modificarCreativo.jsp";
}

function valLogin(correo, contrasenia) {
    $("#succes2").attr("style", "display:none");
    var n = 0;
    if (correo == "" || correo == null) {
        $("#loginEmail").val("");
        $("#divLogIn1").addClass("has-error");
        $("#loginEmail").attr("placeholder", "Email: Escribe uno");
        n = 1;
    }

    if (contrasenia == "" || contrasenia == null) {
        $("#loginPwrd").val("");
        $("#divLogIn2").addClass("has-error");
        $("#loginPwrd").attr("placeholder", "Pswrd: Escribe uno");
        n = 1;
    }
    if (n == 0) {
        login(correo, contrasenia);
    }
}

function login(correo, contrasenia) {
    $.ajax({
        url: "login",
        type: "POST",
        data: {correo: correo, contrasenia: contrasenia},
        success: function(response) {
            //$("#success").text(""); 
            console.log(response);
            console.log(typeof response);
            if (response == 0) {
                //$("#success").text("Persona agregada Exitosamente!");
                $("#loginEmail").val("");
                $("#divLogIn1").addClass("has-error");
                $("#loginEmail").attr("placeholder", "Error: no registrado");
                $("#loginPwrd").val("");
                $("#divLogIn2").addClass("has-error");
                $("#loginPwrd").attr("placeholder", "Error: no registrado");
            }
            if (response > 0) {
                var id = response - 100;
                $.ajax({
                    url: "saveProblematico.jsp",
                    type: "POST",
                    data: {idProblematico: id},
                    success: function(response) {
                        pantallaProblematicoAux();
                    }
                });
            }
            if (response < 0) {
                var id = Math.abs(response - (-100));
                $.ajax({
                    url: "saveCreativo.jsp",
                    type: "POST",
                    data: {idCreativo: id},
                    success: function(response) {
                        pantallaCreativoAux();
                    }
                });
            }
        }
    });
}

function logout(){
      $.ajax({
        url: "logout.jsp",
        type: "POST",
        data: {},
        success: function(response) {
            window.location.href = "index.jsp";
        }
    });
}

function pantallaProblematicoAux() {
    window.location.href = "problematico.jsp";
}

function pantallaCreativoAux() {
    window.location.href = "creativo.jsp";
}
function validateEmail(email) { 
    var re = /\S+@\S+\.\S+/;
    return re.test(email);   
} 
function valCreativo(nombre, carrera, fechaNac, correo, telefono, contrasenia, contrasenia2) {
    $("#succes").attr("style", "display:none");
    var n = 0;
    console.log(validateEmail(correo));
    if (contrasenia2 == "" || contrasenia2 == null) {
        $("#password").val("");
        $("#succes").text("Confirma tu contraseña");
        $("#succes").attr("style", "");
        $("#succes").attr("class", "alert alert-danger");
        n = 1;
    }
    if (contrasenia == "" || contrasenia == null) {
        $("#password").val("");
        $("#succes").text("Ahora tu contraseña por favor...");
        $("#succes").attr("style", "");
        $("#succes").attr("class", "alert alert-danger");
        n = 1;
    }
    if (telefono == "" || telefono == null) {
        $("#name").val("");
        $("#succes").text("Necesitamos tener contacto contigo");
        $("#succes").attr("style", "");
        $("#succes").attr("class", "alert alert-danger");
        n = 1;
    }
    if (correo == "" || correo == null || !validateEmail(correo)) {
        $("#email1").val("");
        $("#succes").text("Necesitas un correo válido");
        $("#succes").attr("style", "");
        $("#succes").attr("class", "alert alert-danger");
        n = 1;
    }
    if (fechaNac == "" || fechaNac == null) {
        $("#name").val("");
        $("#succes").text("¿Cuándo naciste?");
        $("#succes").attr("style", "");
        $("#succes").attr("class", "alert alert-danger");
        n = 1;
    }
    if (carrera == "" || carrera == null) {
        $("#name").val("");
        $("#succes").text("Tu carrera por favor");
        $("#succes").attr("style", "");
        $("#succes").attr("class", "alert alert-danger");
        n = 1;
    }
    if (nombre == "" || nombre == null) {
        $("#name").val("");
        $("#succes").text("Debes elegir un buen nombre!");
        $("#succes").attr("style", "");
        $("#succes").attr("class", "alert alert-danger");
        n = 1;
    }
    if (n == 0) {
        newCreativo(nombre, carrera, fechaNac, correo, telefono, contrasenia, contrasenia2);
    }
}

function newCreativo(nombre, carrera, fechaNac, correo, telefono, contrasenia, contrasenia2) {
    $.ajax({
        url: "saveCreativo",
        type: "POST",
        data: {nombre: nombre, carrera: carrera, fechaNac: fechaNac, correo: correo, telefono: telefono, contrasenia: contrasenia, contrasenia2: contrasenia2},
        success: function(response) {
            //$("#success").text(""); 
            console.log(response);
            console.log(typeof response);
            console.log(response === "success");
            console.log(response == "success");
            if (response === "success") {
                //$("#success").text("Persona agregada Exitosamente!");
                $("#nombreC").val("");
                $("#carrera").val("");
                $("#fecha").val("");
                $("#correoC").val("");
                $("#telefonoC").val("");
                $("#passwordC").val("");
                $("#password2C").val("");
                $("#succes").attr("style", "");
                $("#succes").attr("class", "alert alert-success");
                $("#succes").text("Yay! el creativo fue registrado exitosamente!");

            } else {
                $("#nombreC").val("");
                $("#carrera").val("");
                $("#fecha").val("");
                $("#correoC").val("");
                $("#telefonoC").val("");
                $("#passwordC").val("");
                $("#password2C").val("");
                $("#succes").attr("style", "");
                $("#succes").attr("class", "alert alert-danger");
                $("#succes").text("Correo duplicado y ya registrado como problematico");
            }
        }
    });
}

function eliminarProblematico(id) {
    $.ajax({
        url: "eliminarProblematico",
        type: "POST",
        data: {idProblematico: id},
        success: function(response) {
            if (response === "success") {
                //$("#success").text("Persona agregada Exitosamente!");     
                $("#succes").attr("style", "");
                $("#succes").attr("class", "alert alert-success");
                $("#succes").text("Yay! el problematico se elimino exitosamente!");
                window.location.href = "index.jsp";
            } else {
                $("#succes").attr("style", "");
                $("#succes").attr("class", "alert alert-danger");
                $("#succes").text("Nope!");
            }
        }
    });
}

function eliminarCreativo(id) {
    $.ajax({
        url: "eliminarCreativo",
        type: "POST",
        data: {idCreativo: id},
        success: function(response) {
            if (response === "success") {
                //$("#success").text("Persona agregada Exitosamente!");     
                $("#succes").attr("style", "");
                $("#succes").attr("class", "alert alert-success");
                $("#succes").text("Yay! el creativo se eliminó exitosamente!");
                window.location.href = "index.jsp";
            } else {
                $("#succes").attr("style", "");
                $("#succes").attr("class", "alert alert-danger");
                $("#succes").text("Nope!");
            }
        }
    });
}

function cargarDetallesProblematico(id){
$.ajax({
  url: "detallesProblematico",
  type: "POST",
  data: {idProblematico:id},
  success:  function(response) { 
            console.log(response);
    var obj = jQuery.parseJSON(response);
    console.log(obj);
    $("#nombreP").val(""+obj.nombre);   
    $("#empresa").val(""+obj.empresa);
    $("#correoP").val(""+obj.correo);
    $("#telefonoP").val(""+obj.telefono);
    $("#fechaP").val(""+obj.fechaNac);
    
}
});
}

function cargarDetallesCreativo(id){
$.ajax({
  url: "detallesCreativo",
  type: "POST",
  data: {idCreativo:id},
  success:  function(response) { 
            console.log(response);
    var obj = jQuery.parseJSON(response);
    console.log(obj);
    $("#nombreP").val(""+obj.nombre);   
    $("#carrera").val(""+obj.carrera);
    $("#correoP").val(""+obj.correo);
    $("#telefonoC").val(""+obj.telefono);
    $("#fechaC").val(""+obj.fechaNac);
}
});
}

