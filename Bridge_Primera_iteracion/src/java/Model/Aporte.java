/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *Clase principal que se encarga de la administracion de un Aporte
 * @author drosas
 * @version 1.0 14/10/13
 */

public class Aporte {
    Conexion cn;
    
    public Aporte(){
        cn = new Conexion();
    }
    
    
    public boolean newAporte(Integer idCreativo, Integer idProblema, String titulo, String descripcion,Integer costo, String fecha){
        //Validaciones
                boolean estado;
        estado = false;
        try {
         Connection con = cn.getConexion();
         // Instrucci�n SQL para obtener los datos
         // del usuario indicado :
         String query =  "INSERT INTO aporte(idAporte,titulo,descripcion,costo,fecha,idProblemaFK,idCreativoFK) VALUES("+titulo+","+descripcion+","+costo+","+fecha+","+idCreativo+","+idProblema+")";
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
    
    //
    
    public boolean updateAporte(Integer idCreativo, Integer idProblema, String titulo, String descripcion,Integer costo, String fecha){
        //Validaciones
                boolean estado;
        estado = false;
        try {
         Connection con = cn.getConexion();
         // Instrucci�n SQL para obtener los datos
         // del usuario indicado :
         String query =  "INSERT INTO aporte(idAporte,titulo,descripcion,costo,fecha,idProblemaFK,idCreativoFK) VALUES("+titulo+","+descripcion+","+costo+","+fecha+","+idCreativo+","+idProblema+")";
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
