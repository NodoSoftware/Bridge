/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Salvador
 */
public class Conexion {
    private String driver;
    private String cadenaCon;
    private String userName;
    private String password;

    public Conexion() {
        driver ="com.mysql.jdbc.Driver";
        cadenaCon = "jdbc:mysql://localhost:3306/nodo";
        userName = "root";
        password = "nodo";
    }
    
    public Connection getConexion() throws ClassNotFoundException {
        Connection cn;
        try {
            Class.forName(driver);
            cn = DriverManager.getConnection(cadenaCon, userName, password);
            return cn;
        } catch (SQLException ex) {
            System.out.println("error: " + ex);
            return null;
        }
    }
    
    public void cierraConexion( Connection cn ) {
        try {
              if( cn != null && ! cn.isClosed() ) {
                  cn.close();
               }
            }
         catch( SQLException e ) {
            e.printStackTrace();
         }
    }
}
