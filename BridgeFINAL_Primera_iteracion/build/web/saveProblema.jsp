<%-- 
    Document   : saveProblema
    Created on : Oct 16, 2013, 11:13:35 PM
    Author     : Deus Ex Machina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
   String id = request.getParameter( "idProblema" );
   String name = request.getParameter( "nombreProblema" );
   session.setAttribute( "idProblema", id );
   session.setAttribute( "nombreProblema", name );
%>
