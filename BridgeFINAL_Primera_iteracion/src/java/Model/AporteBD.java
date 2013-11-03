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

/*
 * @author drosas
 */
public class AporteBD {
    Conexion cn;
    
    public AporteBD(){
        cn = new Conexion();
    }
    
    public boolean newAporte(String titulo, String fecha, String descripcion,String costo,Integer idCreativo, Integer idProblema){
        //Validaciones
                boolean estado;
        estado = false;
        try {
         Connection con = cn.getConexion();
         // Instrucci�n SQL para obtener los datos
         // del usuario indicado :
         String query = "INSERT INTO aporte(titulo,descripcion,costo,fecha,idProblemaFK,idCreativoFK) values('"+titulo+"','"+descripcion+"','"+costo+"','"+fecha+"','"+idCreativo+"','"+idProblema+"')";
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
    public boolean updateAporte(String titulo, String descripcion, String costo,Integer id){
        
        //Validaciones
                boolean estado = false;
        try {
         Connection con = cn.getConexion();
         // Instrucci�n SQL para obtener los datos
         // del usuario indicado :
         String query = "UPDATE aporte SET titulo = '"+titulo+"', descripcion = '"+descripcion+"', costo = '"+costo+"' WHERE idAporte = "+id;
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
    public boolean deleteAporte(Integer id){
        
        //Validaciones
                boolean estado = false;
        try {
         Connection con = cn.getConexion();
         // Instrucci�n SQL para obtener los datos
         // del usuario indicado :
         String query = "DELETE FROM aporte WHERE idAporte ="+id;
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
    
    
     public List<Aporte> getListaAportes(Integer idp){
        
        //Validaciones
         List<Aporte> Aportes = null;  
        try {
          
         Aportes = new ArrayList<>();
         Connection con = cn.getConexion();
         // Instrucci�n SQL para obtener los datos
         // del usuario indicado :
         String query2 = "SELECT idAporteFinalFK FROM problema WHERE idProblema ='"+idp+"'";
         Statement st2 = con.createStatement();
         ResultSet rs2 = st2.executeQuery( query2 );
         rs2.next();
         Integer idA = rs2.getInt("idAporteFinalFK");
         if(rs2.wasNull()){
                idA = -1;
             }else{
                idA = rs2.getInt("idAporteFinalFK"); 
             }
         rs2.close();
         cn.cierraConexion(con);
         con = cn.getConexion();
         String query = "SELECT titulo,descripcion,idAporte,calificacion FROM aporte WHERE idProblemaFK ='"+idp+"'";
         Statement st = con.createStatement();
         ResultSet rs = st.executeQuery( query );
         
         while(rs.next()){
             String titulo = rs.getString("titulo");
             String descripcion = rs.getString("descripcion");
             Integer id = rs.getInt("idAporte");  
             Integer calif = rs.getInt("calificacion");

             Aporte p = new Aporte(titulo,descripcion,id,calif,idA);
             Aportes.add(p);
         }
         rs.close();
         cn.cierraConexion( con );
        }
         catch( Exception e ) {
             e.printStackTrace();
         }
        finally {
            return Aportes;
        }
    }
     
     public Aporte getDetallesAporteC(Integer ida){
        
        //Validaciones    
        Aporte a = null;
        try {             
         Connection con = cn.getConexion();
         // Instrucci�n SQL para obtener los datos
         // del usuario indicado :
         String query = "SELECT aporte.titulo,fecha,aporte.descripcion,costo,idAporte,problema.titulo FROM aporte JOIN problema ON idProblemaFK = idProblema WHERE idAporte='"+ida+"'";
         Statement st = con.createStatement();
         ResultSet rs = st.executeQuery( query );
         rs.next();
             String titulo = rs.getString("aporte.titulo");
             String descripcion = rs.getString("aporte.descripcion");
             Integer id = rs.getInt("idAporte");
             String f = rs.getString("fecha");
             String c = rs.getString("costo");
             String p = rs.getString("problema.titulo");
                   
             a = new Aporte(titulo,f,descripcion,c,id,p);
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
     
      public List<Aporte> getListaAportesC(Integer idc){
        
        //Validaciones
         List<Aporte> Aportes = null;  
        try {
          
         Aportes = new ArrayList<>();
         Connection con = cn.getConexion();
         // Instrucci�n SQL para obtener los datos
         // del usuario indicado :
         String query = "SELECT titulo,descripcion,idAporte FROM aporte WHERE idCreativoFK ='"+idc+"'";
         Statement st = con.createStatement();
         ResultSet rs = st.executeQuery( query );
         while(rs.next()){
             String titulo = rs.getString("titulo");
             String descripcion = rs.getString("descripcion");
             Integer id = rs.getInt("idAporte");
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
         String query = "SELECT titulo,descripcion,fecha,calificacion,creativo.nombre,idAporte,costo FROM aporte JOIN creativo ON aporte.idCreativoFK = creativo.idCreativo WHERE aporte.idAporte ="+idp+"";
         Statement st = con.createStatement();
         ResultSet rs = st.executeQuery( query );
         
         if(rs.next()){
            String titulo = rs.getString("titulo");
             String autor = rs.getString("creativo.nombre");
             String descripcion = rs.getString("descripcion");
             Integer idA = rs.getInt("idAporte");
             Integer calif = rs.getInt("calificacion");
             String fe = rs.getString("fecha");
             String co = rs.getString("costo");
             a = new Aporte(titulo,autor,descripcion,idA,calif,fe,co);
             
         }  
         rs.close();
         cn.cierraConexion( con ); 
        }
         catch( Exception e ) {
             e.printStackTrace();
         }
        finally {
            return a;
        }
    }
     public boolean likeAporte(Integer id){
        
        //Validaciones
                boolean estado = false;
        try {
         Connection con = cn.getConexion();
         // Instrucci�n SQL para obtener los datos
         // del usuario indicado :
         String query = "UPDATE aporte SET calificacion = '"+1+"' WHERE idAporte = "+id;
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
     public boolean unlikeAporte(Integer id){
        
        //Validaciones
                boolean estado = false;
        try {
         Connection con = cn.getConexion();
         // Instrucci�n SQL para obtener los datos
         // del usuario indicado :
         String query = "UPDATE aporte SET calificacion = '"+0+"' WHERE idAporte = "+id;
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
