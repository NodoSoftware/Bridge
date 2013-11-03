/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Problematico;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Javier
 */
public class ProblematicoBD {

    Conexion cn;

    public ProblematicoBD() {
        cn = new Conexion();
    }

    public boolean newProblematico(String nombre, String empresa, String correo, String telefono, String fechaNac, String contrasenia) {
        boolean estado = false;

        try {
            Connection con = cn.getConexion();
            // Instrucci�n SQL para obtener los datos
            // del usuario indicado :
            String consulta = "SELECT * FROM creativo WHERE correo = '" + correo + "'";
            Statement st1 = con.createStatement();
            ResultSet rs1 = st1.executeQuery(consulta);
            if (rs1.next()) {
                return estado;
            } else {
                String query = "INSERT INTO problematico (nombre, empresa, correo, telefono, fechaNac, contrasenia) VALUES ('" + nombre + "', '" + empresa + "','" + correo + "','" + telefono + "','" + fechaNac + "','" + contrasenia + "')";
                Statement st = con.createStatement();
                st.executeUpdate(query);
                estado = true;
                cn.cierraConexion(con);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return estado;
        }
    }

    public boolean deleteProblematico(Integer id) {
        boolean estado = false;

        try {
            Connection con = cn.getConexion();
            // Instrucci�n SQL para obtener los datos
            // del usuario indicado :
            String query = "delete from problematico where idProblematico=" + id;
            Statement st = con.createStatement();
            st.executeUpdate(query);
            estado = true;
            cn.cierraConexion(con);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return estado;
        }
    }

    public boolean updateProblematico(String nombre, String empresa, String correo, String telefono, String fechaNac, int id) {
        boolean estado = false;

        try {
            Connection con = cn.getConexion();
            // Instrucci�n SQL para obtener los datos
            // del usuario indicado :
            String query = "UPDATE problematico SET nombre = '" + nombre + "', empresa = '" + empresa + "', correo = '" + correo + "', telefono = '" + telefono + "', fechaNac = '" + fechaNac + "' where idproblematico = " + id;
            Statement st = con.createStatement();
            st.executeUpdate(query);
            estado = true;
            cn.cierraConexion(con);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return estado;
        }
    }

    public int login(String correo, String contrasenia) {
        int estado = 0;
        try {
            Connection con = cn.getConexion();
            // Instrucci�n SQL para obtener los datos
            // del usuario indicado :
            String query = "SELECT * FROM problematico WHERE correo = '" + correo + "' and contrasenia = '" + contrasenia + "'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            if (rs.first()) {
                estado = 100 + rs.getInt("idProblematico");
            } else {
                String query2 = "SELECT * FROM creativo WHERE correo = '" + correo + "' and contrasenia = '" + contrasenia + "'";
                Statement st2 = con.createStatement();
                ResultSet rs2 = st2.executeQuery(query2);
                if (rs2.first()) {
                    estado = -100 - rs2.getInt("idCreativo");
                } else {
                    estado = 0;
                }
            }
            cn.cierraConexion(con);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return estado;
        }
    }
    
    public Problematico getDetallesProblematico(Integer idp){
        
        //Validaciones    
        Problematico p = null;
        try {             
         Connection con = cn.getConexion();
         // Instrucci�n SQL para obtener los datos
         // del usuario indicado :

         String query = "SELECT nombre,empresa,correo,fechaNac,telefono,idProblematico FROM problematico WHERE idProblematico ="+idp;
         Statement st = con.createStatement();
         ResultSet rs = st.executeQuery( query );
         rs.next();
             Integer id = rs.getInt("idProblematico");
             String n = rs.getString("nombre");
             String e = rs.getString("empresa");
             String c = rs.getString("correo");
             String f = rs.getString("fechaNac");
             String t = rs.getString("telefono");
             
             p = new Problematico(id,n,e,c,t,f);
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

}
