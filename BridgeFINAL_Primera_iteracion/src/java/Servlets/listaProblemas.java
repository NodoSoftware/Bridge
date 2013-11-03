/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Model.Problema;
import Model.ProblemaBD;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.ListIterator;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Deus Ex Machina
 */
public class listaProblemas extends HttpServlet {
ProblemaBD problema;
    
    public listaProblemas(){
        problema = new ProblemaBD();
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
        PrintWriter out = response.getWriter();
        List<Problema> Problemas;
        try {
            /* TODO output your page here. You may use following sample code. */
           String idP =request.getParameter("idP");
           Problemas = problema.getListaProblemas(Integer.parseInt(idP));
            ListIterator<Problema> listaProblemas = Problemas.listIterator();
            
    
           while(listaProblemas.hasNext()){
               Problema p = listaProblemas.next();
                //out.println("<div class=\"col-6 col-sm-6 col-lg-4\">");
                //out.println("<h2>"+p.getTitulo()+"</h2>");
                //out.println("<p>"+p.getDesc()+"</p>");
                //out.println("<p><a class=\"btn btn-default\" href=\"#\">Detalles &raquo;</a></p>");
                //out.println("</div><!--/span-->");
                Gson gson = new Gson();
                out.println(gson.toJson(p)); 
           }
            
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
