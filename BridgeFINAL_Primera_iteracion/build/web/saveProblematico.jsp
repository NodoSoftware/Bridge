<%-- 
    Document   : saveProblematico
    Created on : 22/10/2013, 01:48:04 PM
    Author     : Javier
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
   String id = request.getParameter( "idProblematico" );
   String name = request.getParameter( "nombreProblematico" );
   session.setAttribute( "idProblematico", id );
   session.setAttribute( "nombreProblematico", name );
%>
