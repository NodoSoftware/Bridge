<%-- 
    Document   : saveCreativo
    Created on : 22/10/2013, 01:53:43 PM
    Author     : Javier
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
   String id = request.getParameter( "idCreativo" );
   String name = request.getParameter( "nombreCreativo" );
   session.setAttribute( "idCreativo", id );
   session.setAttribute( "nombreCreativo", name );
%>
