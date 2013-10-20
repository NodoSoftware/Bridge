/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Deus Ex Machina
 */
public class Aporte {
    
    String titulo;
    String autor;
    String descripcion;   
    Integer idAporte;   
    String f;
    Integer costo;
    Integer calificacion;
    
    public Aporte(String t,String d,Integer id){
        titulo = t;
        descripcion=d;
        idAporte=id;
    }
    public Aporte(String t,String a,String d,Integer id,Integer c, String fe){
        titulo = t;
        autor=a;
        descripcion=d;
        idAporte=id;
        costo = c;
        f=fe;
       
    }
    public String getTitulo(){
        return this.titulo;
    }
    public String getDesc(){
        return this.descripcion;
    }
 
    public Integer getidA(){
        return this.idAporte;
    }
    public String getFecha(){
        return this.f;
    }
    public String getCalificacion(){
        return this.f;
    }
    public Integer getCosto(){
        return this.costo;
    }
    
}
