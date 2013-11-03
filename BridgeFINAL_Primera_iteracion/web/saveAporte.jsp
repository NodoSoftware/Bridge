<%-- 
    Document   : saveAporte
    Created on : 20/10/2013, 08:41:34 PM
    Author     : drosas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
   
   String idA = request.getParameter( "idAporte" );
  
   session.setAttribute( "idAporte", idA );
  
%>