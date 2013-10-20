/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sango
 */
public class ProblemaBD {
    
    Conexion cn;
    
    public ProblemaBD(){
        cn = new Conexion();
    }
    
    public boolean newProblema(String titulo, String descripcion, String fechaI, String fechaF,Integer idp){
                boolean estado = false;
        try {
         Connection con = cn.getConexion();
         // Instrucci�n SQL para obtener los datos
         // del usuario indicado :
         String query = "insert into problema (titulo,descripcion,fechaInicio,fechaLimite,idProblematicoFK ) values('"+titulo+"','"+descripcion+"','"+fechaI+"','"+fechaF+"','"+idp+"')";
         Statement st = con.createStatement();
         int rs = st.executeUpdate( query );
         estado = true;
         cn.cierraConexion( con );
        }
         catch( Exception e ) {
             e.printStackTrace();
         }
        finally {
            return estado;
        }
    }
    //no estoy seguro de que esto funcione
    public String getTitulo(Integer idp){
        
        //Validaciones
        String titulo="";        
        try {
         Connection con = cn.getConexion();
         // Instrucci�n SQL para obtener los datos
         // del usuario indicado :
         String query = "SELECT titulo FROM problema WHERE idProblema ="+idp+")";
         Statement st = con.createStatement();
         ResultSet rs = st.executeQuery( query );
         titulo = rs.getString("titulo");
         cn.cierraConexion( con );
        }
         catch( Exception e ) {
             e.printStackTrace();
         }
        finally {
            return titulo;
        }
    }
    
    public boolean updateProblema(String titulo, String descripcion, String fechaF,Integer id){
        
        //Validaciones
                boolean estado = false;
        try {
         Connection con = cn.getConexion();
         // Instrucci�n SQL para obtener los datos
         // del usuario indicado :
         String query = "UPDATE problema SET titulo = '"+titulo+"', descripcion = '"+descripcion+"', fechaLimite = '"+fechaF+"' WHERE idProblema = "+id;
         Statement st = con.createStatement();
         int rs = st.executeUpdate( query );
         estado = true;
         cn.cierraConexion( con );
        }
         catch( Exception e ) {
             e.printStackTrace();
         }
        finally {
            return estado;
        }
    }
    public boolean deleteProblema(Integer id){
        
        //Validaciones
                boolean estado = false;
        try {
         Connection con = cn.getConexion();
         // Instrucci�n SQL para obtener los datos
         // del usuario indicado :
         String query = "DELETE FROM problema WHERE idProblema ="+id;
         Statement st = con.createStatement();
         int rs = st.executeUpdate( query );
         estado = true;
         cn.cierraConexion( con );
        }
         catch( Exception e ) {
             e.printStackTrace();
         }
        finally {
            return estado;
        }
    }
    public List<Problema> getListaProblemas(Integer idp){
        
        //Validaciones
         List<Problema> Problemas = null;  
        try {
          
         Problemas = new ArrayList<>();
         Connection con = cn.getConexion();
         // Instrucci�n SQL para obtener los datos
         // del usuario indicado :
         String query = "SELECT titulo,descripcion,idProblema FROM problema WHERE idProblematicoFK ='"+idp+"'";
         Statement st = con.createStatement();
         ResultSet rs = st.executeQuery( query );
         while(rs.next()){
             String titulo = rs.getString("titulo");
             String descripcion = rs.getString("descripcion");
             Integer id = rs.getInt("idProblema");
             Problema p = new Problema(titulo,descripcion,id);
             Problemas.add(p);
         }
         
         cn.cierraConexion( con );
        }
         catch( Exception e ) {
             e.printStackTrace();
         }
        finally {
            return Problemas;
        }
    }
    public Problema getDetallesProblema(Integer idp){
        
        //Validaciones    
        Problema p = null;
        try {             
         Connection con = cn.getConexion();
         // Instrucci�n SQL para obtener los datos
         // del usuario indicado :
         String query = "SELECT titulo,descripcion,fechaInicio,fechaLimite,idProblema FROM problema WHERE idProblema ='"+idp+"'";
         Statement st = con.createStatement();
         ResultSet rs = st.executeQuery( query );
         rs.next();
             String titulo = rs.getString("titulo");
             String descripcion = rs.getString("descripcion");
             Integer id = rs.getInt("idProblema");
             String fi = rs.getString("fechaInicio");
             String fl = rs.getString("fechaLimite");
             p = new Problema(titulo,descripcion,id,fi,fl);
             cn.cierraConexion( con );
             return p;

        }
         catch( Exception e ) {
             e.printStackTrace();
         }
        finally {
            return p;
        }
    }
    public boolean setAporte(Integer idp, Integer ida){
        
        //Validaciones
                boolean estado = false;
        try {
         Connection con = cn.getConexion();
         // Instrucci�n SQL para obtener los datos
         // del usuario indicado :
         String query = "UPDATE problema SET idAporteFK = '"+ida+"' WHERE idAporte = "+idp;
         Statement st = con.createStatement();
         int rs = st.executeUpdate( query );
         estado = true;
         cn.cierraConexion( con );
        }
         catch( Exception e ) {
             e.printStackTrace();
         }
        finally {
            return estado;
        }
    }
}
