function valProblema(name,area,fechaL,detalle,topicos){
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
    newProblema(name,area,fechaL,detalle,topicos);
  }
}

function newProblema(name,area,fechaL,detalle,topicos){
    $.ajax({
  url: "saveProblema",
  type: "POST",
  data: {nombre:name,area:area,fechaL:fechaL,detalle:detalle,topicos:topicos},
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
    //$("#success").text("Persona agregada Exitosamente!");     
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

function aportesProblema(id){
  window.location.href="listaAportes.jsp";
}

function showListaAportes(id){
   $.ajax({
  url: "listaAportes",
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

    $("#listaA").after('<div class=\"col-6 col-sm-6 col-lg-4\"><h2 id=\"t'+obj.idProblema+'\">'+obj.titulo+'</h2><p>'+desc+'</p><p><button class=\"btn btn-default\" onClick=\"detalleAporte('+obj.idProblema+')\">Detalles &raquo;</button></p></div><!--/span-->' );
  }
}
});
}