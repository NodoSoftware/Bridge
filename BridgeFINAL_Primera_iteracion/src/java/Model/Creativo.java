/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Javier
 */
public class Creativo {
    
    int idCreativo;
    String nombre;
    String carrera;
    String correo;
    String telefono;
    String fechaNac;
    String con;
    public Creativo (int id, String n, String ca, String c, String tel, String fNac) {
        idCreativo = id;
        nombre = n;
        carrera = ca;
        correo = c;
        telefono = tel;
        fechaNac = fNac;

    }
}
