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
 * @author sango
 */
public class Problema {
    
    Conexion cn;
    
    public Problema(){
        cn = new Conexion();
    }
    
    public boolean newProblema(String titulo, String descripcion, String fechaI, String fechaF,Integer idp){
        
        //Validaciones
                boolean estado = false;
        try {
         Connection con = cn.getConexion();
         // Instrucci�n SQL para obtener los datos
         // del usuario indicado :
         String query = "insert into problema (titulo,descripcion,fechaInicio,fechaLimite,idProblematicoFK ) values("+titulo+","+descripcion+","+fechaI+","+fechaF+","+idp+")";
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
