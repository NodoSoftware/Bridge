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
 * @author Deus Ex Machina
 */
public class AporteBD {
    Conexion cn;
    
    public AporteBD(){
        cn = new Conexion();
    }
     public List<Aporte> getListaAportes(Integer idp){
        
        //Validaciones
         List<Aporte> Aportes = null;  
        try {
          
         Aportes = new ArrayList<>();
         Connection con = cn.getConexion();
         // Instrucci�n SQL para obtener los datos
         // del usuario indicado :
         String query = "SELECT titulo,descripcion,idAporte FROM aporte WHERE idProblemaFK ='"+idp+"'";
         Statement st = con.createStatement();
         ResultSet rs = st.executeQuery( query );
         while(rs.next()){
             String titulo = rs.getString("titulo");
             String descripcion = rs.getString("descripcion");
             Integer id = rs.getInt("idProblema");
             Aporte p = new Aporte(titulo,descripcion,id);
             Aportes.add(p);
         }
         
         cn.cierraConexion( con );
        }
         catch( Exception e ) {
             e.printStackTrace();
         }
        finally {
            return Aportes;
        }
    }
     public Aporte getDetallesAporte(Integer idp){
        
        //Validaciones    
        Aporte a = null;
        try {             
         Connection con = cn.getConexion();
         // Instrucci�n SQL para obtener los datos
         // del usuario indicado :
         String query = "SELECT titulo,descripcion,fecha,calificacion,creativo.nombre,idProblema FROM aporte JOIN creativo ON aporte.idCreativo = creativo.idCreativo WHERE aporte.idProblema ='"+idp+"'";
         Statement st = con.createStatement();
         ResultSet rs = st.executeQuery( query );
         rs.next();
             String titulo = rs.getString("titulo");
             String autor = rs.getString("creativo.nombre");
             String descripcion = rs.getString("descripcion");
             Integer idA = rs.getInt("idProblema");
             Integer calif = rs.getInt("calificacion");
             String fe = rs.getString("fecha");
             
             a = new Aporte(titulo,autor,descripcion,idA,calif,fe);
             cn.cierraConexion( con );
             return a;

        }
         catch( Exception e ) {
             e.printStackTrace();
         }
        finally {
            return a;
        }
    }
     public boolean setCalificacion(Integer id, Integer c){
        
        //Validaciones
                boolean estado = false;
        try {
         Connection con = cn.getConexion();
         // Instrucci�n SQL para obtener los datos
         // del usuario indicado :
         String query = "UPDATE aporte SET calificacion = '"+c+"' WHERE idAporte = "+id;
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
