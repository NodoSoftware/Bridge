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
public class CreativoBD {

    Conexion cn;

    public CreativoBD() {
        cn = new Conexion();
    }

    public boolean newCreativo(String nombre, String carrera, String correo, String telefono, String fechaNac, String contrasenia) {
        boolean estado = false;

        try {
            Connection con = cn.getConexion();
            // Instrucci�n SQL para obtener los datos
            // del usuario indicado :
            String consulta = "SELECT * FROM problematico WHERE correo = '" + correo + "'";
            Statement st1 = con.createStatement();
            ResultSet rs1 = st1.executeQuery(consulta);
            if (rs1.next()) {
                return estado;
            } else {
                String query = "INSERT INTO creativo (nombre, carrera, correo, telefono, fechaNac, contrasenia) VALUES ('" + nombre + "','" + carrera + "','" + correo + "','" + telefono + "','" + fechaNac + "','" + contrasenia + "');";
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

    public boolean deleteCreativo(Integer id) {
        boolean estado = false;

        try {
            Connection con = cn.getConexion();
            // Instrucci�n SQL para obtener los datos
            // del usuario indicado :
            String query = "DELETE FROM creativo WHERE idCreativo=" + id;
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

    public boolean updateCreativo(String nombre, String carrera, String correo, String telefono, String fechaNac, int id) {
        boolean estado = false;

        try {
            Connection con = cn.getConexion();
            // Instrucci�n SQL para obtener los datos
            // del usuario indicado :
            String query = "UPDATE creativo SET nombre = '" + nombre + "', carrera = '" + carrera + "', correo = '" + correo + "', telefono = '" + telefono + "', fechaNac = '" + fechaNac + "' where idCreativo = " + id;
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

    public Creativo getDetallesCreativo(Integer idc) {

        //Validaciones    
        Creativo c = null;
        try {
            Connection con = cn.getConexion();
            // Instrucci�n SQL para obtener los datos
            // del usuario indicado :

            String query = "SELECT nombre,carrera,correo,fechaNac,telefono,idCreativo FROM creativo WHERE idCreativo = "+ idc;
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            rs.next();
            Integer id = rs.getInt("idCreativo");
            String n = rs.getString("nombre");
            String ca = rs.getString("carrera");
            String co = rs.getString("correo");
            String f = rs.getString("fechaNac");
            String t = rs.getString("telefono");

            c = new Creativo(id, n, ca, co, t, f);
            cn.cierraConexion(con);
            return c;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return c;
        }
    }
}
