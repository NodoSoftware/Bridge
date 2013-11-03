/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Javier
 */
public class Problematico {
    
    int idProblematico;
    String nombre;
    String empresa;
    String correo;
    String telefono;
    String fechaNac;   
    
    public Problematico (int id, String n, String e, String c, String tel, String fNac) {
        idProblematico = id;
        nombre = n;
        empresa = e;
        correo = c;
        telefono = tel;
        fechaNac = fNac;
    }
    
}
