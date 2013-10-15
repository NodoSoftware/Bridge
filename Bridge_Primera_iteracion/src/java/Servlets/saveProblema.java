/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Model.Problema;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Deus Ex Machina
 */
public class saveProblema extends HttpServlet {
    Problema problema;
    
    public saveProblema(){
        problema = new Problema();
    }
    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet updateProblema</title>");            
            out.println("</head>");
            out.println("<body>");
             String tmp ="";
            String name =request.getParameter("nombre");
            String detail=request.getParameter("detalle");
            String dateL=request.getParameter("fechaL");
            String area=request.getParameter("area");
            String topic=request.getParameter("topicos");
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
            Date date;
            date = new Date();
            System.out.println(dateFormat.format(date));
            if(problema.newProblema(name, detail, dateFormat.format(date), dateL, 1)){
                System.out.println("succes");
            }else{
                System.out.println("fail");
            }
         /*   
        for (Enumeration<String> params = request.getParameterNames(); params.hasMoreElements();){
            tmp = params.nextElement();
        out.println(tmp + ": " + request.getParameter(tmp) + "<br>");
        if( "nombre".equals(tmp)){
         name = request.getParameter(tmp);
        }
        if(tmp == "area"){
         area = request.getParameter(tmp);
        }
        if(tmp == "detalle"){
         detial = request.getParameter(tmp);
        }
        if(tmp == "fechaL"){
         dateL = request.getParameter(tmp);
        }
        if(tmp == "tipico"){
         topic = request.getParameter(tmp);
        }
                out.println("name:"+name);
        }
       */
            out.println(name);
            out.println(detail);
            out.println(dateL);
            out.println(area);
            out.println(topic);
            
            out.println("<h1>Servlet updateProblema at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
