/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Javier
 */
public class Problematico {
    
    Conexion cn;
    
    public Problematico () {
        cn = new Conexion();
    }    
    
    public boolean newProblematico(String nombre, String empresa, String correo, String telefono, String fechaNac, String contrasenia){
        boolean estado = false;
        
        try {
         Connection con = cn.getConexion();
         // Instrucci�n SQL para obtener los datos
         // del usuario indicado :
         String query = "INSERT INTO PROBLEMATICO (nombre, empresa, correo, telefono, fechaNac, contrasenia) VALUES ("+nombre+", "+empresa+","+correo+","+telefono+","+fechaNac+","+contrasenia+");";
         Statement st = con.createStatement();
         ResultSet rs = st.executeQuery( query );
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
    
    public boolean deleteProblematico(Integer id){
        boolean estado = false;
        
        try {
         Connection con = cn.getConexion();
         // Instrucci�n SQL para obtener los datos
         // del usuario indicado :
         String query = "delete from problematico where idProblematico="+id;
         Statement st = con.createStatement();
         ResultSet rs = st.executeQuery( query );
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

    public boolean updateProblematico(String nombre, String empresa, String correo, String telefono, String fechaNac, int id){
        boolean estado = false;
        
        try {
         Connection con = cn.getConexion();
         // Instrucci�n SQL para obtener los datos
         // del usuario indicado :
         String query = "UPDATE PROBLEMATICO SET nombre = "+nombre+", empresa = "+empresa+", correo = "+correo+", telefono = "+telefono+", fechaNac = "+fechaNac+" where idpoblematico = " +id;
         Statement st = con.createStatement();
         ResultSet rs = st.executeQuery( query );
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
